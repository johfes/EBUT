<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>eBusiness Framework Demo - Import</title>
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="pragma" content="no-cache">
	<link rel="stylesheet" type="text/css" href="default.css">
</head>
<body>
	<%@ include file="header.jsp" %>
	<%@ include file="error.jsp" %>
	<%@ include file="authentication.jsp" %>
	<%@ include file="navigation.jspfragment" %>
	<script type="text/javascript">
		function submitOrError(){
			if(document.getElementById("xmlFile").value !== ""){
				document.getElementById("upload").submit();
			} else {
				alert("No File selected. Please select one!");
			}	
		}
	</script>
	<h1>IMPORT Product Catalog</h1>
	<form id="upload" name="upload" action="controllerservlet?action=import" enctype="multipart/form-data" method="POST">
		<label>Selected File:</label>
		<input type="file" name="xmlFile" id="xmlFile"/>
		<br/>
		<input type="button" value="Upload" onclick="submitOrError()"/>
	</form>
</body>
</html>