<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2023-09-14
  Time: 오전 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>list.jsp</h1>
<ul>
<c:forEach var="dto" items="${list}">
    <li>${dto.name}, ${dto.mail}</li>
</c:forEach>
</ul>
</body>
</html>
