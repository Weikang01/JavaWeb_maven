<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%-- define a var called score, its value is 85 --%>
<c:set var="score" value="85"/> 

<c:choose>
    <c:when test="${score>=90}">
        Your grade is A
    </c:when>
    <c:when test="${score>=80}">
        Your grade is B
    </c:when>
    <c:when test="${score>=70}">
        Your grade is C
    </c:when>
    <c:when test="${score>=60}">
        Your grade is D
    </c:when>
</c:choose>


<%%>

<%%>

</body>
</html>
