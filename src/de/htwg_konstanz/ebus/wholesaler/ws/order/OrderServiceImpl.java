package de.htwg_konstanz.ebus.wholesaler.ws.order;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.*;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.*;

@javax.jws.WebService(endpointInterface = "de.htwg_konstanz.ebus.wholesaler.ws.order.OrderServicePortType")
public class OrderServiceImpl
{
   public OrderServiceResponse purchaseOrder(de.htwg_konstanz.ebus.wholesaler.ws.order.OrderServiceRequest request) throws OrderServiceFault
   {
      String faultInfo = null;
      
      BOCustomer boCustomer = CustomerBOA.getInstance().findCustomerByWsUserName(request.getUserName());

      // Check authentication
      if(boCustomer != null)
      {
         if(!boCustomer.getWsPassword().equals(request.getPassword()))
            faultInfo = "Passwort ist nicht korrekt!";
      } 
      else
         faultInfo = "Benutzername ist nicht korrekt!";

      if (faultInfo != null)
         throw new OrderServiceFault("Die Web Service Authentisierung ist fehlgeschlagen!", faultInfo);

      OrderServiceResponse res = null;
      BOOrderCustomer boOrderCustomer = null;
      
      try
      {
         ORDER order = request.getORDER();
         ORDERRESPONSE orderResponse = new ORDERRESPONSE();
         res = new OrderServiceResponse();

         // Generate order response   
         orderResponse.setVersion("1.0");
         ORDERRESPONSEHEADER orderResponseHeader = new ORDERRESPONSEHEADER();
         
         CONTROLINFO info = order.getORDERHEADER().getCONTROLINFO();
         info.setGENERATIONDATE(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date()));
         info.setGENERATORINFO("wholesaler_demo");
         orderResponseHeader.setCONTROLINFO(info);
         
         SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
         String orderId = "OID-" + simpleDateFormat.format(new Date()) + "-" + order.getORDERHEADER().getORDERINFO().getORDERID();
         ORDERRESPONSEINFO orderResponseInfo = new ORDERRESPONSEINFO();
         orderResponseInfo.setORDERDATE(order.getORDERHEADER().getORDERINFO().getORDERDATE());
         orderResponseInfo.setORDERID(orderId);
         orderResponseInfo.setORDERPARTIES(order.getORDERHEADER().getORDERINFO().getORDERPARTIES());
         orderResponseInfo.setORDERRESPONSEDATE(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date()));
         orderResponseInfo.setPRICECURRENCY(order.getORDERHEADER().getORDERINFO().getPRICECURRENCY());
         orderResponseHeader.setORDERRESPONSEINFO(orderResponseInfo);
         orderResponse.setORDERRESPONSEHEADER(orderResponseHeader);
         
         // Load wholesaler properties
         Properties properties = new Properties();
         properties.load(getClass().getResourceAsStream("/wholesaler.properties"));

         // Validate against opentrans XML schema
         SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
         Schema schema = sf.newSchema(new URL(properties.getProperty("OPENTRANS_SCHEMA_URL")));
         
         // todo: Create th8e XML document of the order (marshall)         
         JAXBContext context = JAXBContext.newInstance(ORDER.class);
         
         // marshalling order
         Marshaller m = context.createMarshaller();
         m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
         m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");         
         
         // validation
         m.setSchema(schema);

         // Write the XML file into the byte array output stream
         ByteArrayOutputStream os = new ByteArrayOutputStream();
         m.marshal(order, os);        
         
         String orderNumberCustomer = order.getORDERHEADER().getORDERINFO().getORDERID();

         // build the Order Customer
         // set common attributes
         boOrderCustomer = new BOOrderCustomer();
         boOrderCustomer.setOrderNumber(String.valueOf(System.currentTimeMillis())+"-"+orderNumberCustomer);
         boOrderCustomer.setOrderNumberCustomer(orderNumberCustomer);
         boOrderCustomer.setOrderDate(new Date());
         boOrderCustomer.setXmlFileRequest(os.toByteArray());
         
         // check currency (we support only EUR)
         BOCurrency boCurrency = CurrencyBOA.getInstance().findCurrency(order.getORDERHEADER().getORDERINFO().getPRICECURRENCY().value());
         if(boCurrency != null)
         { 
        	if(!boCurrency.getCode().equalsIgnoreCase("EUR"))
        		throw new OrderServiceFault("Die angegebene Währung wird nicht unterstützt! Dieses System unterstützt derzeit nur EUR als Währung!", boCurrency.getCode());
         }
         else
       		throw new OrderServiceFault("Es wurde keine bzw. eine ungültige Währung angegeben!", "");
        	 
         boOrderCustomer.setCurrency(boCurrency);
         boOrderCustomer.setCustomer(boCustomer);
         
         BOAddress boAddress = boCustomer.getAddress();
         boOrderCustomer.setInvoiceAddress(boAddress);
         boOrderCustomer.setDeliveryAddress(boAddress);

         boOrderCustomer.setTotalLineItems(0);
         boOrderCustomer.setInternationalrestrictions("EU only");
         boOrderCustomer.setOrdertype("standard");
         boOrderCustomer.setPartialshipment(0);
         boOrderCustomer.setRemark("test order");
         boOrderCustomer.setSpecialtreatment("keep try and clean");
         boOrderCustomer.setTransport("any");
         OrderBOA.getInstance().saveOrUpdate(boOrderCustomer);

         // set initial values
         BigDecimal priceTotalNet = new BigDecimal(0);
         BigDecimal priceTotalGross = new BigDecimal(0);
         Integer lineItemNumber = 0;
         
         // --------- iterate over the line items (Products) start ---------
         ORDERRESPONSEITEMLIST orderResponseItemList = new ORDERRESPONSEITEMLIST();
         for(ORDERITEM orderItem : order.getORDERITEMLIST().getORDERITEM())
         {
            ORDERRESPONSEITEM orderResponseItem = new ORDERRESPONSEITEM();
            orderResponseItem.setARTICLEID(orderItem.getARTICLEID());
            orderResponseItem.setARTICLEPRICE(orderItem.getARTICLEPRICE());
            orderResponseItem.setLINEITEMID(orderItem.getLINEITEMID());
            orderResponseItem.setORDERUNIT(orderItem.getORDERUNIT());
            
            BOProduct boProduct = ProductBOA.getInstance().findByOrderNumberCustomer(orderItem.getARTICLEID().getSUPPLIERAID());
            if(boProduct != null)
            {
               if(InventoryBOA.getInstance().checkInventoryAmount(boProduct, orderItem.getQUANTITY().intValue()))         
                  orderResponseItem.setQUANTITY(orderItem.getQUANTITY());
               else
               {
                  orderResponseItem.setQUANTITY(BigDecimal.ZERO);
               }

               lineItemNumber++;
               BOSalesPrice boSalesPrice = boProduct.getDefaultSalesPrice();
              
               BOOrderItemCustomer oic = new BOOrderItemCustomer();
               oic.setOrderCustomer(boOrderCustomer);
               oic.setOrderItemNumber(lineItemNumber);
               oic.setOrderUnit("C62");
               oic.setOrderNumberCustomer(boProduct.getOrderNumberCustomer());
               oic.setItemNetPrice(boSalesPrice.getAmount());
               oic.setUnitNetPrice(boSalesPrice.getAmount());
               oic.setPricetype(boSalesPrice.getPricetype());
               
               oic.setOrderAmount(orderItem.getQUANTITY().intValue());
               oic.setInternationalrestrictions("EU only");
               oic.setPartialshipment(0);
               oic.setRemark("test order");
               oic.setSpecialtreatment("keep try and clean");
               oic.setTransport("any");
               oic.setDeliveryAddress(boCustomer.getAddress());

               // calculate for later use (summary)
			   BigDecimal itemNetPrice = boSalesPrice.getAmount();
			   BigDecimal itemTaxRate = boSalesPrice.getTaxrate();
			   BigDecimal orderAmount = orderItem.getQUANTITY();
			   
			   BigDecimal lineItemNetSum = itemNetPrice.multiply(orderAmount);
			   BigDecimal lineItemGrossSum = lineItemNetSum.add(lineItemNetSum.multiply(itemTaxRate));
					
			   priceTotalNet = priceTotalNet.add(lineItemNetSum);
			   priceTotalGross = priceTotalGross.add(lineItemGrossSum);

               oic.setTaxRate(itemTaxRate);
               oic.setProductDescription(boProduct.getShortDescription() + " - " + boProduct.getLongDescription());	                             
               
               // persist the order item
               OrderItemBOA.getInstance().saveOrUpdateOrderItemCustomer(oic);
            }
            else
            {
            	// fault implementation: product not found
            	orderResponseItem.setQUANTITY(BigDecimal.ZERO); 
      
            	REMARK remark = new REMARK();
            	remark.setValue("Produkt nicht gefunden!");
            	orderResponseItem.getREMARK().add(remark);

            	throw new OrderServiceFault("Die Bestellung kann nicht ausgeführt werden! Das Produkt ist nicht vorhanden: " + orderItem.getARTICLEID().getSUPPLIERAID(), "Die Bestellung kann nicht ausgeführt werden!");
            }
            
            orderResponseItemList.getORDERRESPONSEITEM().add(orderResponseItem);
         }         
         // --------- iterate over the line items (Products) end ---------
         
         boOrderCustomer.setTotalLineItems(order.getORDERSUMMARY().getTOTALITEMNUM().intValue());
         boOrderCustomer.setPriceTotalNet(priceTotalNet);
         boOrderCustomer.setPriceTotalGross(priceTotalGross);
         boOrderCustomer.setTaxTotal(priceTotalGross.subtract(priceTotalNet));
         
         OrderBOA.getInstance().saveOrUpdate(boOrderCustomer);
                  
         orderResponse.setORDERRESPONSEITEMLIST(orderResponseItemList);

         ORDERRESPONSESUMMARY orderResponseSummary = new ORDERRESPONSESUMMARY();
         orderResponseSummary.setTOTALAMOUNT(order.getORDERSUMMARY().getTOTALAMOUNT());
         orderResponseSummary.setTOTALITEMNUM(order.getORDERSUMMARY().getTOTALITEMNUM());
         orderResponse.setORDERRESPONSESUMMARY(orderResponseSummary);

         res.setORDERRESPONSE(orderResponse);
         
         // Create the XML document of the order response (marshall)         
         JAXBContext orderResponseContext = JAXBContext.newInstance(ORDERRESPONSE.class);
         m = orderResponseContext.createMarshaller();
         m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
         m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");         
  
         // Validate against opentrans XML schema
         sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
         schema = sf.newSchema(new URL(properties.getProperty("OPENTRANS_SCHEMA_URL")));

         // Validate against opentrans XML schema
         m.setSchema(schema);

         // Write the XML file into the byte array output stream
         // flush the output stream first
         os.reset();
         m.marshal(orderResponse, os);        

         boOrderCustomer.setXmlFileResponse(os.toByteArray());
         OrderBOA.getInstance().saveOrUpdate(boOrderCustomer);
         
         _BaseBOA.getInstance().commit();
      } 
      catch (NumberFormatException e)
      {
         e.printStackTrace();
         _BaseBOA.getInstance().rollback();
         throw new OrderServiceFault("Die Bestellung kann nicht ausgeführt werden!" , e.getMessage());
      } 
      catch (MalformedURLException e)
      {
          e.printStackTrace();
          _BaseBOA.getInstance().rollback();
          throw new OrderServiceFault("Die Bestellung kann nicht ausgeführt werden!" , e.getMessage());
      } 
      catch (PropertyException e)
      {
          e.printStackTrace();
          _BaseBOA.getInstance().rollback();
          throw new OrderServiceFault("Die Bestellung kann nicht ausgeführt werden!" , e.getMessage());
      } 
      catch (IOException e)
      {
          e.printStackTrace();
          _BaseBOA.getInstance().rollback();
          throw new OrderServiceFault("Die Bestellung kann nicht ausgeführt werden!" , e.getMessage());
      } 
      catch (SAXException e)
      {
          e.printStackTrace();
          _BaseBOA.getInstance().rollback();
          throw new OrderServiceFault("Die Bestellung kann nicht ausgeführt werden!" , e.getMessage());
      } 
      catch (JAXBException e)
      {
          e.printStackTrace();
          _BaseBOA.getInstance().rollback();
          throw new OrderServiceFault("Die Bestellung kann nicht ausgeführt werden!" , e.getMessage());
      }
      
      return res;      
   }
}