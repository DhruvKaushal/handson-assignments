<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home page</title>
</head>
<body>
	<h3>Welcome to Login Success Page</h3>
	<p>Id: ${userKey.userId}, Name : ${userKey.name}, Phone: ${userKey.phone}</p>
	<hr/>
	<a href="addContact.jsp">Add a contact</a>
	<br>
	<a href="DisplayAllContactServlet">Display all contacts</a>
	<br>
	<a href="editprofile.jsp">Edit Profile</a>
	<br>
	<a href="deletecontact.html">Delete contact </a>
	<br>
	<a href="DeleteProfile">Delete your profile</a>
	<br>
	<a href="LogoutServlet">Logout</a>
</body>
</html>