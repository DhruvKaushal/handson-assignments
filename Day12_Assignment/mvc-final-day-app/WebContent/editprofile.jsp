<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Enter new password</h3>
	<form method="post" action="UpdatePassword">
		<input type="password" name="ps">
		<br>
		<input type="submit" value="Change Password">
	</form>
	<hr/>
	<h3>Enter new phone number</h3>
	<form  method="post" action="UpdatePhone">
		<input type="text" name="ph">
		<br>
		<input type="submit" value="Change Phone">
	</form>
</body>
</html>