

<%@page import="pe.igh.app.dto.TablaItem"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%

	List<TablaItem> lista = (List<TablaItem>) request.getAttribute("lista");

%>    


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<!--Version 4.3  --> 
<title>CALCULADORA COMPLETA</title>
</head>
<body>
	
	<h1 align="center">TABLA DE RESULTADO</h1>
	<div class="d-flex justify-content-center">
		
		<table class="table table-striped w-50">
		  <thead class="thead-dark">
		    <tr>
		      <th align="center">Numero 1</th>
		      <th align="center">Operacion</th>
		      <th align="center">Numero 2</th>
		      <th align="center">Resultado</th>
		    </tr>
		  </thead>
		  
		  <tbody>
		  <% for( TablaItem item: lista) { 	  	%>
		    <tr>
		      	<td align="center"><%= item.getNum1() %></td>
				<td align="center"><%= item.getOperador() %></td>			
				<td align="center"><%= item.getNum2() %></td>
				<td align="center"><%= item.getRptadiv() %></td>
		    </tr>
		    <% } %>
		</table>
	</div>
	
	
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	
</body>
</html>