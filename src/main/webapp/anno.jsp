<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/1/19
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="anno/testRquestParam?name=zsss">testRquestParam</a>
<br>

<a href="anno/testPathVariable/10">testPathVariable</a>
<br>

<a href="anno/testRequestHeader">testRequestHeader</a>
<br>

<a href="anno/testCookValue">testCookValue</a>
<br>

<a href="anno/testSessionAttribute">testSessionAttribute</a>
<a href="anno/getSessionAttribute">getSessionAttribute</a>


<br>
<form action="anno/testModelAttribute" method="post">
    用户名：<input type="text" name="name"/><br>
    密码：<input type="text" name="age"/><br>

    <input type="submit" value="提交"/><br>
</form>
<br>
<form action="anno/testRquestBody" method="post">
    用户名：<input type="text" name="username"/><br>
    密码：<input type="text" name="password"/><br>

    <input type="submit" value="提交"/><br>
</form>
</body>
</html>
