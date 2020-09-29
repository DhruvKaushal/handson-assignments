<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome to Login Success Page</h3>
	<p>Id: ${userKey.userId}, Name : ${userKey.name}, Salary: ${userKey.salary}</p>
	<hr/>
	<a href=updatePassword.html>Update Password</a>
	<a href=searchuser.html>Search a user.</a>
	<form method="post" action="FetchUserServlet">
		<label>
			Enter User ID: <input type="text" name="un">
		</label>
		<br>
		<input type="submit" value="search">
	</form>
</body>
</html>