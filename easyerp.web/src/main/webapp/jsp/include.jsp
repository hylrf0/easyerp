<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/6 0006
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/lib/vue.js"></script>
    <script src="js/lib/vue-resource.js"></script>
    <!-- 引入样式 -->
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-default/index.css">
    <!-- 引入组件库 -->
    <script src="https://unpkg.com/element-ui/lib/index.js"></script>
</head>
<body>
<div id="head" style="margin-top: 0; left: 0;">
    <el-menu class="el-menu-demo" mode="horizontal">
        <el-menu-item index="1">easyerp</el-menu-item>
    </el-menu>
</div>
</body>
<script>
    var head = new Vue({
        el: "#head"
    })
</script>
</html>
