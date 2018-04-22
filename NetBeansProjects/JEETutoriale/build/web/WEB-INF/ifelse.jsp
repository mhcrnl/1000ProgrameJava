<%-- 
    Document   : ifelse
    Created on : 13.05.2016, 16:17:17
    Author     : mhcrnl
--%>
<%! int day = 3; %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
  
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>if ..else statement!</h1>
        <% if (day == 1 | day == 7) { %>
        <p>Astazi este weekend</p>
        <% } else { %>
        <p>Astazi nu este weekend</p>
        <% } %>
    </body>
</html>
