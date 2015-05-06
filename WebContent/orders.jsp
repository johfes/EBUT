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
</head>

<body>

<%@ include file="header.jsp" %>
<%@ include file="error.jsp" %>
<%@ include file="authentication.jsp" %>
<%@ include file="navigation.jspfragment" %>

<h1>Orders Customer</h1>

<table class="dataTable">
<thead>
<tr>
<th><b>State</b></th>
<th><b>Order No. (intern.)</b></th>
<th><b>Order No. (customer)</b></th>
<th><b>Customer No.</b></th>
<th><b>Company</b></th>
<th><b>Date</b></th>
<th><b>Net</b></th>
<th><b>Tax</b></th>
<th><b>Gross</b></th>
<th><b>Action</b></th>
</tr>
</thead>
<tbody>
<c:forEach var="order" items="${sessionScope.orderCustomerList}">
<jsp:useBean id="order" type="de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOOrderCustomer" />
<tr>
<td align="center">
	<c:if test="${order.rejected && order.xmlFileRequest != null}">
	<img alt="Order refused" title="Order refused" border="0" src="images/warning.png" height="22" width="22">
	</c:if>
	<c:if test="${!order.rejected && order.xmlFileResponse != null}">
	<img alt="Order accepted" title="Order accepted" border="0" src="images/success.png" height="22" width="22">
	</c:if>
</td>
<td><a href="<%= response.encodeURL("controllerservlet?action="+Constants.ACTION_SHOW_ORDER_CUSTOMER_DETAIL+"&orderId="+order.getOrderNumber()) %>"><%= order.getOrderNumber() %></a></td>
<td><%= order.getOrderNumberCustomer() %></td>
<td><%= order.getCustomer().getCustomerId() %></td>
<td><%= order.getCustomer().getCompanyname() %></td>
<td><fmt:formatDate value="${order.orderDate}" dateStyle="long"/>, <fmt:formatDate value="${order.orderDate}" pattern="HH:mm:ss"/></td>
<td align="right"><fmt:formatNumber value="<%= order.getPriceTotalNet() %>" type="currency" currencySymbol="<%= order.getCurrencyCode() %>"/></td>
<td align="right"><fmt:formatNumber value="<%= order.getTaxTotal() %>" type="currency" currencySymbol="<%= order.getCurrencyCode() %>"/></td>
<td align="right"><fmt:formatNumber value="<%= order.getPriceTotalGross() %>" type="currency" currencySymbol="<%= order.getCurrencyCode() %>"/></td>
<td>
<a href="<%= response.encodeURL("controllerservlet?action="+Constants.ACTION_SHOW_ORDER_CUSTOMER_DETAIL+"&orderId="+order.getOrderNumber()) %>"><img alt="Detailview" title="Detail View" border="0" src="images/buttons/details.png"></a>&nbsp;
<%if(!order.getSplitted()){%><a href="<%= response.encodeURL("controllerservlet?action="+Constants.ACTION_SPLIT_CUSTOMER_ORDER+"&orderId="+order.getOrderNumber()) %>"><img alt="Order Split" title="Order split" border="0" src="images/buttons/order_split.png"></a>&nbsp;<%}%>
<a href="<%= response.encodeURL("controllerservlet?action="+Constants.ACTION_DELETE_ORDER_CUSTOMER+"&orderId="+order.getOrderNumber()) %>"><img alt="Delete" title="Delete" border="0" src="images/buttons/delete.png"></a></td>
</tr> 
</c:forEach>
</tbody>
</table>
<br>
<br>

<h1>Order Supplier</h1>

<table class="dataTable">
<thead>
<tr>
<th><b>State</b></th>
<th><b>Order No. (intern.)</b></th>
<th><b>Order No. (customer)</b></th>
<th><b>Customer No.</b></th>
<th><b>Company</b></th>
<th><b>Date</b></th>
<th><b>Net</b></th>
<th><b>Tax</b></th>
<th><b>Gross</b></th>
<th><b>Action</b></th>
</tr>
</thead>
<tbody>

<c:forEach var="orderPurchase" items="${sessionScope.orderPurchaseList}">
<jsp:useBean id="orderPurchase" type="de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOOrderPurchase" />
<tr>
<td align="center">
	<c:if test="${orderPurchase.rejected && orderPurchase.xmlFileRequest != null}">
	<img alt="Order refused" title="Order refused" border="0" src="images/warning.png" height="22" width="22">
	</c:if>
	<c:if test="${!orderPurchase.rejected && orderPurchase.xmlFileResponse != null}">
	<img alt="Order accepted" title="Order accepted" border="0" src="images/success.png" height="22" width="22">
	</c:if>
</td>
<td><a href="<%= response.encodeURL("controllerservlet?action="+Constants.ACTION_SHOW_ORDER_PURCHASE_DETAIL+"&orderId="+orderPurchase.getOrderNumber()) %>"><%= orderPurchase.getOrderNumber() %></a></td>
<td><%= orderPurchase.getOrderNumberSupplier() %></td>
<td><%= orderPurchase.getSupplier().getSupplierNumber() %></td>
<td><%= orderPurchase.getSupplier().getCompanyname() %></td>
<td><fmt:formatDate value="${orderPurchase.orderDate}" dateStyle="long"/>, <fmt:formatDate value="${orderPurchase.orderDate}" pattern="HH:mm:ss"/></td>
<td align="right"><fmt:formatNumber value="<%= orderPurchase.getPriceTotalNet() %>" type="currency" currencySymbol="<%= orderPurchase.getCurrencyCode() %>"/></td>
<td align="right"><fmt:formatNumber value="<%= orderPurchase.getTaxTotal() %>" type="currency" currencySymbol="<%= orderPurchase.getCurrencyCode() %>"/></td>
<td align="right"><fmt:formatNumber value="<%= orderPurchase.getPriceTotalGross() %>" type="currency" currencySymbol="<%= orderPurchase.getCurrencyCode() %>"/></td>
<td>
<a href="<%= response.encodeURL("controllerservlet?action="+Constants.ACTION_SHOW_ORDER_PURCHASE_DETAIL+"&orderId="+orderPurchase.getOrderNumber()) %>"><img alt="Detailview" title="Detail View" border="0" src="images/buttons/details.png"></a>&nbsp;
<%if(orderPurchase.getXmlFileResponse() == null){%><a href="<%= response.encodeURL("controllerservlet?action="+Constants.ACTION_PURCHASE_ORDER+"&orderId="+orderPurchase.getOrderNumber()) %>"><img alt="Order" title="Order" border="0" src="images/buttons/submit.png"></a>&nbsp;<%}%>
<a href="<%= response.encodeURL("controllerservlet?action="+Constants.ACTION_DELETE_ORDER_PURCHASE+"&orderId="+orderPurchase.getOrderNumber()) %>"><img alt="Delete" title="Delete" border="0" src="images/buttons/delete.png"></a></td>
</tr> 
</c:forEach>
</tbody>
</table>
<p><br><a href="<%= response.encodeURL("controllerservlet?action="+Constants.ACTION_SHOW_ORDER_LIST) %>"><img alt="Refresh" title="Refresh" border="0" src="images/buttons/refresh.png">&nbsp;Refresh</a></p>
</body>
</html>
