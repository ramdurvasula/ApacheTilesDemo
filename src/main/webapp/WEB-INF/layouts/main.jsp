<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
    <title> Spring Boot with Apache Tiles</title>
	<link href="resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="resources/css/common.css" rel="stylesheet">
</head>
<body>
	<div class="servletContext">
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
	</div>
	<input type="hidden" id="contextPath" value="${pageContext.request.contextPath}"/>
    <script src="resources/js/jquery-3.3.1.js"></script>
    <script src="resources/js/popper.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/common.js"></script>
</body>
</html>