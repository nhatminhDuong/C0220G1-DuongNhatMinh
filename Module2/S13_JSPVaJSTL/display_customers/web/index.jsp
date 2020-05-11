<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 11/05/2020
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Display Customers</title>
  </head>
  <body>
<h3>Helloooooooooo</h3>
<form action="${pageContext.request.contextPath}/display-customers" method="get">
  <input type="submit" value="Show customer list">
</form>
  </body>
</html>
