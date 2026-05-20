<%-- 
    Document   : TestBean
    Created on : Jun 23, 2023, 2:40:20 PM
    Author     : MSI
--%>

<%@page import="java.util.Date"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bean of Web</title>
    </head>
    <body>
        <h1>Using JavaBean with JSP</h1>
        <jsp:useBean class="bean.utils.TimeBean" id="timeBean" scope="request" />
        
        <%--ta co the gan gia tri cho thuoc tinh cua javabean hoac su dung ma java trong script nhu tren--%>
        
        <%
            timeBean.setLocation("HCM, VietNam");
            timeBean.setNow(new Date());
        %>
        <c:out value="Yout location is : ${timeBean.location}" /> <br />
        <c:out value="Now the time is: ${timeBean.now}" /> <br />
        <c:out value="Today is: ${timeBean.getDate(dd/MM/yyyy)}"/>
        
    </body>
</html>
