<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 12/05/2020
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table border="1" style="text-align: center">
    <tr>
        <td>Name</td>
        <td><b>${requestScope["product"].getName()}</b></td>
    </tr>
    <tr>
        <td>Price</td>
        <td>${requestScope["product"].getPrice()}</td>
    </tr>
    <tr>
        <td>Image</td>
        <td><img width="100px" src='${requestScope["product"].getImagePath()}' alt="Loading Error"/></td>
    </tr>
</table>
</body>
</html>
