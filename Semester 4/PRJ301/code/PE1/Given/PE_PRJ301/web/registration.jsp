<%-- 
    Document   : login
    Created on : Mar 11, 2022, 9:02:11 PM
    Author     : hd
--%>

<%--<%@page import="sample.user.UserError"%>--%>
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
            <%--
                UserError userError = (UserError) request.getAttribute("USER_ERROR");
                if (userError == null) {
                    userError = new UserError();
                }
            --%>
            <form action="MainController" method="POST" class="form">
                <h2>INPUT YOUR INFORMATION: </h2>
                <div class="input-group">
                    Full Name<input type="text" name="fullName" required=""/>
                    <%--= userError.getFullName()--%>
                </div>
                <div class="input-group">
                    User ID<input type="text" name="userID" required=""/>
                    <%--= userError.getUserID()--%>
                </div>
                <div class="input-group">
                    Confirm<input type="email" name="email" required=""/>
                    <%--= userError.getConfirm()--%>
                </div>
                <div class="input-group">
                    Password<input type="password" name="password" required=""/>
                </div>
                <div class="input-group">
                    Role ID<input type="text" name="roleID" placeholder="US"/>
                </div>
                <div class="input-group">
                    <input type="submit" name="action" value="Create" class="submit-btn"/>
                    <input type="reset" value="Reset" class="reset-btn"/>     
                </div>
            </form>
        </div>
    </body>
</html>
