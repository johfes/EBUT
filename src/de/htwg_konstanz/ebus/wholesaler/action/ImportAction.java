package de.htwg_konstanz.ebus.wholesaler.action;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.htwg_konstanz.ebus.wholesaler.demo.ControllerServlet;
import de.htwg_konstanz.ebus.wholesaler.demo.IAction;
import de.htwg_konstanz.ebus.wholesaler.demo.LoginBean;
import de.htwg_konstanz.ebus.framework.wholesaler.api.security.Security;
import de.htwg_konstanz.ebus.wholesaler.demo.util.Constants;
import de.htwg_konstanz.ebus.wholesaler.main.Import;
/**
 * action for import
 * @author Johannes Fesenmeyer, Lei Xu
 *
 */
public class ImportAction implements IAction {
	
	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response, ArrayList<String> errorList) {
		//get loginBean from Session
		LoginBean loginBean = (LoginBean)request.getSession(true).getAttribute(Constants.PARAM_LOGIN_BEAN);
		
		//ensure that the user is logged in
		if (loginBean != null && loginBean.isLoggedIn()){
			//ensure that the user is authorized to execute this action ????
			if(Security.getInstance().isUserAllowed(loginBean.getUser(), Security.RESOURCE_ALL, Security.ACTION_READ)){
			
			Import upload = new Import();
			upload.importXML(request, errorList);
			return "import.jsp";
			} else {
				errorList.add("You are not allowed to perform this action");
				
				//redirect to  welcome page
				return "welcome.jsp";
			}
		} else {
			//redirect to login page
			return "login.jsp";
		}
	}
	
	/**
	 * Each action itself decides if it is responsible to process the corresponding request or not.
	 * This means that the {@link ControllerServlet} will ask each action by calling this method if it
	 * is able to process the incoming action request, or not.
	 * 
	 * @param actionName the name of the incoming action which should be processed
	 * @return true if the action is responsible, else false
	 */
	@Override
	public boolean accepts(String actionName) {
		return actionName.equalsIgnoreCase(Constants.ACTION_IMPORT);
	}

}
