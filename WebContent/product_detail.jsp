<%@ page session="true" import="de.htwg_konstanz.ebus.framework.wholesaler.api.bo.*,de.htwg_konstanz.ebus.framework.wholesaler.api.boa.*,java.math.BigDecimal,de.htwg_konstanz.ebus.framework.wholesaler.vo.util.PriceUtil" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<title>eBusiness Framework Demo - Product List</title>
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="pragma" content="no-cache">
<link rel="stylesheet" type="text/css" href="default.css">
<link rel="stylesheet" type="text/css" href="layout.css">
</head>

<body>

<%@ include file="header.jsp" %>
<%@ include file="error.jsp" %>
<%@ include file="authentication.jsp" %>
<%@ include file="navigation.jspfragment" %>

<h1>Product Details</h1>

<jsp:useBean id="product" type="de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOProduct" scope="session"/>
<table class="detail-view" width="800">
<tr valign="top">
	<td class="label" width="120" align="right"><b>Order No.</b></td><td width="480"><%= product.getOrderNumberCustomer() %></td>
</tr>
<tr valign="top">
	<td class="label" align="right"><b>Title</b></td><td><%= product.getShortDescription() %></td> 
</tr>
<tr valign="top">
	<td class="label" align="right"><b>Description</b></td><td><%= product.getLongDescription() %></td> 
</tr>
<% if (product.getDefaultSalesPrice() != null) 
{ %>
<tr valign="top">
	<td class="label" align="right"><b>Price net</b></td>
	<td><fmt:formatNumber value="<%= product.getDefaultSalesPrice().getAmount() %>" type="currency" currencySymbol="<%= product.getDefaultSalesPrice().getCountry().getCurrency().getCode() %>"/>
</td>
</tr>
<% BigDecimal grossPrice = product.getDefaultSalesPrice().getAmountGross(); %>
<tr valign="top"><td class="label" align="right"><b>Price gross</b></td>
	<td><fmt:formatNumber value="<%= grossPrice %>" type="currency" currencySymbol="<%= product.getDefaultSalesPrice().getCountry().getCurrency().getCode() %>"/></td>
</tr>
<% } %>
<% BOInventory inventory = InventoryBOA.getInstance().findByProduct(product); %>
<tr valign="top">
	<td align="right" class="label"><b>Inventory</b></td><td><% if (inventory != null) 
	{ %>
	<%= inventory.getInventoryNumber() %> 
	<% } %></td>
</tr>
</table>
<p>
<input type=button name=go-back value=" Back " onclick="javascript:history.back()">
</p>
</body>
</html>
