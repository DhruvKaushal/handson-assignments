<%@page import="com.hsbc.controller.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>User details page</h3>
	<h4>Hello ${userKey.username}, your phone no is ${userKey.phone}</h4>
	<hr>
	<h3>Another way to display user data</h3>
	<%
		User user = (User) session.getAttribute("userKey");
	%>
	<h4>Hello <%=user.getUsername() %>, your phone no is <%=user.getPhone() %> </h4>
</body>
</html>