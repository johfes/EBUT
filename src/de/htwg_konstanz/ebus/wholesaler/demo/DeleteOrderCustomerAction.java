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

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOOrderCustomer;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.OrderBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.security.Security;
import de.htwg_konstanz.ebus.wholesaler.demo.util.Constants;

/**
* The ProductListAction loads all available products from the database.<p>
* After loading, the action puts all products into an List-Object and makes them 
* available for the corresponding view (JSP-Page) via the HTTPSession.  
*
* @author tdi
*/
public class DeleteOrderCustomerAction implements IAction
{
	public DeleteOrderCustomerAction()
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

				// find the order purchase by the given order number and put it to the session
				BOOrderCustomer boOrderCustomer = OrderBOA.getInstance().findOrderCustomer(orderId);           
				OrderBOA.getInstance().deleteOrderCustomer(boOrderCustomer);

				if(boOrderCustomer != null)
				{
					errorList.add("Order has been deleted: " + orderId);
				}
				else
					errorList.add("Order cannot be found: " + orderId);
				
				// redirect to the product page
				return response.encodeURL("controllerservlet?action="+Constants.ACTION_SHOW_ORDER_LIST);
			}
			else
			{
				// authorization failed -> show error message
				errorList.add("Your are not allowed to perform this action");
				
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
		return actionName.equalsIgnoreCase(Constants.ACTION_DELETE_ORDER_CUSTOMER);
	}
}
