<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1><%=request.getAttribute("titulo")%>	</h1>
	<table>
		<tr>
			<td>N�mero 1: </td>
			<td><%=request.getAttribute("n1")%></td>
		</tr>
		<tr>
			<td>N�mero 2: </td>
			<td><%=request.getAttribute("n2")%></td>
		</tr>
		<tr>
			<td>Respuesta: </td>
			<td><%=request.getAttribute("rpta")%></td>
		</tr>
	</table>
</body>
</html>