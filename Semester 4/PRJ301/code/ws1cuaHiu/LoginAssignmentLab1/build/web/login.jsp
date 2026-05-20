<%-- 
    Document   : login
    Created on : Sep 29, 2022, 7:50:14 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
    * {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
body {
  background: url('../img/bg.png') center;
  background-size: cover;
  font-family: sans-serif;
}
.login-wrapper {
  height: 100vh;
  width: 100vw;
  display: flex;
  justify-content: center;
  align-items: center;
}
.form {
  position: relative;
  width: 100%;
    /*background highlight*/
  flex-grow: 1;
  box-shadow: 0px 0px 17px 2px rgba(255, 255, 255, 0.8);
  max-width: 380px;
  padding: 80px 40px 40px;
  background: rgba(0,0,0,0.7);
  color: white;
  box-shadow: 0px 0px 17px 2px rgba(255, 255, 255, 0.8);
  border-radius: 5px;
}

.form img {
  position: absolute;
  top: -50px;
  left: calc(50% - 50px);
  width: 100px;
  background: rgba(255,255,255, 0.8);
}
.form h2 {
  text-align: center;
  letter-spacing: 1px;
  color: white;
}

.form h3 {
text-align: center;
letter-spacing: 1px;
color: white;
margin-bottom: 2rem;
}

.form .input-group {
  position: relative;
}
.form .input-group input {
  width: 100%;
  padding: 10px 0;
  font-size: 1rem;
  letter-spacing: 1px;
  margin-bottom: 30px;
  border: none;
  border-bottom: 1px solid #fff;
  outline: none;
  background-color: transparent;
  color: inherit;
}

.submit-btn {
  display: block;
  float: left;
  margin-left: auto;
  border: none;
  outline: none;
  background: white;
  font-size: 1rem;
  text-transform: uppercase;
  letter-spacing: 1px;
  padding: 10px 20px;
  cursor: pointer;
}

.reset-btn{
  display: block;
  float: right;
  margin-left: auto;
  border: none;
  outline: none;
  background: white;
  font-size: 1rem;
  text-transform: uppercase;
  letter-spacing: 1px;
  padding: 10px 20px;
  cursor: pointer;
}

.signup_link{
  display: block;
  float: right;
  margin: 30px 0;
  margin-right: 20px;
  font-size: 16px;
  color: white;
}
.signup_link a{
  color: white;
  text-decoration: none;
}
.signup_link a:hover{
  text-decoration: underline;
}
.Shopping{
  margin-left: 80px;
  display: block;
  float: left;
  border: none;
  outline: none;
  background: white;
  font-size: 1rem;
  text-transform: uppercase;
  letter-spacing: 1px;
  padding: 10px 20px;
  cursor: pointer;
  color: black;
  text-decoration: none;
}

p{
    color: red;
    text-align: center;
}
</style>
        <!--        <title>Login Page</title>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <div class="login-wrapper">
            <form action="MainController" method="POST" class="form">
                <img src="img/iconlogin.png" alt="">
                <p><%= request.getAttribute("ERROR")%></p>
                <h2>Login</h2>
                <div class="input-group">
                    User ID<input type="text" name="userID" id="userID"/>
                </div>
                <div class="input-group">
                    Password<input type="password" name="password"/>
                </div>
                <input type="submit" name="action" value="Login" class="submit-btn" />
                <div class="signup_link">
                   Create new user account ?<a href="create.jsp">Click Here</a>
                </div>
            </form>  
        </div>
    </body>
</html>
