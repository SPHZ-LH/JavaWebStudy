<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=new Date()%>
<hr>

<%--jsp脚本片段--%>
<%
    int sum = 0;
    for (int i = 0; i < 100; i++) {
        sum += i;
    }
    out.print(sum);
%>

<%
    int x = 10;
    out.print(x);
%>
<p>这是一个JSP文档</p>
<%
    int y = 2;
    out.print(y);
%>
</body>
</html>
