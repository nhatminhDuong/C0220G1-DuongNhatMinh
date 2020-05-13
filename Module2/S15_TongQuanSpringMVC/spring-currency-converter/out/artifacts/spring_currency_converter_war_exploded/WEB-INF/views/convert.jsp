<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 13/05/2020
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
    <style>
        .message {
            color: darkred;
            font-size: larger;
        }
    </style>
</head>
<body>
<p class="message">
    ${message}
</p>
<form action="/convert" method="post">
    <fieldset style="width: 225px">
        <legend align="center">Currency Converter</legend>
        <table>
            <tr>
                <td><label for="rate">RATE</label></td>
                <td><input type="text" name="rate" id="rate" placeholder="23000"></td>
            </tr>
            <tr>
                <td><label for="usd">USD</label></td>
                <td><input type="text" name="usd" id="usd" placeholder="0"></td>
            </tr>
            <tr>
                <td><label for="vnd">VND</label></td>
                <td><input type="text" name="usd" id="vnd" value='Click Convert' disabled></td>
            </tr>
        </table>
        &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;
        <input type="submit" value="Convert">
    </fieldset>
</form>
</body>
</html>
