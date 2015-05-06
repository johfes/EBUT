<%@ page session="true" import="de.htwg_konstanz.ebus.framework.wholesaler.api.bo.*,de.htwg_konstanz.ebus.framework.wholesaler.api.boa.*,de.htwg_konstanz.ebus.wholesaler.demo.util.Constants,java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<title>eBusiness Framework Demo - Orders</title>
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

<h1>Orders: detailed view</h1>

<c:set var="order" value="${sessionScope.orderCustomer}"/>						
<jsp:useBean id="order" type="de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOOrderCustomer" />

<table class="detail-view">
	<tr>
		<td class="label">Order No. (intern.)</td>
		<td>${order.orderNumber}</td>
	</tr>
	<tr>
		<td class="label">Order No. (customer)</td>
		<td>${order.orderNumberCustomer}</td>
	</tr>
	<tr>
		<td class="label">Customer No.</td>
		<td>${order.customer.customerId}</td>
	</tr>
	<tr>
		<td class="label">Customer</td>
		<td>${order.customer.companyname}</td>
	</tr>
	<tr>
		<td class="label">Order date</td>
		<td><fmt:formatDate value="${order.orderDate}" dateStyle="long"/>, <fmt:formatDate value="${order.orderDate}" pattern="HH:mm"/> Uhr</td>
	</tr>
	<tr>
		<td class="label">XML (EPS)</td>
		<td><a href="<%= response.encodeURL("controllerservlet?action="+Constants.ACTION_SHOW_ORDER_CUSTOMER_REQUEST_XML+"&"+Constants.PARAM_NAME_ORDER_NUMBER+"="+order.getOrderNumber()) %>" target="_blank" class="xml-file">Order</a>
			<c:if test="${order.xmlFileRequest != null}">
			,&nbsp;<a href="<%= response.encodeURL("controllerservlet?action="+Constants.ACTION_SHOW_ORDER_CUSTOMER_RESPONSE_XML+"&"+Constants.PARAM_NAME_ORDER_NUMBER+"="+order.getOrderNumber()) %>" target="_blank" class="xml-file">Order confirmation</a>
			</c:if>
		</td>
	</tr>
</table>

<table class="dataTable">
<thead>
<th><b>Amount</b></th>
<th><b>Order-No.</b></th>
<th><b>Title</b></th>
<th><b>Price net</b></th>
<th><b>Price gross</b></th>
</tr>
</thead>
<tbody>
<p></p>
<c:forEach var="item" items="${sessionScope.itemList}">
<jsp:useBean id="item" type="de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOOrderItemCustomer" />
<tr>
<td><%= item.getOrderAmount() %></td> 
<td><%= item.getOrderNumberCustomer() %></td> 
<td><%= item.getProductDescription() %></td> 
<td align="right"><fmt:formatNumber value="<%= item.getItemNetPrice() %>" type="currency" currencySymbol="<%= item.getCurrencyCode() %>"/></td> 
<td align="right"><fmt:formatNumber value="<%= item.getItemGrossPrice() %>" type="currency" currencySymbol="<%= item.getCurrencyCode() %>"/></td> 

</tr>
</c:forEach>
</tbody>
</table>
<p>
<input type=button name=go-back value=" back " onclick="javascript:history.back()">
</p>
</body>
</html>
