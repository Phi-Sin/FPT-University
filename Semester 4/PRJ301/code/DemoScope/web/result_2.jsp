<%-- 
    Document   : results
    Created on : Jun 2, 2023, 8:35:14 AM
    Author     : Vincent
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" />
        <title>Demo Scopes</title>
    </head>
    <body>
        <table>
            <tr>
                <th>Application Scope</th>
                <td>${applicationScope.value}</td>
            </tr>
            <tr>
                <th>Session Scope</th>
                <td>${sessionScope.value}</td>
            </tr>
            <tr>
                <th>Request Scope</th>
                <td>${requestScope.value}</td>
            </tr>
            <tr>
                <th>Page Scope</th>
                <td>${pageScope.value}</td>
            </tr>
        </table>
        <a href="result_3.jsp">Remove request scope</a>
    </body>
</html>
