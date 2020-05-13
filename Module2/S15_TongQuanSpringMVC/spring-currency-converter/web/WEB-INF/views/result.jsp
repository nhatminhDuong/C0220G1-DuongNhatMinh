<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 13/05/2020
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<fieldset style="width: 225px">
    <legend align="center">Result</legend>
    <table>
        <tr>
            <td><label for="rate">RATE</label></td>
            <td><input type="text" name="rate" id="rate" disabled value="${rate}"></td>
        </tr>
        <tr>
            <td><label for="usd">USD</label></td>
            <td><input type="text" name="usd" id="usd" disabled value="${usd}"></td>
        </tr>
        <tr>
            <td><label for="vnd">VND</label></td>
            <td><input type="text" name="usd" id="vnd" disabled value="${vnd}"></td>
        </tr>
    </table>
</fieldset>
<a href="/convert">Continue to convert</a>
</body>
</html>
