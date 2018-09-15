<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <script src="/static/scripts/jquery-3.3.1.min.js"></script>
    <script src="/static/scripts/test.js"></script>
    <title>Title</title>
</head>
<body>
<form method="get" action="/user/login" >
    用户名：<input type="text" name="name"/><br/>
    密码：<input type="text" name="password"/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>