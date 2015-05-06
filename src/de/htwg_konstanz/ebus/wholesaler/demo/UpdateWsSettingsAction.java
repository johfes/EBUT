/* LoginAction.java
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

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOCustomer;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOSupplier;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOUserCustomer;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOUserSupplier;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.CustomerBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.SupplierBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.UserBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.security.Security;
import de.htwg_konstanz.ebus.wholesaler.demo.util.Constants;

/**
* The LoginAction processes an authentication request.<p>
* The real work of the authentication process is done by the {@link LoginBean}.  
*
* @author tdi
*/
public class UpdateWsSettingsAction implements IAction
{
	public UpdateWsSettingsAction()
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
		LoginBean loginBean = (LoginBean)request.getSession(true).getAttribute(Constants. PARAM_LOGIN_BEAN);

		// ensure that the user is logged in
		if(loginBean != null && loginBean.isLoggedIn())
		{
			// ensure that the user is allowed to execute this action (authorization)
			// at this time the authorization is not fully implemented.
			// -> use the "Security.RESOURCE_ALL" constant which includes all resources.
			if(Security.getInstance().isUserAllowed(loginBean.getUser(), Security.RESOURCE_ALL, Security.ACTION_READ))
			{
				request.getSession(true).setAttribute(Constants.PARAM_CUSTOMER_ID, null);
				request.getSession(true).setAttribute(Constants.PARAM_SUPPLIER_ID, null);

				String actionName = (String)request.getParameter(Constants.PARAM_NAME_ACTION);
				
				// get the loginForm values (defined in login.jsp)
				String wsUserName = request.getParameter(Constants.PARAM_NAME_WS_USERNAME);
				String wsPassword = request.getParameter(Constants.PARAM_NAME_WS_PASSWORD);
				String wsEndpoint1 = request.getParameter(Constants.PARAM_NAME_WS_ENDPOINT_1);
				String wsEndpoint2 = request.getParameter(Constants.PARAM_NAME_WS_ENDPOINT_2);
				
				if(loginBean.getRole() == Constants.USER_CUSTOMER)
				{
					BOUserCustomer boUserCustomer = UserBOA.getInstance().findUserCustomerById(loginBean.getUser().getId()); 
					BOCustomer boCustomer = new BOCustomer(boUserCustomer.getUserCustomer().getCustomer());

					if(actionName != null && actionName.equalsIgnoreCase(Constants.ACTION_UPDATE_WS_SETTINGS))
					{
						boCustomer.setWsUserName(wsUserName);
						boCustomer.setWsPassword(wsPassword);
						boCustomer.setWsDeliveryEndpoint(wsEndpoint1);
						boCustomer.setWsInvoiceEndpoint(wsEndpoint2);

						CustomerBOA.getInstance().saveOrUpdate(boCustomer);
						errorList.add("Customer data has been updated!");
					}
					
					request.getSession(true).setAttribute(Constants.PARAM_CUSTOMER_ID, boCustomer.getCustomerId());

					// redirect to the settings page
					return "ws_settings.jsp";
				}
				else if(loginBean.getRole() == Constants.USER_SUPPLIER)
				{
					BOUserSupplier boUserSupplier = UserBOA.getInstance().findUserSupplierById(loginBean.getUser().getId());
					BOSupplier boSupplier = new  BOSupplier(boUserSupplier.getUserSupplier().getSupplier());
					
					if(actionName != null && actionName.equalsIgnoreCase(Constants.ACTION_UPDATE_WS_SETTINGS))
					{
						boSupplier.setWsUserName(wsUserName);
						boSupplier.setWsPassword(wsPassword);
						boSupplier.setWsCatalogEndpoint(wsEndpoint1);
						boSupplier.setWsOrderEndpoint(wsEndpoint2);

						SupplierBOA.getInstance().saveOrUpdate(boSupplier);
						errorList.add("Supplier data has been updated!");
					}
					
					request.getSession(true).setAttribute(Constants.PARAM_SUPPLIER_ID, boSupplier.getSupplierNumber());
					
					// redirect to the settings page
					return "ws_settings.jsp";
				}
				else
				{
					// authorization failed -> show error message
					errorList.add("User has to be customer or supplier!");
					
					// redirect to the welcome page
					return "welcome.jsp";
				}
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
		return actionName.equalsIgnoreCase(Constants.ACTION_READ_WS_SETTINGS) ||
			   actionName.equalsIgnoreCase(Constants.ACTION_UPDATE_WS_SETTINGS);
	}
}
