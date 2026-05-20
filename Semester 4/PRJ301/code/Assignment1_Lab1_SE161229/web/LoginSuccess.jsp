<%-- 
    Document   : LoginSuccess
    Created on : May 21, 2023, 3:05:27 PM
    Author     : MSI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
    background: url('../bgrdr22.jpg');
    background-size: cover;
    overflow-y: hidden;
}

#wrapper{
    min-height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
}

#form-login{
    max-width: 800px;
    background: rgba(0, 0, 0, 0.8);
    /*background highlight*/
    flex-grow: 1;
    padding: 30px 30px 40px;
    box-shadow: 0px 0px 17px 2px rgba(255, 255, 255, 0.8);
}

.form-heading{
    font-size: 30px;
    color: #f5f5f5;
    text-align: center;
    margin-top: 0;
    margin-bottom: 25px;
}

.form-createacc{
    color: #f5f5f5;
    text-align: center;
}
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Successfully!</title>
    </head>
    <body>
        <div id="wrapper">
        <form action="" id="form-login">
            <h1 class="form-heading">WELCOME TO THE WESTERN AMERICA!!!</h1>
            <div class="form-createacc">Comeback Login Page ?
                <a href="LoginServlet">Click here</a>
        </div>
        </form>
    </div>     
    </body>
</html>
