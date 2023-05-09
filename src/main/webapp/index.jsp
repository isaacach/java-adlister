<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="home"/>
    </jsp:include>
</head>
<body>
    <div>
        <jsp:include page="partials/nav.jsp" />

        <a href="login.jsp"><button>Login</button></a>
    </div>
</body>
</html>
