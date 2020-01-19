<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/1/14
  Time: 0:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <h1>入门程序</h1>
   <a href="hello">入门程序</a>
   <a href="hello2?name=zhangsan">入门程序(简单数据类型参数)</a>

<%--<form action="hello3" method="post">
    用户名：<input type="text" name="username"/><br>
    密码：<input type="text" name="password"/><br>
    客户姓名：<input type="text" name="userDO.name"/><br>
    客户年龄：<input type="text" name="userDO.age"/><br>
    <input type="submit" value="提交"/><br>
</form>--%>

   <%--自定义类型转换器--%>
   <form action="param/saveUser" method="post">
    用户名：<input type="text" name="name"/><br>
    密码：<input type="text" name="age"/><br>
    客户生日：<input type="text" name="date"/><br>
    <input type="submit" value="提交"/><br>
</form>
</body>
</html>
