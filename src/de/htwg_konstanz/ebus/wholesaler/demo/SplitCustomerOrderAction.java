/* ProductListAction.java
***********************************************************************************
* 15.03.2007 ** tdi
* - created
*
***********************************************************************************
* Copyright 2007 HTWG Konstanz
* 
* Prof. Dr.-Ing. Juergen Waesch
* Dipl. -Inf. (FH) Thomas Dietrich
* Fakultaet Informatik - Department of Computer Science
* E-Business Technologien 
* 
* Hochschule Konstanz Technik, Wirtschaft und Gestaltung
* University of Applied Sciences
* Brauneggerstrasse 55
* D-78462 Konstanz
* 
* E-Mail: juergen.waesch(at)htwg-konstanz.de
************************************************************************************/
package de.htwg_konstanz.ebus.wholesaler.demo;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.validation.SchemaFactory;

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOOrderCustomer;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOOrderItemCustomer;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOOrderItemPurchase;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOOrderPurchase;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOProduct;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOSupplier;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.OrderBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.OrderItemBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.ProductBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa._BaseBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.security.Security;
import de.htwg_konstanz.ebus.wholesaler.demo.util.Constants;
import de.htwg_konstanz.ebus.wholesaler.ws.order.ORDER;


/**
* The ProductListAction loads all available products from the database.<p>
* After loading, the action puts all products into an List-Object and makes them 
* available for the corresponding view (JSP-Page) via the HTTPSession.  
*
* @author tdi
*/
public class SplitCustomerOrderAction implements IAction
{
	public SplitCustomerOrderAction()
	{
		super();
	}

   /**
   * The execute method is automatically called by the dispatching sequence of the {@link ControllerServlet}. 
   * 
   * @param request the HttpServletRequest-Object provided by the servlet engine
   * @param response the HttpServletResponse-Object provided by the servlet engine
   * @param errorList a Stringlist for possible error messages occured in the corresponding action
   * @return the redirection URL
   */
	public String execute(HttpServletRequest request, HttpServletResponse response, ArrayList<String> errorList)
	{
		// get the login bean from the session
		LoginBean loginBean = (LoginBean)request.getSession(true).getAttribute(Constants.PARAM_LOGIN_BEAN);

		// ensure that the user is logged in
		if (loginBean != null && loginBean.isLoggedIn())
		{
			// ensure that the user is allowed to execute this action (authorization)
			// at this time the authorization is not fully implemented.
			// -> use the "Security.RESOURCE_ALL" constant which includes all resources.
			if (Security.getInstance().isUserAllowed(loginBean.getUser(), Security.RESOURCE_ALL, Security.ACTION_READ))
			{
				// get the material number from the request
				String orderId = request.getParameter(Constants.PARAM_NAME_ORDER_ID);
				BOOrderCustomer boOrderCustomer = OrderBOA.getInstance().findOrderCustomer(orderId);
				
				if(boOrderCustomer==null)
				{
					// order not found -> show error message
				    errorList.add("Entered order number not found: " + orderId);
				
				    // redirect to calling page
					return response.encodeURL("controllerservlet?action="+Constants.ACTION_SHOW_ORDER_LIST);
				}
							
				// iterate over order customer (items) and build (split) into order purchase (items)  
				Hashtable<String, BOOrderPurchase> purchaseOrders = new Hashtable<String, BOOrderPurchase>();
				List<BOOrderItemCustomer> orderCustomerItemList = OrderItemBOA.getInstance().findAllOrderItemCustomer(boOrderCustomer);
				for(BOOrderItemCustomer boOrderItemCustomer : orderCustomerItemList) 
				{
					BOProduct boProduct = ProductBOA.getInstance().findByOrderNumberCustomer(boOrderItemCustomer.getOrderNumberCustomer());
					
					String supplierNumber = boProduct.getSupplier().getSupplierNumber();
					BOSupplier boSupplier = boProduct.getSupplier();
					BOOrderPurchase boOrderPurchase = null;

					if(purchaseOrders.containsKey(supplierNumber))
					{
						boOrderPurchase = purchaseOrders.get(supplierNumber);
					}
					else
					{
						boOrderPurchase = new BOOrderPurchase();
						boOrderPurchase.setOrderNumber("OID-"+orderId+"_SID-"+supplierNumber);
						boOrderPurchase.setSupplier(boSupplier);
						boOrderPurchase.setDeliveryAddress(boOrderCustomer.getDeliveryAddress());
						boOrderPurchase.setInvoiceAddress(boOrderCustomer.getDeliveryAddress());
						boOrderPurchase.setOrderDate(new Date());
						boOrderPurchase.setOrderNumberSupplier(boOrderCustomer.getOrderNumber());
						boOrderPurchase.setTotalLineItems(new Integer(0));
						boOrderPurchase.setCurrency(boOrderCustomer.getCurrency());

						purchaseOrders.put(supplierNumber, boOrderPurchase);
						OrderBOA.getInstance().saveOrUpdateOrderPurchase(boOrderPurchase);
					}
					
					BOOrderItemPurchase boOrderItemPurchase = new BOOrderItemPurchase();
					boOrderItemPurchase.setOrderPurchase(boOrderPurchase);
					boOrderItemPurchase.setItemNetPrice(boOrderItemCustomer.getItemNetPrice());
					boOrderItemPurchase.setUnitNetPrice(boOrderItemCustomer.getItemNetPrice());
					boOrderItemPurchase.setTaxRate(boOrderItemCustomer.getTaxRate());
					boOrderItemPurchase.setOrderAmount(boOrderItemCustomer.getOrderAmount());
					boOrderItemPurchase.setOrderItemNumber(boOrderItemCustomer.getOrderItemNumber());
					boOrderItemPurchase.setOrderNumberSupplier(boProduct.getOrderNumberSupplier());
					boOrderItemPurchase.setOrderUnit(boOrderItemCustomer.getOrderUnit());
					boOrderItemPurchase.setProductDescription(boProduct.getShortDescription());
					
					OrderItemBOA.getInstance().saveOrUpdateOrderItemPurchase(boOrderItemPurchase);
				}

				try
				{
					// Initialize marshaller 
					JAXBContext context = JAXBContext.newInstance(ORDER.class);
					Marshaller m = context.createMarshaller();
					SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
					m.setSchema(sf.newSchema(new File(request.getSession().getServletContext().getRealPath("/wsdl/") + "/openTRANS_1_0.xsd")));
					m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
					m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
					
					// calculate order sum values
					for (Iterator<BOOrderPurchase> iterator = purchaseOrders.values().iterator(); iterator.hasNext();) 
					{
						BOOrderPurchase boOrderPurchase = iterator.next();
						
						BigDecimal priceTotalNet = new BigDecimal(0);
				        BigDecimal priceTotalGross = new BigDecimal(0);
	
						List<BOOrderItemPurchase> orderPurchaseItems = OrderItemBOA.getInstance().findAllOrderItemPurchase(boOrderPurchase);
						for(BOOrderItemPurchase boOrderItemPurchase : orderPurchaseItems) 
						{
							BigDecimal itemNetPrice = boOrderItemPurchase.getItemNetPrice();
							BigDecimal itemTaxRate = boOrderItemPurchase.getTaxRate();
							Integer orderAmount = boOrderItemPurchase.getOrderAmount();
							BigDecimal lineItemNetSum = itemNetPrice.multiply(BigDecimal.valueOf(orderAmount));
							BigDecimal lineItemGrossSum = lineItemNetSum.add(lineItemNetSum.multiply(itemTaxRate));
								
							priceTotalNet = priceTotalNet.add(lineItemNetSum);
							priceTotalGross = priceTotalGross.add(lineItemGrossSum);
						}
	
						boOrderPurchase.setPriceTotalNet(priceTotalNet);
						boOrderPurchase.setPriceTotalGross(priceTotalGross);
						
						boOrderPurchase.setTaxTotal(priceTotalGross.subtract(priceTotalNet));
						boOrderPurchase.setTotalLineItems(purchaseOrders.size());	
						
						OrderBOA.getInstance().saveOrUpdateOrderPurchase(boOrderPurchase);
					}
					// order splitting end
				}
				catch(Exception e) 
				{
					e.printStackTrace();
					_BaseBOA.getInstance().rollback();
				}				
				
				boOrderCustomer.setSplitted(true);
				OrderBOA.getInstance().saveOrUpdateOrderCustomer(boOrderCustomer);
				
				// redirect to the product page
				return response.encodeURL("controllerservlet?action="+Constants.ACTION_SHOW_ORDER_LIST);
			}
			else
			{
				// authorization failed -> show error message
				errorList.add("You are not allowed to perform this action!");
			
				// redirect to the welcome page
				return "welcome.jsp";
			}
		}
		else
			// redirect to the login page
			return "login.jsp";				
	}

   /**
   * Each action itself decides if it is responsible to process the corrensponding request or not.
   * This means that the {@link ControllerServlet} will ask each action by calling this method if it
   * is able to process the incoming action request, or not.
   * 
   * @param actionName the name of the incoming action which should be processed
   * @return true if the action is responsible, else false
   */
	public boolean accepts(String actionName)
	{
		return actionName.equalsIgnoreCase(Constants.ACTION_SPLIT_CUSTOMER_ORDER);
	}
}
