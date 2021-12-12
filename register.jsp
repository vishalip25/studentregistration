<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form:form id="regForm" modelAttribute="student" action="registerProcess"
		method="post">

		<table align="center">
			<tr>
				<td><form:label path="name">name</form:label></td>
				<td><form:input path="name" name="name" id="username" /></td>
			</tr>
			<tr>
				<td><form:label path="Email">Email</form:label></td>
				<td><form:password path="Email" name="Email"
						id="Email" /></td>
			</tr>
			<tr>
				<td><form:label path="Year">Year</form:label></td>
				<td><form:input path="Year" name="Year"
						id="Year" /></td>
			</tr>
			<tr>
				<td><form:label path="Age">Age</form:label></td>
				<td><form:input path="Age" name="Age" id="Age" /></td>
			</tr>
			<tr>
				<td><form:label path="Dept">Dept</form:label></td>
				<td><form:input path="Dept" name="Dept" id="Dept" /></td>
			</tr>
			
			<tr>
				<td></td>
				<td><form:button id="register" name="register">Register</form:button></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="home.jsp">Home</a></td>
			</tr>
		</table>
	</form:form>

</body>
</html>