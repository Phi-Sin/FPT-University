<%-- 
    Document   : admin
    Created on : Jun 15, 2023, 1:08:58 PM
    Author     : Acer
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="ws.model.MobileDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    <body>
        <h1>Wellcome Staff:</h1><h2>${LOGIN_USER.fullName}</h2>
        <%
            String search = request.getParameter("search");
            if (search != null) {
                search = "";
            }
        %>
        <form action="MainController">
            <input type="submit" name="action" value="Logout"/>
        </form>


        <form action="MainController">
            Search<input type="text" name="search" value="<%= search%>"/>
            <button name="action" value="Search">Search</button>
        </form>
        <%
            List<MobileDTO> listMobile = (ArrayList) request.getAttribute("LIST_MOBILE");
            if (listMobile != null) {
                if (listMobile.size() > 0) {
        %>
        <table border ="1">
            <thead>
                <tr>
                    <th>No</th>
                    <th>Mobile ID</th>
                    <th>Description</th>
                    <th>Price</th>
                    <th>Mobile Name</th>
                    <th>Year Of Product</th>
                    <th>Quantity</th>
                    <th>Not Sale</th>
                    <th>Delete</th>
                    <th>Update</th>
                </tr>
            </thead>
            <tbody>
                <%
                    int count = 0;
                    for (MobileDTO mob : listMobile) {
                %>
            <form action="MainController" method="POST">
                <tr>
                    <td><%= ++count%></td>
                    <td>
                        <input type="text" name="mobileId" value="<%=mob.getMobileId()%>" readonly="">
                    </td>
                    <td>
                        <input type="text" name="description" value="<%= mob.getDescription()%>"/>
                    </td>
                    <td>
                        <input type="text" name="price" value="<%= mob.getPrice()%>"/>
                    </td>
                    <td>
                        <input type="text" name="mobileName" value="<%= mob.getMobileName()%>" readonly=""/>
                    </td>
                    <td>
                        <input type="text" name="yearOfProduction" value="<%= mob.getYearOfProduction()%>" readonly=""/>
                    </td>
                    <td>
                        <input type="text" name="quantity" value="<%= mob.getQuantity()%>"/>
                    </td>
                    <td>
                        <input type="text" name="notSale" value="<%= mob.isNotSale()%>"/>
                    </td>
                    <td>
                        <a href="MainController?mobileId=<%= mob.getMobileId()%>&action=Delete&search=<%= search%>">Delete</a>
                    </td>
                    <td>
                        <input type="hidden" name="search" value="<%= search%>"/>
                        <input type="submit" name="action" value="Update"/>
                    </td>
                </tr>
            </form>

            <%
                }
            %> 

        </tbody>
        <%
            String error = (String) request.getAttribute("ERROR");
            if (error == null) {
                error = "";
            }
        %>
        <%= error%>
        <%
                }
            }
        %>
    </table><br>
    <div>
        <h1>Add new Mobile</h1>
        <form action="MainController" method="post">
            ID <input name="mobileIda" type="text"><br>
            Description <input name="descriptiona" type="text"><br>
            Name <input name="mobileNamea" type="text"><br>
            Price <input name="pricea" type="text"><br>
            Year of Product <input name="yearOfProductiona" type="text"><br>
            Quantity <input name="quantitya" type="text"><br>
            <button name="action" value="Add">Add new</button>
        </form>
    </div>

</body>
</html>
