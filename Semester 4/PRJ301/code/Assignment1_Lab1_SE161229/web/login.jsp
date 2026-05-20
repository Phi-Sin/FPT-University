<%-- 
    Document   : login
    Created on : May 19, 2023, 4:50:22 PM
    Author     : MSI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <style>
body{
    background: url('../bgrdr2.png');
    background-size: cover;
    background-position-y: -70px;
}

#wrapper{
    min-height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
}

#form-login{
    max-width: 400px;
    background: rgba(0, 0, 0, 0.8);
    /*background highlight*/
    flex-grow: 1;
    padding: 30px 30px 40px;
    box-shadow: 0px 0px 17px 2px rgba(255, 255, 255, 0.8);
    border-radius: 10px;
}

.form-heading{
    font-size: 30px;
    color: #f5f5f5;
    text-align: center;
    margin-top: 0;
    margin-bottom: 5px;
}

.form-below-heading{
    font-size: 17px;
    color: #f5f5f5;
    text-align: center;
    margin-bottom: 35px;
}

.form-group{
    border-bottom: 1px solid #ffff;
    margin-top: 15px;
    margin-bottom: 20px;
    display: flex;
    border: 1px solid #f5f5f5;
}

.form-group i{
    color: #f5f5f5;
    font-size: 14px;
    padding-left: 5px;
    padding-right: 5px;
    padding-top: 5px;
    padding-bottom: 5px;
}

.form-input{
    background: transparent;
    border: 0;
    outline: 0;
    color: #f5f5f5;
    flex-grow: 1;
    margin-top: 5px;
    margin-bottom: 5px;
}

.form-input::placeholder{
    color: #f5f5f5;
}

.form-submit{
    background: transparent;
    border: 1px solid #f5f5f5;
    color: #ffff;
    width: 100%;
    text-transform: uppercase;
    padding: 15px 10px;
    transition: 0.25s ease-in-out;
    margin-top: 25px;
    border-radius: 5px;
}

.form-submit:hover{
    border: 1px solid #d63031;
}

.form-createacc{
    color: #f5f5f5;
}

.form-userid{
    color: #f5f5f5;
}

.form-password{
    color: #f5f5f5;
}

.form-createacc{
    color: #f5f5f5;
}

::-webkit-scrollbar {
    display: none;
}

body{
    overflow-y: hidden;
}
    </style>

    
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <title>Login Page</title>
</head>
<body>
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
