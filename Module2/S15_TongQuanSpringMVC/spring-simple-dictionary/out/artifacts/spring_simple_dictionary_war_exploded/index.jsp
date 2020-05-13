<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 13/05/2020
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<form action="/search" method="get">
    <fieldset style="width: 260px">
        <legend align="center">English-Vietnamese Dictionary</legend>
        <table>
            <tr>
                <td><label for="e-word">English</label></td>
                <td><input type="text" name="e-word" id="e-word" placeholder="Enter a word" value="${englishWord}"></td>
            </tr>
            <tr>
                <td><label for="v-word">Vietnamese</label></td>
                <td><input type="text" name="v-word" id="v-word" placeholder="Click translate" value="${vietnameseWord}" disabled></td>
            </tr>
        </table>
        &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;
        <input type="submit" value="Translate">
    </fieldset>
</form>
</body>
</html>
