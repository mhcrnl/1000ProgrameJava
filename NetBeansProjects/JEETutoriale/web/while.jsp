<%-- 
    Document   : while
    Created on : 13.05.2016, 16:40:48
    Author     : mhcrnl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! int fontSize; %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body >
        <h1>Hello While loop!</h1>
        <% while( fontSize <= 4){ %>
        <font color="red" size="<%= fontSize %>">
        JSP TUTORIAL
        </font><br/>
        <% fontSize++; %>
        <% } %>
        
    </body>
</html>
