<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf8"/>
	<title>Hola Mundo Struts2</title>
</head>
<body>
	<h1>Hola Mundo Struts2</h1>
	
	<!-- 	Mostramos el valor de la propiedad "mensaje" de la Accion1
		Struts2 utiliza el getter de la clase con el nombre convencional para encontrar el valor
	-->
	<p>El mensaje es: <s:property value="mensaje"/></p>
	
	<p>Desarrollado por <a href="http://escueladeprogramacion.es">escueladeprogramacion.es</a></p>
</body>
</html>