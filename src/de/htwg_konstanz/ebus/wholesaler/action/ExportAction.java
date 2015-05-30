/**
 * 
 */
package de.htwg_konstanz.ebus.wholesaler.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.htwg_konstanz.ebus.framework.wholesaler.api.security.Security;
import de.htwg_konstanz.ebus.wholesaler.demo.ControllerServlet;
import de.htwg_konstanz.ebus.wholesaler.demo.IAction;
import de.htwg_konstanz.ebus.wholesaler.demo.LoginBean;
import de.htwg_konstanz.ebus.wholesaler.demo.util.Constants;
import de.htwg_konstanz.ebus.wholesaler.main.Export;

/**
 * @author Johannes Fesenmeyer
 *
 */
public class ExportAction implements IAction {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response, ArrayList<String> errorList) {
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
				//get ServletContext for relative path
				ServletContext context = request.getSession().getServletContext();
				//get the Parameters
				String search = request.getParameter(Constants.ACTION_EXPORT_SEARCH);
				String view = request.getParameter(Constants.ACTION_EXPORT_VIEW);
				String download = request.getParameter(Constants.ACTION_EXPORT_DOWNLOAD);

				int userId=loginBean.getUser().getId();
				
				if(search == null||search==""){
					//there was no search string entered
					if("BMECAT".equals(view)){
						//User wants BMECAT
						String path = Export.writeDOMIntoFile(Export.exportWholeCatalog(errorList),context, userId, errorList);
						if(errorList.isEmpty()){
							if(("yes").equals(download)){
								downloadFile(context, path, response, errorList);
								return "export.jsp";
							}
							return path;
						}
					}
					if(("XHTML").equals(view)){
						//User wants XHTML
						String path = Export.writeDOMIntoFile(Export.exportWholeCatalog(errorList), context, userId, errorList);
						path = Export.convertToXHTML(path, context, userId, errorList);
						if(errorList.isEmpty()){
							return path;
						}
					}
				}
				else{
					//Search string was entered 
					if("BMECAT".equals(view)){
						String path = Export.writeDOMIntoFile(Export.exportSearch(errorList, search), context, userId, errorList);
						if(errorList.isEmpty()){
							if(("yes").equals(download)){
								downloadFile(context, path, response, errorList);
								return "export.jsp";
							}
							return path;
						}
					}
					if(("XHTML").equals(view)){
						String path = Export.writeDOMIntoFile(Export.exportSearch(errorList, search), context, userId, errorList);
						path = Export.convertToXHTML(path, context, userId, errorList);
						if(errorList.isEmpty()){
							return path;
						}
					}
				}
				//when there is an error in errorList or when no parameter is passed
				 return "export.jsp";
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

	public void downloadFile(ServletContext context, String path, HttpServletResponse response, ArrayList<String> errorList){
		try {
			response.setContentType("text/xml");
			response.setHeader("Content-Disposition",
			"attachment;filename=bmecat.xml");
			
			File file = new File(context.getRealPath(path));
			FileInputStream fileIn = new FileInputStream(file);
			ServletOutputStream out = response.getOutputStream();
			int bytesRead;

			byte[] bytes = new byte[4096];
			// copy binary contect to output stream
			while ((bytesRead = fileIn.read(bytes)) != -1) {
			    out.write(bytes, 0, bytesRead);
			}
			fileIn.close();
			out.flush();
			out.close();
		} catch (IOException e) {
			errorList.add("Error writing File");
			e.printStackTrace();
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
		
		return actionName.equalsIgnoreCase(Constants.ACTION_EXPORT);
	}
	

}
