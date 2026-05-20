<%-- 
    Document   : index
    Created on : Jun 23, 2023, 4:31:06 PM
    Author     : MSI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC</title>
        <base href="${pageContext.servletContext.contextPath}/">
        <style>
            div{
                display: inline-block; 
                text-align: center; 
                margin: 5px; 
                padding:5px;
                border: 1px dotted orangered;
                border-radius: 5px;
            }
        </style>
    </head>
    <body>
        <h1>EL & JSTL</h1>
        <div>
            <img src="${photo}">
            <br>
            <strong>${name}</strong>
            <em>${salary*level}</em>
        </div>
        <div>
            <img src="${photo}">
            <br>
            <strong>${name}</strong>
            <em>${salary*level}</em>
        </div>
        <div>
            <img src="${photo}">
            <br>
            <strong>${name}</strong>
            <em>${salary*level}</em>
        </div>

    </body>
</html>
