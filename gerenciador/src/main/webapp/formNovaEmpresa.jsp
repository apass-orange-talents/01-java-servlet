<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novaEmpresa" var="linkParaNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"/>
<title>Insert title here</title>
</head>
<body>
	<form action="${ linkParaNovaEmpresa }" method="POST">
		<label>Nome:</label> <input type="text" name="nome"> <input type="submit">
	</form>
</body>
</html>