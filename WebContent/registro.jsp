<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Info registro</title>
</head>
<body>

<table>
	<tr>
		<th>Nombre</th>
		<th>Apellidos</th>
		<th>Email</th>
		<th>Telefono</th>
		<th>Codigo Postal</th>
	</tr>
	
	<%--<c:forEach items="${plainuser}" var="user" varStatus="estado">--%>
		<tr>
			<td><c:out value="${plainuser[0]}"/></td>
			<td><c:out value="${plainuser[1]}"/></td>
			<td><c:out value="${plainuser[2]}"/></td>
			<td><c:out value="${plainuser[3]}"/></td>
			<td><c:out value="${plainuser[4]}"/></td>
		</tr>
	<%--</c:forEach>--%>
</table>

</body>
</html>