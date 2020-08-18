<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table align="center" border="1">
		<tr>
			<h2 style="color: purple;" align="centre">Details of the Orders</h2>
		</tr>

		<tr>
			<th width="100">PRODUCT NAME</th>
			<th width="60">PRICE</th>
			<th width="100">TYPE</th>
			<th width="160">ACTION</th>

		</tr>

		<c:forEach items="${pet}" var="pet1">
			<tr>
				<td>${pet1.name}</td>
				<td>${pet1.age}</td>
				<td>${pet1.place}</td>
				<td><a href="<c:url value='/sell'/>">SELL</a>
					<a href="<c:url value='/buy'/>">BUY</a></td>
			</tr>
		</c:forEach>
</body>
</html>