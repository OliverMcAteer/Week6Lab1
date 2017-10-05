<%-- 
    Document   : login
    Created on : Oct 3, 2017, 11:24:58 AM
    Author     : 684243
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Remember Me Login Page!</h1>
        
        <p>
            <form action="Login" method="POST">
                Username: <input type="text" name="login" value="${login}"><br>
                Password: <input type="text" name="password" value="${password}"><br>
                <input type="checkbox" name="remember" value="remember"> Remember me<br>
                <input type="submit" value="login">
                ${a}
            </form>
        </p>
    </body>
</html>
