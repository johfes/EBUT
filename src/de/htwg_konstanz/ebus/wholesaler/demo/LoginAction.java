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

import de.htwg_konstanz.ebus.wholesaler.demo.util.Constants;

/**
* The LoginAction processes an authentication request.<p>
* The real work of the authentication process is done by the {@link LoginBean}.  
*
* @author tdi
*/
public class LoginAction implements IAction
{
	public LoginAction()
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
		// get the loginForm values (defined in login.jsp)
		String userName = request.getParameter(Constants.PARAM_NAME_USERNAME);
		String passwd = request.getParameter(Constants.PARAM_NAME_PASSWD);
		String role = request.getParameter(Constants.PARAM_NAME_ROLE);

		// get the login bean from the session
		LoginBean loginBean = (LoginBean)request.getSession(true).getAttribute(Constants.PARAM_LOGIN_BEAN);

		if (loginBean == null)
		{
			// this is the first login request in the corresponding session. 
			// the loginBean does not exists (is null).
			// -> create the loginbean and put it into the corresponding session 
			loginBean = new LoginBean();
			request.getSession(true).setAttribute(Constants.PARAM_LOGIN_BEAN, loginBean);
		}

		// test if the userName is valid. if so, call the corresponding setter of the loginBean.
		// if not, put a error message to the errorList.
		if (userName != null && userName.length() > 0)
			loginBean.setUserName(userName);
		else
			errorList.add("Username is missing!");
		
		// test if the passwd is valid. if so, call the corresponding setter of the loginBean.
		// if not, put a error message to the errorList.
		if (passwd != null && passwd.length() > 0)
			loginBean.setPassword(passwd);
		else
			errorList.add("Password is missing!");

		// test if the role is valid. if so, call the corresponding setter of the loginBean.
		// if not, put a error message to the errorList.
		if (role != null && role.length() > 0)
			loginBean.setRole(Integer.parseInt(role));
		else
			errorList.add("Role is missing!");
		
		// process the login
		loginBean.processLogin();

		// if the login was sucessful, redirect the user to the welome page.
		// if not, put a error message to the errorList and redirect the user to the login page. 
		if (loginBean.isLoggedIn())
			return "welcome.jsp";
		else
		{
			// the user is not logged in -> show error message
			errorList.add("Login failed! Try it again!");
			
			// redirect to the login page
			return "login.jsp";
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
		return actionName.equalsIgnoreCase(Constants.ACTION_LOGIN);
	}
}
