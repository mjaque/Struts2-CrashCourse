<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8"/>
	<title>Hola Mundo con JSP</title>
<head>
<body>
	<h1>Hola Mundo con JSP</h1>
	
	<!-- Podemos realizar cálculos y llamar a métodos de Java -->
	<%
		double num = Math.random();
		if (num > 0.5) {
	%>
		
	<%
		} else {
	%>
		<p>No has tenido suerte. Ha salido <%= num %>.</p>
	<%
		}
	%>

	<p><a href="<%= request.getRequestURI() %>">Recargar esta página</a>.</p>
	<p><a href="/servlet2">Otra página (servlet)</a>.</p>
	
	<!-- Podemos usar variables puestas por el servlet -->
	<p>El mensaje es <%= request.getAttribute("mensaje") %> y el número entero es <%= request.getAttribute("valorEntero") %>.</p>
</body>
</html>