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

<h1>EXPORT Product Catalog</h1>
<table>
	<tr>
		<th>By default, the whole catalog is exported.You can restrict your export by typing a string which has to be contained in the short description of the article(s) to export</th>
		<th colspan="2">View</th>
		<th colspan="2">Download</th>
	</tr>
<!-- 	<tr> -->
<!-- 		<td>whole product catalog</td> -->
<%-- 		<td><a href="<%= response.encodeURL("controllerservlet?action=export&view=BMECAT") %>">BMECAT</a> </td> --%>
<%-- 		<td><a href="<%= response.encodeURL("controllerservlet?action=export&view=XHTML") %>">XHTML</a></td> --%>
<%-- 		<td><a href="<%= response.encodeURL("controllerservlet?action=export&view=BMECAT&download=yes") %>">BMECAT</a> </td> --%>
<%-- 		<td><a href="<%= response.encodeURL("controllerservlet?action=export&view=XHTML&download=yes") %>">XHTML</a> </td> --%>
<!-- 	</tr> -->
	<tr>
	
		<td>
			<form id="searchForm" method="post" action="controllerservlet?action=export">
				<input type="hidden" name="view" id="view"/>
				<input type="hidden" name="download" id="download"/>
				<input type="text" name="search"/>			
			</form> 
		</td>
		<script>
			function submitScript(view, download) {
				document.getElementById("view").value = view;
				document.getElementById("download").value = download;
				document.getElementById("searchForm").submit();
			}
		</script>
		<td><a onclick="submitScript('BMECAT');">BMECAT</a></td>
		<td><a onclick="submitScript('XHTML');">XHTML</a></td>
		<td><a onclick="submitScript('BMECAT','yes');">BMECAT</a></td>
		<td><a onclick="submitScript('XHTML','yes');">XHTML</a></td>
	</tr>	
</table>


<p>
<input type=button name=go-back value=" back " onclick="javascript:history.back()">
</p>
</body>
</html>
