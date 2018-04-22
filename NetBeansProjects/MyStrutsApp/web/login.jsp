<%-- 
    Document   : login
    Created on : Jan 31, 2016, 10:00:27 AM
    Author     : mhcrnl
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login.jsp</title>
    </head>
    <body>
        <h1>Login Form!</h1>
        <html:form action="/login">

            <table border="0">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td colspan="2">
                            <bean:write name="LoginForm" property="error" filter="false"/>
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td>Introduce-ti numele:</td>
                        <td><html:text property="name"/></td>
                    </tr>
                    <tr>
                        <td>Introduce-ti email:</td>
                        <td><html:text property="email"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><html:submit value="Login"/></td>
                    </tr>
                </tbody>
            </table>
            <html:submit value="Login" />
        </html:form>
    </body>
</html>
