<%@ page import="com.sphz.pojo.address" %>
<%@ page import="com.sphz.pojo.People" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//    People people = new People();
    
//    people.setId();
//    people.setName();
//    people.setAge();
//    people.setAddress();
%>

<jsp:useBean id="people" class="com.sphz.pojo.People" scope="page"/>

<jsp:setProperty name="people" property="id" value="1"/>
<jsp:setProperty name="people" property="name" value="sphz"/>
<jsp:setProperty name="people" property="age" value="3"/>
<jsp:setProperty name="people" property="address" value="江西"/>

id：<jsp:getProperty name="people" property="id"/>
姓名：<jsp:getProperty name="people" property="name"/>
年龄：<jsp:getProperty name="people" property="age"/>
地址：<jsp:getProperty name="people" property="address"/>
</body>
</html>
