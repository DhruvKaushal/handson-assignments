<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Contacts</title>
</head>
<body>
	<h3>Enter contact ID below to delete</h3>
	<form method="post" action="DeleteContactServlet">
		<input type="text" name="contId">
		<br>
		<input type="submit" value="Delete">
	</form>
</body>
</html>