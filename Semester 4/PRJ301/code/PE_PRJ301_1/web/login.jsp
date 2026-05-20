<%-- 
    Document   : login
    Created on : Mar 11, 2022, 9:02:11 PM
    Author     : hd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <!--your code here-->
        <form action="MainController" method="POST">
            Username: <input name="userID" required> <br>
            Password: <input name="password" required> <br>
            <p style="color: red">${mess} </p><br>
            <button type="submit" name="action" value="Login">Login</button>
        </form>
    </body>
    
</html>

