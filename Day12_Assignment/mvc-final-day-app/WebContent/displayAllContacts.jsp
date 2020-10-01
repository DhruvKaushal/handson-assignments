<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
	<h3>All the Users</h3>
	${listKey}
	<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "core" %>
	
	<table class="table table-striped">
		<thead>
		<tr>
        <th scope="col">ID</th>
        <th scope="col">Name</th>
        <th scope="col">Phone No</th>
    	</tr>
    	</thead>
		<core:forEach items="${listContact}" var="u">
		<tr>
			<td scope="row">${u.userContId}</td>
			<td scope="row">${u.contactName}</td>
			<td scope="row">${u.contactPhone}</td>
		</tr>	
		</core:forEach>
	</table>
</body>
</html>