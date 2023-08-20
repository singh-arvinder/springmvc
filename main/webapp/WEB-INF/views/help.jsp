<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>

<body>
	<h1>This is help page.</h1>

	<h2>Developer's name is ${name }</h2>

	<h3>Local time: ${time }</h3>

	<hr>

	<c:forEach var="item" items="${marks }">
		<h3>${item }</h3>
	</c:forEach>

</body>

</html>