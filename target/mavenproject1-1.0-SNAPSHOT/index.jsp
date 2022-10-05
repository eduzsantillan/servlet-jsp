<%-- 
    Document   : index
    Created on : Oct 5, 2022, 10:07:21 AM
    Author     : edu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Main Menu</h1>
        
        <ul>
            <li><a href="<%= request.getContextPath()%>/UserServlet">Add User</a></li>
            <li><a href="<%= request.getContextPath()%>/EditUserServlet">Edit User</a></li>
         </ul>
    </body>
</html>
