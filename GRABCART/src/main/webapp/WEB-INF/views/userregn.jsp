<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 style="color: black">GRABCART</h2>
	<form:form action="saveUser" method="post" commandName="userForm"
		onsubmit="return validate()">
		<table>
			<tr>
				<td style="color: blue">User Name:</td>
				<td><form:input id="name" path="userName" /><font color="red"><form:errors
							path="userName" /></font></td>
			</tr>
			<tr>
				<td style="color: blue">Password:</td>
				<td><form:password id="password" path="userPassword" /><font
					color="red"><form:errors path="userPassword" /></font></td>
			</tr>
			<tr>
				<td style="color: blue">Confirm Password:</td>
				<td><form:password id="confirm" path="userConPassword" /><font
					color="red"><form:errors path="userConPassword" /></font></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>