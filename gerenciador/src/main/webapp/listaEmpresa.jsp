<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.List, br.com.alura.gerenciador.modelo.Empresa"
%>
<%
final List<Empresa> empresas = (List<Empresa>) request.getAttribute("empresas");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de empresas</title>
</head>
<body>
	<ul>
	<% for(Empresa empresa: empresas) { %>
		<li><%= empresa.getNome() %></li>
	<% } %>
	</ul>
</body>
</html>