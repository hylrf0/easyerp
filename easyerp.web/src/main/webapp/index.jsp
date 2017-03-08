<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/7 0007
  Time: 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>easyerp</title>
    <jsp:include page="jsp/include.jsp" />
</head>
<body>
<div id="app">
    <input type="text" v-model="username">
    <input type="password" v-model="password">
    <button class="arrow-button" @click="login()">登陆</button>
</div>
</body>
<script src="./js/login.js"></script>
</html>
