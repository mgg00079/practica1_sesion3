<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de usuarios:</title>
</head>
<body>
<table>
	<tr>
		<th>Apellidos</th>
	
		<th>Nombre</th>
	
		<th>email</th>
	
		<th>Telefono</th>
		
		<th>Codigo Postal</th>
	</tr>
	<c:forEach items="${usuarios}" var="user" varStatus="estado">
		<tr>
			<td><c:out value="${user.apellidos}"/></td>

			<td><c:out value="${user.nombre}"/></td>

			<td><c:out value="${user.email}"/></td>

			<td><c:out value="${user.telefono}"/></td>

			<td><c:out value="${user.cp}"/></td>
		</tr>
	</c:forEach>
</table>

</body>
</html>

<%--https://stackoverflow.com/questions/4928271/how-to-install-jstl-the-absolute-uri-http-java-sun-com-jstl-core-cannot-be-r--%>