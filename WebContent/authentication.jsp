<%@ page session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="loginBean" scope="session" class="de.htwg_konstanz.ebus.wholesaler.demo.LoginBean" />
<% 
   if(loginBean != null && loginBean.isLoggedIn())
   {	
%>
	Welcome <%= loginBean.getUserName() %>, you are authenticated! <a href="<%= response.encodeURL("controllerservlet?action=logout") %>">Logout</a>
<%
   }
   else
   {
%> 	      
    Authentication is missing! <br>
    Please login <a href="<%= response.encodeURL("login.jsp") %>">here</a> an.
    
    
    <jsp:forward page="login.jsp"></jsp:forward>
<%
   }
%>	
