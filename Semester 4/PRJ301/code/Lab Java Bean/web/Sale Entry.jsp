<%-- 
    Document   : Sale Entry
    Created on : Jun 23, 2023, 3:14:08 PM
    Author     : MSI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sale Entry</title>
    </head>
    <body>
        <h1>Sale Entry</h1>
        <br>
        <form action="SaleEntry1.jsp">
            Item ID: <input type="text" name="itemID"> <br>
            Number of Items: <input type="text" name="numItems"> <br>
            Discount Code: <input type="text" name="discountCode"> <br>
            <input type="submit" value="Show Price"> <br>
        </form>
    </body>
</html>
