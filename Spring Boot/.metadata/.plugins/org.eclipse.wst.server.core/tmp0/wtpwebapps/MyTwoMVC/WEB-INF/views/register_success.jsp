<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success</title>
</head>
<body>
	<div align="center">
		<h2>Registration Successful!!!</h2>
		<span>Full name :</span><span>${user.name}</span><br /> <span>Email
			:</span><span>${user.email}</span><br /> <span>Password :</span><span>${user.password}</span><br />
		<span>Gender:</span><span>${user.gender}</span><br /> <span>Married?</span><span>${user.married}</span><br />
		<span>Note:</span><span>${user.note}</span><br />

	</div>

</body>
</html>