<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 12/05/2020
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h2 style="color: limegreen">Products</h2>
<p>
    <a href="/products?action=create">Create a new product</a>
</p>
<p>
<form method="get">
    <input type="hidden" value="search" name="action">
    <input width="220px" type="text" name="search-name" placeholder="Enter a product name here">
    <input type="submit" value="Search product">
</form>
</p>
<table border="1" style="text-align: center">
    <tr>
        <td><b>ID</b></td>
        <td><b>Product Name</b></td>
        <td><b>Price($)</b></td>
        <td><b>Image</b></td>
        <td><i>Edit</i></td>
        <td><i>Delete</i></td>
    </tr>
    <c:forEach var="product" items='${requestScope["products"]}'>
        <tr>
            <td style="width: 30px">${product.getId()}</td>
            <td style="width: 120px"><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td style="width: 50px">${product.getPrice()}</td>
            <td style="width: 50px"><img width="45px" src="${product.getImagePath()}"></td>
            <td style="width: 50px"><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
            <td style="width: 50px"><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
