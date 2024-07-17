<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("name1", "value1");
    request.setAttribute("name2", "value2");
    session.setAttribute("name3", "value3");
    application.setAttribute("name4", "value4");


    String name1 = (String) pageContext.getAttribute("name1");
    String name2 = (String) pageContext.getAttribute("name2");
    String name3 = (String) pageContext.getAttribute("name3");
    String name4 = (String) pageContext.getAttribute("name4");
    String name5 = (String) pageContext.getAttribute("name5");//不存在

    pageContext.forward("/pageDemo02.jsp");
%>

<h1>取出的数据为：</h1>
<h3>${name1}</h3>
<h3>${name2}</h3>
<h3>${name3}</h3>
<h3>${name4}</h3>

<h3>${name5}</h3>

<%--输出为null--%>
<h3><%=name5%>
</h3>

</body>
</html>
