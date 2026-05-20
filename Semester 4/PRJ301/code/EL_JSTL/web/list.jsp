<%-- 
    Document   : list
    Created on : Mar 2, 2023, 11:39:02 AM
    Author     : Admin
--%>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="f" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC</title>
        <base href="${pageContext.servletContext.contextPath}/">
        <style>
            table{

                border-collapse: collapse; width: 100%;
            }
            th, td{
                line-height: 25px; border: 1px solid black; padding: 5px;

            }
            th{
                background-color: gray;
            }
        </style>
    </head>
    <body>
  
        <h1>EL & JSTL</h1>
        <table>
            <tr>
                <th>Tên SP</th>
                <th>Giá cũ</th>
                <th>Giảm giá</th>
                <th>Giá mới</th>
            </tr>
            <c:forEach var="p" items="${listP}">
                <tr>
                    <td>${p.name}</td>
                    <td>$ ${p.unitPrice}</td>
                    <td><f:formatNumber value="${p.discount}" type="percent"/></td>
                    <td><f:formatNumber value="${p.newPrice}" type="currency"/></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
