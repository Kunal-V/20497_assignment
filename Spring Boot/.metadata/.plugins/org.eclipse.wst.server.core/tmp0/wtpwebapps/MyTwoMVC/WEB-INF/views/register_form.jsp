<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		<form:form action="register" method="POST" modelAttribute="user">
			<form:label path="name"> FULL name: </form:label>
			<form:input path="name" />
			<br />

			<form:label path="email"> Email: </form:label>
			<form:input path="email" />
			<br />

			<form:label path="password"> Password: </form:label>
			<form:input path="password" />
			<br />

			<form:label path="gender">Gender: </form:label>
			<form:radiobutton path="gender" value="Male" /> Male<br />
			<form:radiobutton path="gender" value="Female" /> Female<br />

			<form:label path="profession"> Profession: </form:label>
			<form:select path="profession" items="${professionList}" />
			<br />


			<form:label path="married"> Married? </form:label>
			<form:select path="married" />
			<br />

			<form:label path="note"> NOTE : </form:label>
			<form:textarea path="note" cols="25" rows="5" />
			<br />

			<form:button> Register </form:button>
		</form:form>

	</div>

</body>
</html>