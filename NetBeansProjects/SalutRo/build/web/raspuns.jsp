<%-- 
    Document   : raspuns
    Created on : Jan 31, 2016, 8:45:32 AM
    Author     : mhcrnl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id="mybean" scope="session" class="ro.linuxmagazin.salut.SalutRoHandler" />
        <jsp:setProperty name="mybean" property="nume" />
        <h1>Salut, <jsp:getProperty name="mybean" property="nume" />!</h1>
        <jsp:setProperty name="mybean" property="email" />
        <h2>Email: <jsp:getProperty name="mybean" property="email" /> </h2>
        <jsp:setProperty name="mybean" property="descriere" />
        <h3>Descriere: <jsp:getProperty name="mybean" property="descriere" /></h3>
    </body>
</html>
