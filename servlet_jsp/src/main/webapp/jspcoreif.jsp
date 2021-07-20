<%-- https://www.runoob.com/jsp/jsp-jstl.html --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- introduce JSTL core tag lib --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h4>if test</h4>

<hr>

<form action="jspcoreif.jsp" method="get">
    <%-- 
        Use EL expression to get data from the form
        ${param.paramname}
     --%>
    <input type="text" name="username" value=${param.username}>
    <input type="submit" value="login">
</form>

<%-- 
    if username == "admin"
        login.success();
 --%>
<c:if test="${param.username == 'admin'}" var="isAdmin">
    <c:out value="Welcome!"/>
</c:if>
<c:out value="${isAdmin}"/>



<%%>

<%%>

</body>
</html>
