<%@ page contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" title="Default" href="highlight/styles/vs.css">
<style>
	h2 {
	  font: bold 100% Arial, sans-serif;
	  margin-top: 2em;
	  margin-bottom: 0.5em;
	}
	table {
	  width: 100%;
	}
	th {
	  width: 10em; font-weight: normal;
	}
    td {
      padding-bottom: 1em;
    }
    td, th {
      vertical-align: top;
      text-align: left;
    }
    pre {
      margin: 0;
    }
    ul#switch {
      padding: 0;
      margin: 0 0 0 -0.5em;
    }
    ul#switch li {
      border-bottom: 1px dashed blue;
      display: inline;
      padding: 0;
      margin: 0.5em;
      cursor: pointer;
    }
    ul#switch li.current {
      border-bottom: none;
      cursor: default;
    }
    .test {
      margin: 0.5em 0 0 0;
      font: medium monospace;
    }
    .test var {
      font-style: normal;
    }
    .test .passed {
      color: green;
    }
    .test .failed {
      color: red;
    }
    .code {
      font: medium monospace;
    }
    .code .keyword {
      font-weight: bold;
    }
</style>
<script src="highlight/highlight.pack.js"></script>
<script>
  hljs.tabReplace = '    ';
  hljs.initHighlightingOnLoad();
</script>
</head>
<body>
<div class="xml">
<pre>
<code>
<c:out value="${sessionScope.xmlText}"/>
</code>
</pre>
</div>
</body>
</html>