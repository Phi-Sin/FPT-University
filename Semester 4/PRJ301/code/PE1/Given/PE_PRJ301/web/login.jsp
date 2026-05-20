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
    <body><form action="LoginController" method="post"></form>
        <div id="wrapper">
        <form action="LoginServlet" id="form-login" method="POST">
            <h1 class="form-heading">WELCOME</h1>
            <div class="form-below-heading">Enter your details</div>
            <div class="form-userid">User ID</div>
            <div class="form-group">
                <i class="fa-solid fa-user"></i>               
                <input type="text" class="form-input" placeholder="Your userID" name="UserID">
            </div>
            <div class="form-password">Password</div>
            <div class="form-group">
                <i class="fa-solid fa-lock"></i>
                <input type="password" class="form-input" placeholder="Your password" name="Password">
            </div>
            <input type="submit" value="Login" class="form-submit">
            <div class="form-createacc">Create new user account ?
                <a href="SignupServlet">Click here</a>
        </div>
        </form>
    </div> 
    </body>
    
</html>

