<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 11/05/2020
  Time: 4:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display</title>
</head>
<body>
<h4 style="color: darkred;">Customer List</h4>
<table border="1px" style="border-color: lightgrey; text-align: center;">
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td style="width: 120px"><b><c:out value="${customer.getName()}"></c:out></b></td>
            <td style="width: 80px"><c:out value="${customer.getDateOfBirth()}"></c:out></td>
            <td style="width: 100px"><c:out value="${customer.getAddress()}"></c:out></td>
            <td style="width: 50px"><img width="40px" src="${customer.getImagePath()}"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
