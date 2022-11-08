<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页</title>
    <base href="${pageContext.request.contextPath}/">
</head>
<body>

<form action="dologin" method="post">
    <p>账号：<input type="text" name="name" aria-label=""></p>
    <p>密码：<input type="text" name="age" aria-label=""></p>
    <p>
        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </p>
</form>

</body>
</html>
