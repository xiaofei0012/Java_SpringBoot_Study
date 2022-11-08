<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<c:if test="${user != null}">


    <c:forEach items="${user}" var="u">

        <h2>
            编号：<span>${u.id}</span>
            姓名：<span>${u.name}</span>
            年龄：<span>${u.age}</span>
        </h2>

    </c:forEach>

</c:if>
<%--${user.name}--%>
<%--${user.age}--%>

</body>
</html>
