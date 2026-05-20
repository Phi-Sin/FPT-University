<%-- 
    Document   : login
    Created on : Sep 29, 2022, 7:50:14 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--        <title>Login Page</title>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="CSS/LoginStyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="login-wrapper">
            <form action="MainController" method="POST" class="form">
                <img src="img/loginIcon.jpg" alt="">
                <p><%= request.getAttribute("ERROR")%></p>
                <h2>Welcome</h2>   
                <div class="box">
                    <h3 class="title">Enter your detail</h3>
                <div class="input-group">
                    User ID<input type="text" name="UserID" id="UserID"/>
                </div>
                <div class="input-group">
                    Password<input type="Password" name="Password"/>
                </div>
                <input type="submit" name="action" value="Login" class="submit-btn" />
                <div class="signup_link">
                   Create a new account ? <a href="create.jsp">Click here</a></br>
                </div>
            </form>  
        </div>
    </body>
</html>
