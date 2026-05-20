<%-- 
    Document   : FashionList
    Created on : Jun 8, 2023, 4:25:42 PM
    Author     : Henry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="f" class="pe.dao.FashionDAO" scope="request"></jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome: ${sessionScope.cloud.fullName}</h1>
    <a href="MainController?action=Logout"><button>Logout</button></a> 
        <form action="MainController" method="post">
            <div>
                <input name="search" type="text" placeholder="Cloths' Name"/>
                <button type="submit" value="Search" name="action">Search</button>
            </div>
        </form>
        <table border="1">
                <thead>
                    <tr>
                        <th>No</th>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Description</th>
                        <th>Price</th>
                        <th>Size</th>
                        <th>Status</th>
                    </tr>
                </thead>
                                   
                <tbody>                    
                    <c:forEach items="${listacc}" var="i" varStatus="loop">
                    <form action="MainController" method="POST">
                        <tr>
                            <td scope="row">${loop.index}</td>
                            <td data-title="ID" >${i.id}</td>
                            <td data-title="Name">${i.name}</td>
                            <td data-title="Description" >${i.description}</td>
                            <td data-title="Price" >${i.price}</td>
                            <td data-title="Size" >${i.size}</td>
                            <td data-title="Status" >${i.status}</td>
                            <td data-title="Delete" ><a class="test" href="MainController?id=${i.id}&action=Delete">Delete</a></td>                
                        </tr>
                    </form>
                    <br> 
                </c:forEach>
                </tbody>
            </table>
    </body>
</html>

