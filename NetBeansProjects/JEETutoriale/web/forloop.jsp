<%-- 
    Document   : forloop
    Created on : 13.05.2016, 16:33:15
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
    <body>
        <h1>For loop example!</h1>
        <%for ( fontSize = 1; fontSize<= 3; fontSize++){ %>
        <font color="green" size="<%= fontSize %>">
        JSP Tutorial
        </font></br>
        <%}%>
    </body>
</html>
