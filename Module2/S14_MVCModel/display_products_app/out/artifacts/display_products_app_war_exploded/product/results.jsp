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
    <title>Searching product</title>
    <style>
        .message {
            color: limegreen;
            font-size: larger;
            font-weight: bold;
        }
    </style>
</head>
<body>
<p>
    <a href="/products">Back to product list</a>
</p>
<h2 style="color: orangered">Results</h2>
<p>
    <span class="message">${requestScope["message"]}</span>
</p>
<table border="1" style="text-align: center">
    <c:if test='${requestScope["message"]} != "No product found."'>
        <tr>
            <td><b>ID</b></td>
            <td><b>Product Name</b></td>
            <td><b>Price($)</b></td>
            <td><b>Image</b></td>
        </tr>
    </c:if>
    <c:forEach var="product" items='${requestScope["matchedProducts"]}'>
        <tr>
            <td style="width: 30px">${product.getId()}</td>
            <td style="width: 120px">${product.getName()}</td>
            <td style="width: 50px">${product.getPrice()}</td>
            <td style="width: 50px"><img width="45px" src="${product.getImagePath()}"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
