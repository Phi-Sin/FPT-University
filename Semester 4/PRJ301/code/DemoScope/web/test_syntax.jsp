<%-- 
    Document   : results
    Created on : Jun 2, 2023, 8:35:14 AM
    Author     : Vincent
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
                <th>Arithmetic</th>
                <td>${2 + 2}</td>
            </tr>
            <tr>
                <th>Variable Access</th>
                <td>${obj}</td>
            </tr>
            <tr>
                <th>Property Access</th>
                <td>${obj.name}</td>
            </tr>
            <tr>
                <th>Method Invocation</th>
                <td>${obj.changeNameToHello().name}</td>
            </tr>
            <tr>
                <th>Comparison</th>
                <td>${1 > 2}</td>
            </tr>
            <tr>
                <th>Logical Operator</th>
                <td>${1 > 2 || 1 < 2}</td>
            </tr>
            <tr>
                <th>Collection Access 1</th>
                <td>${list[0]}</td>
            </tr>
            <tr>
                <th>Collection Access 2</th>
                <td>${list[2]}</td>
            </tr>
            <tr>
                <th>Ternary Operator</th>
                <td>${doIHateCSharp ? 'A lot' : 'Again. Still a lot'}</td>
            </tr>
            <tr>
                <th>?</th>
                <td>${2 + '2'}</td>
            </tr>
            <tr>
                <th>??</th>
                <td>${'2' + 2}</td>
            </tr>
            <tr>
                <th>???</th>
                <td>${"2" + "2"}</td>
            </tr>
            <tr>
                <th>...</th>
                <td>${2}${2}</td>
            </tr>
            <tr>
                <th>Test function</th>
                <td>${fn:escapeXml("<script>alert('ok')</script>")}</td>
            </tr>
        </table>
        <a href="test_syntax.jsp">Test syntax</a>
    </body>
</html>
