/* ControllerServlet.java
***********************************************************************************
* 14.03.2007 ** tdi
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

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.htwg_konstanz.ebus.framework.wholesaler.api.boa._BaseBOA;
import de.htwg_konstanz.ebus.wholesaler.demo.util.ClassFinderUtil;
import de.htwg_konstanz.ebus.wholesaler.demo.util.Constants;

/**
* The architecture of this demo is based on the MVC2 - design pattern (Model View 
* Controller 2nd edition).<p>
* The MVC2 - Pattern is used to separate the application logic (Controller), the user
* interface (View) and the corresponding data (Model). The ControllerServlet acts as
* the controller, the JSP pages implements the view and the BO's (Business Objects) of
* the framework represents the model.<p>
* 
* <b>The main job of ControllerServlet is, to dispatch the requests and to call the corresponding
* action</b>. And at least, to display the result of the called action in the corresponding JSP page.<p>
* <table class='htmlHeader' cellspacing='10'>
* <tr><td>
* <img align='middle' hspace='2' src='{@docRoot}/resources/ControllerServletSequenz.gif' title='Table'/>
* </td></tr>
* </table><p>
* The servlet acts as a central entry point of the application. That means, all actions have to
* reference the controller servlet via URL.<p>
* <b>Example-URL: http://&lt;hostname&gt;:&lt;port&gt;/controllerservlet?action=showProductList</b>
*
* @author tdi
*/
public class ControllerServlet extends HttpServlet
{
	private static final long serialVersionUID = 2784972410457608333L;
	private static final String CONTENT_TYPE = "text/html";

	private ArrayList<String> errorList = null;
	private ArrayList<IAction> actionList = null;
	
	
	/** 
	* Initialization of variables.
	* This method is called by the servlet engine during initialization phase and is used
	* to initialize variables or to allocate ressources.
	*/
	public void init() throws ServletException
	{
		// load all classes (actions) which implement the IAction interface 
		actionList = (ArrayList<IAction>)ClassFinderUtil.findAll("de.htwg_konstanz.ebus.wholesaler.demo", IAction.class);
	}

	/** 
	* Process a HTTP Get request. 
	* The process is delegated to the method "dispatchRequest".
	* 
	* @param request the calling HTTP Request
	* @param response the corresponding HTTP Response
	*/
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		dispatchRequest(request, response);
	}

	/** 
	* Process a HTTP Post request. 
	* The process is delegated to the method "dispatchRequest".
	* 
	* @param request the calling HTTP Request
	* @param response the corresponding HTTP Response
	*/
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		dispatchRequest(request, response);
	}

	/** 
	* Process the HTTP Get and Post-/Request. 
	* This method is the main entry point of the application. It processes both types of http requests (get and post).
	* First of all the method ensures that the incoming request ist valid. This is done by inspecting the request
	* parameter "action" which contains the name of the corresponding action to be called. If there is no "ation"
	* parameter set, the request is invalid and a error message is shown. If the action parameter for example
	* contains "login" the corresponding code segment which represents the login action is executed (see section 
	* "test if login action was called").
	* 
	* @param request the calling HTTP Request
	* @param response the corresponding HTTP Response
	*/
	protected void dispatchRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// create the error list (used by error.jsp to display errors)
		// the error list is a container for any errors that occur during request processing
		errorList = new ArrayList<String>();
		
		// put the error list to the session to ensure that the list is empty and exists
		request.getSession(true).setAttribute(Constants.PARAM_ERROR_LIST, errorList);

		// get the action request parameter
		String actionParam = request.getParameter(Constants.PARAM_NAME_ACTION);

		// dispatch the action 
		if (actionParam != null)
		{			
			for (IAction action : actionList)
			{
				if (action.accepts(actionParam))
				{
					String redirectURL = action.execute(request, response, errorList);
					
					// ensure that all the performed changes in the previous action will be committed to the database
				    _BaseBOA.getInstance().commit();
					
					response.sendRedirect(response.encodeRedirectURL(redirectURL));
					
					return;
				}
			}
		}
		
		// if the request contains no action parameter or if the action parameter is invalid,
		// show an error message.
		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>ControllerServlet</title></head>");
		out.println("<body>");
		out.println("<p>No action defined, or action not supported !!!!</p>");
		out.println("</body></html>");
	}
}