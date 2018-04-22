<%-- 
    Document   : switchcase
    Created on : 13.05.2016, 16:25:37
    Author     : mhcrnl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% int day = 3; %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Switch ...  case Statement</h1>
        <%
switch(day) {
    case 0:
        out.println("Duminica.");
        break;
    case 1:
        out.println("Luni");
        break;
    case 2:
        out.println("Marti");
        break;
    case 3:
        out.println("Miercuri");
        break;
    default :
        out.println("?Sambata");
}
%>
    </body>
</html>
