<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		align=""center">
		<h2>USER Registeration</h2>
		<form:form action="register" method="post" modelAttribute="user">
			<form:label path="username"> username: </form:label>
			<form:input path="username" />
			<br />

			<form:label path="email"> Email: </form:label>
			<form:input path="email" />
			<br />

			<form:label path="password"> Password: </form:label>
			<form:input path="password" />
			<br />

			<form:label path="phoneno"> Phone No: </form:label>
			<form:input path="phoneno" />
			<br />

			<form:button> Register </form:button>
		</form:form>

	</div>
</body>

</html>