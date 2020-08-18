<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${msg1!=null}">
		<c:out value="${msg1}" />
	</c:if>
	<h2 style="color: black" align="center">GRABCART</h2>
	<h3 style="color: teal" align="center">Please login with your Credentials</h3>
	<form:form action="login" method="post" commandName="userForm1">
		<table align="center">
			<tr>
				<td style="color: blue">User Name:</td>
				<td><form:input path="userName" /><font color="red"><form:errors
							path="userName" /></font></td>
			</tr>
			<tr>
				<td style="color: blue">Password:</td>
				<td><form:password path="userPassword" /><font color="red"><form:errors
							path="userPassword" /></font></td>
			</tr>
			<tr>
				<td><input type="submit" value="LogIn" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>