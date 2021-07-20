<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    /*
    request: for data that only use for once. ex: YouTube refresh
    session: for data that may still be useful for the client. ex: shopping cart
    application: for data that useful for others after one client used. ex: chat data
    */
    pageContext.setAttribute("name1", "Rose - pageContext");  // scope: current web page
    request.setAttribute("name2", "Mary - request"); // scope: current request and the forward
    session.setAttribute("name3", "Jack - session"); // scope: current session (from open the browser to close the browser)
    application.setAttribute("name4", "Jimmy - application"); // scope: from turn on to turn off the server
%>

<%
    // Get data from pageContext
    // pageContext.findAttribute
    // this method 

    String name1 = (String) pageContext.findAttribute("name1");
    String name2 = (String) pageContext.findAttribute("name2");
    String name3 = (String) pageContext.findAttribute("name3");
    String name4 = (String) pageContext.findAttribute("name4");
    String name5 = (String) pageContext.findAttribute("name5");
%>

<%-- output with EL expressions --%>

<h1>Values: </h1>
<h1>${name1}</h1>
<h1>${name2}</h1>
<h1>${name3}</h1>
<h1>${name4}</h1>
<h1>${name5}</h1>



<%%>

</body>
</html>
