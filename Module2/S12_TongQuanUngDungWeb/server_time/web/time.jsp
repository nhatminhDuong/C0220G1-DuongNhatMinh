<%@ page import="java.util.Date" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 11/05/2020
  Time: 9:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Server time</title>
</head>
<body>
<h1>Only admin can see this server time:</h1>
<%
    PrintWriter writer = response.getWriter();
    Date today = new Date();
%>

<h3 style="color: red;"><%=today%></h3>
</body>
</html>
