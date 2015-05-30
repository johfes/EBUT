package de.htwg_konstanz.ebus.wholesaler.action;


import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import de.htwg_konstanz.ebus.wholesaler.demo.IAction;
import de.htwg_konstanz.ebus.wholesaler.demo.LoginBean;
import de.htwg_konstanz.ebus.framework.wholesaler.api.security.Security;
import de.htwg_konstanz.ebus.wholesaler.demo.util.Constants;
import de.htwg_konstanz.ebus.wholesaler.main.Import;

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
	

	@Override
	public boolean accepts(String actionName) {
		return actionName.equalsIgnoreCase(Constants.ACTION_IMPORT);
	}

}
