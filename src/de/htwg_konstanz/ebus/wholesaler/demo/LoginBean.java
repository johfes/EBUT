/* LoginBean.java
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

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.IBOUser;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.UserBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.security.Security;
import de.htwg_konstanz.ebus.framework.wholesaler.vo.util.Constants;

/**
* The login bean represents the user credentials used by authentication.
* The user credentials usually consists of a login and a password.
* Additionally the login bean processes the login. This is done by calling
* the corresponding authentication method of the {@link UserBOA} object.
* 
* @author tdi
*/
public class LoginBean
{
	private IBOUser user = null;
	private String userName = "";
	private String password = "";
	private int role = Constants.USER_INTERNAL;
	private boolean loggedIn = false;

	
	public LoginBean()
	{
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getPassword()
	{
		return password;
	}

	public IBOUser getUser()
	{
		return user;
	}

	public int getRole()
	{
		return role;
	}

	public void setRole(int role)
	{
		this.role = role;
	}
	
	/**
	* This method returns the loggin status of the given user.
	* The status is automatically changed by calling the "processLogin" method.
	* The user is identified by the properties userName, password and role.
	*  
	* @return true if the user is logged in (was successfully authenticated).
	*         fasle else
	*/
	public boolean isLoggedIn()
	{
		return loggedIn;
	}

	/**
	* Call this method to process the login. Before calling this method, set the properties 
	* userName, password and role of the LoginBean using the corresponding setter methods.
	* The method sets the loggedIn status during processing. The loggedIn status can be accessed
	* by the "isLoggedIn" method.
	*/
	public void processLogin()
	{
		if (Security.getInstance().authenticateUser(userName, password, role))
		{
			user = UserBOA.getInstance().findUser(userName, role);
			loggedIn = true;
		}
		else
		{
			user = null;
			loggedIn = false;
		}
	}	
}