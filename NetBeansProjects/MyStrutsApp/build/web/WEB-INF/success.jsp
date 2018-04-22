<%-- 
    Document   : success
    Created on : Jan 31, 2016, 10:19:43 AM
    Author     : mhcrnl
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login SUCCESS</title>
    </head>
    <body>
        <h1>Felicitari!</h1>
        <p>Sunte-ti logat in aplicatie. </p>
        <p>Numele dvs este: <bean:write name="LoginForm" property="name"/>.</p>
        <p>Adresa de email: <bean:write name="LoginForm" property="email"/>  .</p>
    </body>
</html>
