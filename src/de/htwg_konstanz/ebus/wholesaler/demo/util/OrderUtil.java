package de.htwg_konstanz.ebus.wholesaler.demo.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOOrderItemPurchase;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOOrderPurchase;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOSupplier;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOUserInternal;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.OrderItemBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.UserBOA;
import de.htwg_konstanz.ebus.wholesaler.ws.order.*;

public class OrderUtil 
{
	/**
	 * Generates a JAXB {@link ORDER} object from a specified order.
	 * 
	 * @param order
	 *            {@link Order} object
	 * @return {@link ORDER} object
	 */
	public static ORDER generateOpenTransOrder(BOOrderPurchase boOrderPurchase) 
	{
		ORDER res = new ORDER();
		res.setType("standard");
		res.setVersion("1.0");

		// order header
		ORDERHEADER orderHeader = new ORDERHEADER();

		CONTROLINFO controlInfo = new CONTROLINFO();
		controlInfo.setGENERATIONDATE(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date()));
		controlInfo.setGENERATORINFO("wholesaler_demo");
		orderHeader.setCONTROLINFO(controlInfo);

		ORDERINFO orderInfo = new ORDERINFO();
		orderInfo.setORDERDATE(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date()));
		orderInfo.setORDERID(boOrderPurchase.getOrderNumber());
		orderInfo.setPARTIALSHIPMENTALLOWED("false");
		orderInfo.setPRICECURRENCY(DtCURRENCIES.fromValue("EUR"));
		
		ORDERPARTIES orderParties = new ORDERPARTIES();
		BUYERPARTY buyerParty = new BUYERPARTY();
		SUPPLIERPARTY supplierParty = new SUPPLIERPARTY();

		// buyer party (in this case the WHOLESALER)
		BOUserInternal boUserInternal = UserBOA.getInstance().findUserInternalById(100000000);
		PARTY partyBuyer = new PARTY();
		PARTYID buyerPartyId = new PARTYID();
		buyerPartyId.setValue("wholesaler_demo");
		partyBuyer.setPARTYID(buyerPartyId);
		ADDRESS buyerAddress = new ADDRESS();
		buyerAddress.setNAME("buyer");
		buyerAddress.setNAME(boUserInternal.getFirstname());
		buyerAddress.setNAME2(boUserInternal.getLastname());
		buyerAddress.setNAME3(boUserInternal.getLastname());
		buyerAddress.setSTREET(boUserInternal.getAddress().getStreet());
		buyerAddress.setZIP(boUserInternal.getAddress().getZipcode());
		buyerAddress.setCITY(boUserInternal.getAddress().getCity());
		buyerAddress.setCOUNTRY(boUserInternal.getAddress().getCountry().getIsocode().toUpperCase());
		buyerAddress.setEMAIL(boUserInternal.getEmail());
		partyBuyer.setADDRESS(buyerAddress);
		buyerParty.setPARTY(partyBuyer);

		// supplier party (in our case the ESS)
		BOSupplier boSupplier = boOrderPurchase.getSupplier();
		PARTY partySupplier = new PARTY();
		PARTYID supplierId = new PARTYID();
		supplierId.setValue("SUPPLIER_NR-" + boSupplier.getSupplierNumber() + "-" + boSupplier.getCompanyname());
		partySupplier.setPARTYID(supplierId);
		ADDRESS supplierAddress = new ADDRESS();
		supplierAddress.setNAME(boSupplier.getFirstname());
		supplierAddress.setNAME2(boSupplier.getLastname());
		supplierAddress.setNAME3(boSupplier.getCompanyname());
		supplierAddress.setSTREET(boSupplier.getAddress().getStreet());
		supplierAddress.setZIP(boSupplier.getAddress().getZipcode());
		supplierAddress.setCITY(boSupplier.getAddress().getCity());
		supplierAddress.setCOUNTRY(boSupplier.getAddress().getCountry().getIsocode().toUpperCase());
		supplierAddress.setEMAIL(boUserInternal.getEmail());
		partySupplier.setADDRESS(supplierAddress);
		supplierParty.setPARTY(partySupplier);

		orderParties.setBUYERPARTY(buyerParty);
		orderParties.setSUPPLIERPARTY(supplierParty);
		orderInfo.setORDERPARTIES(orderParties);
		orderHeader.setORDERINFO(orderInfo);
		res.setORDERHEADER(orderHeader);

		// order item list
		ORDERITEMLIST orderItemList = new ORDERITEMLIST();
		int lineItemCounter = 0;
		List<BOOrderItemPurchase> orderPurchaseItemList = OrderItemBOA.getInstance().findAllOrderItemPurchase(boOrderPurchase);
		for(BOOrderItemPurchase boOrderItemPurchase : orderPurchaseItemList) 
		{
			lineItemCounter++;
			
			ORDERITEM item = new ORDERITEM();
			ARTICLEID articleId = new ARTICLEID();
			articleId.setDESCRIPTIONLONG(boOrderItemPurchase.getProductDescription());
			articleId.setDESCRIPTIONSHORT(boOrderItemPurchase.getProductDescription());
			articleId.setSUPPLIERAID(boOrderItemPurchase.getOrderNumberSupplier());
			item.setARTICLEID(articleId);
			ARTICLEPRICE articlePrice = new ARTICLEPRICE();
			articlePrice.setPRICEAMOUNT(boOrderItemPurchase.getUnitNetPrice().setScale(2, BigDecimal.ROUND_HALF_UP));
			
			BigDecimal priceLineAmount = boOrderItemPurchase.getUnitNetPrice().multiply(new BigDecimal(boOrderItemPurchase.getOrderAmount())).setScale(2, BigDecimal.ROUND_HALF_UP);
			articlePrice.setPRICELINEAMOUNT(priceLineAmount);
			articlePrice.setTAX(boOrderItemPurchase.getTaxRate());
			articlePrice.setType("net_list");
			item.setARTICLEPRICE(articlePrice);
			item.setLINEITEMID(String.valueOf(lineItemCounter));
			item.setORDERUNIT(boOrderItemPurchase.getOrderUnit());
			item.setQUANTITY(new BigDecimal(boOrderItemPurchase.getOrderAmount()));
			
			orderItemList.getORDERITEM().add(item);
		}
		res.setORDERITEMLIST(orderItemList);

		// order summary
		ORDERSUMMARY orderSummary = new ORDERSUMMARY();
		orderSummary.setTOTALAMOUNT(boOrderPurchase.getPriceTotalGross().setScale(2, BigDecimal.ROUND_HALF_UP));
		orderSummary.setTOTALITEMNUM(BigInteger.valueOf(lineItemCounter));
		res.setORDERSUMMARY(orderSummary);

		return res;
	}

}
