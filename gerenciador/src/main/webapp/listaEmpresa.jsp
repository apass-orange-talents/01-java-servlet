<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List, br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<c:forEach items="${empresas}" var="empresa">
			<li>${ empresa.nome }</li>
		</c:forEach>
	</ul>
</body>
</html>