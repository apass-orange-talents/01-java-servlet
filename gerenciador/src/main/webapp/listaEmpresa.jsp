<%@ page import="java.util.List, br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/removeEmpresa" var="linkRemoveEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de empresas</title>
</head>
<body>

	<c:if test="${not empty empresa}">	
		Empresa ${ empresa.nome } cadastrada com sucesso!
	</c:if>

	<div>
		<ul>
			<c:forEach items="${empresas}" var="empresa">
				<li>${ empresa.nome } | <fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy" /> | <a href="${ linkRemoveEmpresa }?id=${empresa.id}">remove</a> ></li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>