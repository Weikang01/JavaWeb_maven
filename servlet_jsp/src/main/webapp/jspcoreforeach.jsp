<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    ArrayList<String> people = new ArrayList<String>();
    people.add(0,"0-Jerry");
    people.add(1,"1-Tom");
    people.add(2,"2-Luca");
    people.add(3,"3-Bob");
    people.add(4,"4-Smith");
    request.setAttribute("people", people);
%>

<c:forEach var="person" items="${people}">
    <c:out value="${person}"/> <br>
</c:forEach>
<hr>
<hr>

<c:forEach var="person" items="${people}" begin="1" end="3" step="2">
    <c:out value="${person}"/> <br>
</c:forEach>

<%%>

</body>
</html>
