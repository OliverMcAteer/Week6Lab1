<%-- 
    Document   : login
    Created on : Oct 19, 2017, 12:44:54 PM
    Author     : 684243
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>



<%-- any content can be specified here e.g.: --%>
            <form action="Login" method="POST">
                Username: <input type="text" name="login" value="${login}"><br>
                Password: <input type="text" name="password" value="${password}"><br>
                <input type="checkbox" name="remember" value="remember"> Remember me<br>
                <input type="submit" value="login">
                ${a}
            </form>