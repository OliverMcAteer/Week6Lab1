<%-- 
    Document   : login
    Created on : Oct 3, 2017, 11:24:58 AM
    Author     : 684243
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="sait" %>
<%@ taglib uri="/WEB-INF/sait.tld" prefix="sait1" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sait1:Debug>
            Remote Host: ${pageContext.request.remoteHost}<br>
	Session ID: ${pageContext.session.id}
        </sait1:Debug>

        <h1>Remember Me Login Page!</h1>
        
        <p>
            <sait:login></sait:login>
        </p>
    </body>
</html>
