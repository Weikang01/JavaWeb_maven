<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%-- Import package --%>
<%@ page import="java.util.*"%>
<%-- Set error page --%>
<%@ page errorPage="error/500.jsp"%>

<%-- Explicitly declare that this is an error page --%>
<%-- <%@ page isErrorPage="true"  %> --%>

<%-- <%@ page pageEncoding="UTF-8"  %> --%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%@ include file="common/header.jsp"  %>

<h1>page content</h1>

<%@ include file="common/footer.jsp"  %>

<hr>

<%-- jsp tags --%>
<%-- we can achieve the same result with tags --%>
<jsp:include page="/common/header.jsp"/>
<jsp:include page="/common/footer.jsp"/>

<%-- 9 internal objects           --%>
<%-- PageContext                  --%>
<%-- Request                      --%>
<%-- Response                     --%>
<%-- Session                      --%>
<%-- Application (ServletContext) --%>
<%-- config (ServletConfig)       --%>
<%-- out                          --%>
<%-- page                         --%>



<%%>

</body>
</html>
