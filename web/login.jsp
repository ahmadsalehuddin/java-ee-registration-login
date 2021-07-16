<%-- 
    Document   : login
    Created on : Jun 27, 2021, 7:15:37 PM
    Author     : ahmad
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="style.css" rel="stylesheet">
    </head>
    <body>
        <h1>Login using MVC-DAO</h1><br>
        <form method="post" action="LoginServlet">
            <table>
                <tr>
                    <td>Username </td>
                    <td><input name="username"></td>
                </tr>
                <tr>
                    <td>Password </td>
                    <td><input name="password" type="password"></td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="Login">&nbsp;
                        <input type="reset" value="Reset">
                    </td>
                </tr>
            </table>
        </form>
        <p><c:out value="${errorMsgs}"/></p>
    </body>
</html>
