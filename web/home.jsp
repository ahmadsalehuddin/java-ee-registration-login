<%-- 
    Document   : home
    Created on : Jun 27, 2021, 7:22:13 PM
    Author     : ahmad
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link href="style.css" rel="stylesheet">
    </head>
    <body>
        <h1>Home Page</h1>
        <p>
            Welcome <c:out value="${username}"/><br>
            <a href="LogoutServlet">Logout</a>
        </p>
    </body>
</html>
