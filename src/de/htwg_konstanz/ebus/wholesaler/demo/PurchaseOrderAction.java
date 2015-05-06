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

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.validation.SchemaFactory;
import javax.xml.ws.BindingProvider;

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOOrderPurchase;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOSupplier;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.OrderBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa._BaseBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.security.Security;
import de.htwg_konstanz.ebus.wholesaler.demo.util.Constants;
import de.htwg_konstanz.ebus.wholesaler.demo.util.OrderUtil;
import de.htwg_konstanz.ebus.wholesaler.ws.order.ORDER;
import de.htwg_konstanz.ebus.wholesaler.ws.order.ORDERRESPONSE;
import de.htwg_konstanz.ebus.wholesaler.ws.order.ORDERRESPONSEITEM;
import de.htwg_konstanz.ebus.wholesaler.ws.order.OrderService;
import de.htwg_konstanz.ebus.wholesaler.ws.order.OrderServiceFault;
import de.htwg_konstanz.ebus.wholesaler.ws.order.OrderServicePortType;
import de.htwg_konstanz.ebus.wholesaler.ws.order.OrderServiceRequest;


/**
* The ProductListAction loads all available products from the database.<p>
* After loading, the action puts all products into an List-Object and makes them 
* available for the corresponding view (JSP-Page) via the HTTPSession.  
*
* @author tdi
*/
public class PurchaseOrderAction implements IAction
{
	public PurchaseOrderAction()
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
				BOOrderPurchase boOrderPurchase = OrderBOA.getInstance().findOrderPurchase(orderId);
				
				if(boOrderPurchase==null)
				{
					// order not found -> show error message
				    errorList.add("The entered order number not found: " + orderId);
				
				    // redirect to calling page
					return response.encodeURL("controllerservlet?action="+Constants.ACTION_SHOW_ORDER_LIST);
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

					// Create XML data
					ORDER order = OrderUtil.generateOpenTransOrder(boOrderPurchase); 
					ByteArrayOutputStream os = new ByteArrayOutputStream();
					m.marshal(order, os);
					boOrderPurchase.setXmlFileRequest(os.toByteArray());
					System.out.println(os.toString());
					
					OrderBOA.getInstance().saveOrUpdateOrderPurchase(boOrderPurchase);

					// call the webservice for each order
					String wsdlLocation = "file:/" + request.getSession().getServletContext().getRealPath("/wsdl/");
					purchaseOrderWs(boOrderPurchase, order, wsdlLocation);

					String msg = null;
					if(boOrderPurchase.getRejected())
					{
						msg = "<p>Die Bestellung wurde zwar erfolgreich versendet, aber vom Lieferanten abgelehnt, weil mindestens eins der bestellten Produkte nicht (mehr) verfügbar ist.<br>";
						msg += "OrderNumber: " + boOrderPurchase.getOrderNumber() + "<br>Supplier: " + boOrderPurchase.getSupplier().getCompanyname() + "</p>";
					}
					else
					{
						msg = "<p>Die Bestellung wurde erfolgreich versendet und vom Lieferanten bestätigt.<br>";
						msg += "OrderNumber: " + boOrderPurchase.getOrderNumber() + "<br>Supplier: " + boOrderPurchase.getSupplier().getCompanyname() + "</p>";
					}
						
					errorList.add(msg);
				}
				catch(Exception e) 
				{
					e.printStackTrace();
					_BaseBOA.getInstance().rollback();
				}				
							
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

	private void purchaseOrderWs(BOOrderPurchase boOrderPurchase, ORDER order, String wsdlLocation) throws Exception
	{
		BOSupplier boSupplier = boOrderPurchase.getSupplier();
		
		// Initialize web service client
		OrderService service = new OrderService(new URL(wsdlLocation + "/OrderService.wsdl"));
		OrderServicePortType port = service.getOrderServicePort();
		OrderServiceRequest orderServiceRequest = new OrderServiceRequest();
		orderServiceRequest.setUserName(boSupplier.getWsUserName());
		orderServiceRequest.setPassword(boSupplier.getWsPassword());
		
		orderServiceRequest.setORDER(order);

		// Dynamic proxy client configuration: set endpoint address
		BindingProvider bp = (BindingProvider) port;
		Map<String, Object> rc = bp.getRequestContext();
		rc.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, boSupplier.getWsOrderEndpoint());
		try 
		{
			// Invoke web service
			ORDERRESPONSE orderResponse = port.purchaseOrder(orderServiceRequest).getORDERRESPONSE();

			// Create the XML document of the order response
			JAXBContext orderResponseContext = JAXBContext.newInstance(ORDERRESPONSE.class);
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			Marshaller m = orderResponseContext.createMarshaller();

			// Validate against opentrans XML schema 
			SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			m.setSchema(sf.newSchema(new URL(wsdlLocation + "/" + Constants.XML_SCHEMA_OPENTRANS)));
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
			
			// Write the XML file into the byte array output stream
			m.marshal(orderResponse, os);
			boOrderPurchase.setXmlFileResponse(os.toByteArray());
			
			// Check if the order was rejected by the supplier
			boolean orderRejected = false;
			for(ORDERRESPONSEITEM orderResponseItem : orderResponse.getORDERRESPONSEITEMLIST().getORDERRESPONSEITEM()) 
			{
				if (orderResponseItem.getQUANTITY().intValue() == 0) 
				{					
					orderRejected = true;
					break;
				}	
			}

			boOrderPurchase.setRejected(orderRejected);
			
			OrderBOA.getInstance().saveOrUpdateOrderPurchase(boOrderPurchase);
		} 
		catch (OrderServiceFault e) 
		{
			// throw new exception with specified error message
			throw new Exception(e.getMessage());
		}
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
		return actionName.equalsIgnoreCase(Constants.ACTION_PURCHASE_ORDER);
	}
}
