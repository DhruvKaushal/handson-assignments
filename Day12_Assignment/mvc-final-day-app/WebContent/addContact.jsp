<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="AddContactServlet">
		<label>
			<input type="text" name="nm">
		</label>
		<br>
		<label>
			<input type="text" name="ph">
		</label>
		<input type="submit" value="Add">
	</form>
</body>
</html>