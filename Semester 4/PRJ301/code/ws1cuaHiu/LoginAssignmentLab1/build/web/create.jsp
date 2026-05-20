<%-- 
    Document   : Create
    Created on : Oct 10, 2022, 7:43:33 AM
    Author     : Acer
--%>

<%@page import="sample.user.UserError"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Page</title>
        <link href="CSS/CreateStyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="create-wrapper">
            <%
                UserError userError = (UserError) request.getAttribute("USER_ERROR");
                if (userError == null) {
                    userError = new UserError();
                }
            %>
            <form action="MainController" method="POST" class="form">
                <h2>INPUT YOUR INFORMATION: </h2>
                <div class="input-group">
                    User ID<input type="text" name="userID" required=""/>
                    <%= userError.getUserID()%></br>
                </div>
                <div class="input-group">
                    Full Name<input type="text" name="fullName" required=""/>
                    <%= userError.getFullName()%></br>
                </div>
                <div class="input-group">
                    Role ID<input type="text" name="roleID" placeholder="US"/></br>
                </div>
                <div class="input-group">
                    Password<input type="password" name="password" required=""/></br>
                </div>
                <div class="input-group">
                    Confirm<input type="password" name="confirm" required=""/></br>
                    <%= userError.getConfirm()%></br>
                </div>
                <input type="submit" name="action" value="Create" class="submit-btn"/>
                <input type="reset" value="Reset" class="reset-btn"/>          
            </form>
        </div>
    </body>
</html>
