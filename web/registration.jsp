<%-- 
    Document   : registration
    Created on : Jul 6, 2021, 5:04:53 PM
    Author     : ahmad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="style.css" rel="stylesheet">
    </head>
    <body>
        <h1>User Registration</h1>
        <ul>
            <table>
                <form method="post" action="RegisterServlet">
                    <tr>
                        <td>
                    <li>Name</li>
                    <input placeholder="Enter Your Name" name="name">
                    </td>
                    </tr>
                    <tr>
                        <td>
                    <li>Email</li>
                    <input placeholder="Enter Your Email" name="email">
                    </td>
                    </tr>
                    <tr>
                        <td>
                    <li>Username</li>
                    <input placeholder="Enter Your Username" name="username">
                    </td>
                    </tr>
                    <tr>
                        <td>
                    <li>Password</li>
                    <input type="password" name="password" placeholder="Enter Password">
                    </td>
                    </tr>
                    <tr>
                        <td>
                    <li>Confirm Password</li>
                    <input type="password" name="confirm" placeholder="Confirm Password"><br><br>
                    <input type="submit" value="Confirm Registration">&nbsp;<input type="reset" value="Reset">
                    </td>
                    </tr>
                </form>
            </table>
        </ul>
    </body>
</html>
