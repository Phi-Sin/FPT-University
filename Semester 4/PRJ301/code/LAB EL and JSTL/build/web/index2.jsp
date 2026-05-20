<%-- 
    Document   : index2
    Created on : Jun 23, 2023, 4:36:14 PM
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
        li{
            list-style: none; line-height: 25px;
        }
        li>label{
            display: inline-block; text-align: right; width:110px;
            font-variant: small-caps; font-weight: bold;
        }
    </style>
</head>
<body>
    <h1>EL & JSTL</h1>
    <ul>
        <li><label>Họ và tên:</label> ${'bean.name'}</li>
        <li><label>Điểm TB:</label> ${'bean.mark'}</li>
        <li><label>Chuyên ngành:</label> ${'major'}</li>
    </ul>
    <ul>
        <li><label>Họ và tên:</label> ${'name'}</li>
        <li><label>Điểm TB:</label> ${'mark'}</li>
        <li><label>Chuyên ngành:</label> ${'major'}</li>
    </ul>
    <ul>
        <li><label>Họ và tên:</label> ${'name'}</li>
        <li><label>Điểm TB:</label> ${'mark'}</li>
        <li><label>Chuyên ngành:</label> ${'major'}</li>
    </ul>
</body>
</html>
