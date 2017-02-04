<%-- 
    Document   : index
    Created on : 13.05.2016, 15:42:35
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
        <% out.println("Adresa IP este: "+ request.getRemoteAddr()+"  "); %>
        
        <%-- Declaratii jsp --%>
        <%! int i = 0;%>
        <%! int a, b, c; %>
        <%-- <%! Circle a = new Circle(2.0); %> --%>
        <% out.println("Int a = "+ i);%>
        
        <%-- Utilizarea expresiilor in JSP --%>
        <p> Data de azi este: <%= (new java.util.Date().toString())%>
        <h2> Aceasta fila este introdusa cu Actiunea jsp:include</h2> 
            <jsp:include page="date.jsp" flush="true" />
            <%--
    <center>
            <h2>Utilizare JavaBeans in JSP</h2>
            <jsp:useBean id="test" class="TestBean" /> 
            <jsp:setProperty name="test" property="message" value="Hello JSP..." />
            <p>Got message....</p>
            <jsp:getProperty name="test" property="message" />
    </center>
            --%>
            <h2> Inserare fila data.jsp cu forward Actions</h2>
            <jsp:forward page="date.jsp" />
            
    </body>
</html>
