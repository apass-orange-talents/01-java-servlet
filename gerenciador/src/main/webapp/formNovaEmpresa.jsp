<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:if test="${ empty empresa }">
	<c:url value="/novaEmpresa" var="linkForm" />
</c:if>
<c:if test="${ not empty empresa }">
	<c:url value="/editaEmpresa" var="linkForm" />
</c:if>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<form action="${ linkForm }" method="POST">
		<input type="hidden" name="id" value="<c:if test="${ not empty empresa }">${ empresa.id }</c:if>" />
		
		<div>
			<label>Nome:</label> <input type="text" name="nome" value="<c:if test="${ not empty empresa }">${ empresa.nome }</c:if>" />
		</div>

		<div>
			<label>Data de abertura:</label> <input type="text" name="dataAbertura" value="<c:if test="${ not empty empresa }"><fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" /></c:if>" />
		</div>

		<input type="submit">
	</form>
</body>
</html>