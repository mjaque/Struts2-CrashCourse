<%-- 
    Document   : login
    Created on : 21-oct-2017, 12:57:34
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
        <h1>Login</h1>
        <s:form action="login">
            <s:textfield name="loginFormBean.nombre" label="Nombre" />
            <s:password name="loginFormBean.clave" label="Clave" />
            <s:submit value="Acceder" />
        </s:form>
    </body>
</html>
