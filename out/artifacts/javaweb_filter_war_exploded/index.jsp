<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>当前在线人数为：<%=this.getServletConfig().getServletContext().getAttribute("OnlineCount") %>
</h1>
</body>
</html>
