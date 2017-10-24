<%-- 
    Document   : menuPpal
    Created on : 21-oct-2017, 15:30:07
    Author     : mjaque
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login con Struts2</title>
    </head>

    <body>
        <h1>Menú Principal</h1>
        <p>¡Enhorabuena <s:property value="loginFormBean.nombre" />! Ya estás dentro.</p>
    </body>
</html>
