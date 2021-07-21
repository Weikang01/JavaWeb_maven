<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    // People people = new People();
    // people.setId();
    // people.setName();
    // people.setAge();
    // people.setAddress();
%>

<jsp:useBean id="people" class="com.pojo.People" scope="page" />

<jsp:setProperty name="people" property="id" value="1"/>
<jsp:setProperty name="people" property="name" value="Bob"/>
<jsp:setProperty name="people" property="age" value="3"/>
<jsp:setProperty name="people" property="address" value="amsterdam"/>

id: <jsp:getProperty name="people" property="id" /> <br>
name: <jsp:getProperty name="people" property="name" /> <br>
age: <jsp:getProperty name="people" property="age" /> <br>
address: <jsp:getProperty name="people" property="address" /> <br>

<%%>

<%%>

</body>
</html>
