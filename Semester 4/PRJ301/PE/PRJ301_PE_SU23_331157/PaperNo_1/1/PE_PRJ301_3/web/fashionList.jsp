<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Fashion List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
        }
        
        h2 {
            color: #333;
            margin-bottom: 20px;
        }
        
        h3 {
            margin-bottom: 10px;
        }
        
        form {
            max-width: 500px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #f2f2f2;
        }
        
        label {
            display: block;
            font-weight: bold;
        }
        
        input[type="text"],
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            cursor: pointer;
        }
        
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        
        th, td {
            border: 1px solid #ccc;
            padding: 8px;
            text-align: left;
        }
        
        th {
            background-color: #f2f2f2;
        }
        
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        
        a {
            color: #337ab7;
            text-decoration: none;
        }
        
        a:hover {
            text-decoration: underline;
        }
        
        .logout-link {
            display: inline-block;
            margin-top: 10px;
            padding: 5px 10px;
            background-color: #d9534f;
            color: white;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            text-decoration: none;
        }
        
        .logout-link:hover {
            background-color: #c9302c;
        }
    </style>
</head>
<body>
    <h2>Welcome, ${userID}</h2>
    
    <h3>Search Clothes</h3>
    <form action="MainController" method="GET">
        <label for="searchQuery">Enter name to search:</label>
        <input type="text" id="searchQuery" name="searchQuery" placeholder="Enter name to search">
        <input type="hidden" name="action" value="search">
        <input type="submit" value="Search">
    </form>
    
    <h3>Fashion List</h3>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Size</th>
                <th>Description</th>
                <th>Status</th>
                <th>Update</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="fashion" items="${requestScope.lf}">
                <tr>
                    <td>${fashion.getId()}</td>
                    <td>${fashion.getName()}</td>
                    <td>${fashion.getPrice()}</td>
                    <td>${fashion.getSize()}</td>
                    <td>${fashion.getDescription()}</td>
                    <td>${fashion.isStatus()}</td>
                    <td><a href="update?id=${fashion.id}">Update</a> | <a href="delete?id=${fashion.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    
    <br>
    <a href="MainController?action=logout" class="logout-link">Logout</a>
</body>
</html>
