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
        <h2>Login</h2>

                <form class="Login-form" action="MainController" method="GET">
                    <label for="username">UserID</label>
                    <input type="text" id="UserID" name="UserID" required>

                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" required>
                    <input type="submit" value="login" name="action">
                    <!--<button type="submit" value="login" name="action">Login</button>-->
                </form>
    </body>
    
</html>

