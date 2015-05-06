<%@ page session="true" import="de.htwg_konstanz.ebus.framework.wholesaler.api.bo.*,de.htwg_konstanz.ebus.framework.wholesaler.api.boa.*,java.math.BigDecimal,de.htwg_konstanz.ebus.framework.wholesaler.vo.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<title>eBusiness Framework Demo - Product List</title>
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="pragma" content="no-cache">
<link rel="stylesheet" type="text/css" href="default.css">
</head>

<body>

<%@ include file="header.jsp" %>
<%@ include file="error.jsp" %>
<%@ include file="authentication.jsp" %>
<%@ include file="navigation.jspfragment" %>

<form name="loginForm" method="post" action="<%= response.encodeURL("controllerservlet") %>" >
<input type="hidden" name="action" value="<%= Constants.ACTION_UPDATE_WS_SETTINGS %>">

<% String supplierId = (String)request.getSession().getAttribute("supplierId"); %>
<% if (supplierId != null)
{%>
<%
	BOSupplier supplier = SupplierBOA.getInstance().findSupplierById((String)request.getSession().getAttribute("supplierId"));
%>
<h2>Web Service Access (ESS)</h2>
<table cellpadding="0" cellspacing="0">
<tr>
	<td class="label">Username:*</td>
	<td><input type="text" class="text" name="<%= Constants.PARAM_NAME_WS_USERNAME %>" size="50" maxlength="64" value="<%= supplier.getWsUserName() %>"></td>
</tr>
<tr>
	<td class="label">Password:*</td>
	<td><input type="text" class="text" name="<%= Constants.PARAM_NAME_WS_PASSWORD %>" size="50" maxlength="32" value="<%= supplier.getWsPassword() %>"></td>
</tr>
<tr>
	<td class="label">Product catalog endpoint:*</td>
	<td><input type="text" class="text-url" name="<%= Constants.PARAM_NAME_WS_ENDPOINT_1 %>" size="80" maxlength="256" value="<%= supplier.getWsCatalogEndpoint() %>"></td>
</tr>
<tr>
	<td class="label">Order acceptance endpoint:*</td>
	<td><input type="text" class="text-url" name="<%= Constants.PARAM_NAME_WS_ENDPOINT_2 %>" size="80" maxlength="256" value="<%= supplier.getWsOrderEndpoint() %>"></td>
</tr>
</table><br><br>     				        					        					        				        				       		        			        				        	
<% } %>

<% String customerId = (String)request.getSession().getAttribute("customerId"); %>
<% if (customerId != null)
{%>
<% BOCustomer customer = CustomerBOA.getInstance().findCustomerById((String)request.getSession().getAttribute("customerId")); %>
<h2>Web Service Zugang (EPS)</h2>
<table cellpadding="0" cellspacing="0">
<tr>
	<td class="label">Username:*</td>
	<td><input type="text" class="text" name="<%= Constants.PARAM_NAME_WS_USERNAME %>" size="50" maxlength="64" value="<%= customer.getWsUserName() %>"></td>
</tr>
<tr>
	<td class="label">Password:*</td>
	<td><input type="text" class="text" name="<%= Constants.PARAM_NAME_WS_PASSWORD %>" size="50" maxlength="32" value="<%= customer.getWsPassword() %>"></td>
</tr>
<tr>
	<td class="label">Delivery Endpoint:*</td>
	<td><input type="text" class="text-url" name="<%= Constants.PARAM_NAME_WS_ENDPOINT_1 %>" size="80" maxlength="256" value="<%= customer.getWsDeliveryEndpoint() %>"></td>
</tr>
<tr>
	<td class="label">Invoice Endpoint:*</td>
	<td><input type="text" class="text-url" name="<%= Constants.PARAM_NAME_WS_ENDPOINT_2 %>" size="80" maxlength="256" value="<%= customer.getWsInvoiceEndpoint() %>"></td>
</tr>
</table><br><br>     				        					        					        				        				       		        			        				        	
<% } %>

<input type="submit" value="Save">
</form>
<br>
</body>
</html>
