<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 16/05/2020
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form:form action="/" method="post" modelAttribute="operands">
    <table>
        <tr>
            <td><label for="firstOperand">First Operand</label></td>
            <td><label for="secondOperand">Second Operand</label></td>
        </tr>
        <tr>
<%--                            <td><input type="text" id="firstOperand" name="firstOperand"></td>--%>
<%--                            <td><input type="text" id="secondOperand" name="secondOperand"></td>--%>
            <td><form:input id="firstOperand" path="firstOperand"/></td>
            <td><form:input id="secondOperand" path="secondOperand"/></td>
        </tr>
    </table>
<%--        <input type="submit" formaction="/addition" value="Addition(+)">--%>
<%--        <input type="submit" formaction="/subtraction" value="Subtraction(-)">--%>
<%--        <input type="submit" formaction="/multiplication" value="Multiplication(X)">--%>
<%--        <input type="submit" formaction="/division" value="Division(/)">--%>
    <form:button formaction="/addition">Addition(+)</form:button>
    <form:button formaction="/subtraction">Subtraction(-)</form:button>
    <form:button formaction="/multiplication">Multiplication(X)</form:button>
    <form:button formaction="/division">Division(/)</form:button>
</form:form>
<h3 style="color: darkred">${result}</h3>
</body>
</html>
