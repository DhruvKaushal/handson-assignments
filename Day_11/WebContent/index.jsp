<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learning jsp</title>
</head>
<body>
	<h2>A Simple JSP Demo!</h2>
	<a href = "ServletDemo">ServletDemo</a>
	
	<form action = "ServletDemo" method = "GET">
		<label>
			Username <input type = "text" name = "un"><input type = "submit" value = "submit">
		</label>
	</form>
		
</body>
</html>