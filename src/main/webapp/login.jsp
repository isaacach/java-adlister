<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("profile.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }
    }
%>

<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="login.jsp" method="post">
        <label for="username">Username: </label>
        <input name="username" type="text" id="username"/>
        <label for="password">Password: </label>
        <input name="password" type="password" id="password"/>
        <input type="submit" value="submit" />
    </form>
</body>
</html>
