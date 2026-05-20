<%-- 
    Document   : error
    Created on : Mar 1, 2022, 8:33:55 PM
    Author     : hd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    
    <body>
        <h1>Oops! An error occurred.</h1>
        <p>
            <% 
            
                int statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
                String message = (String) request.getAttribute("javax.servlet.error.message");
            
                out.println("Status Code: " + statusCode + "<br>");
                out.println("Message: " + message);
            %>
        </p>
    </body>
</html>
