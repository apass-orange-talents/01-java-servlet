<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="br.com.alura.gerenciador.modelo.Empresa"%>
<%
Empresa empresa = (Empresa) request.getAttribute("empresa");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nova empresa criada</title>
</head>
<body>
	Empresa <%= empresa.getNome() %> cadastradas com sucesso!
</body>
</html>