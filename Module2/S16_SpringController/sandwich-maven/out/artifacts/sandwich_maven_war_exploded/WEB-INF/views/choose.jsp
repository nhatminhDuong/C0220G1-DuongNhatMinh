<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<form:form action="/choose" method="post" modelAttribute="sandwich">
    <label>
        <form:checkbox path="lettuceTicked" value="${sandwich.lettuceTicked}"/>
        Lettuce
    </label>
    <label>
        <form:checkbox path="tomatoTicked" value="${sandwich.tomatoTicked}"/>
        Tomato
    </label>
    <label>
        <form:checkbox path="mustardTicked" value="${sandwich.mustardTicked}"/>
        Mustard
    </label>
    <label>
        <form:checkbox path="sproutsTicked" value="${sandwich.sproutsTicked}"/>
        Sprouts
    </label>
    <form:button>Save</form:button>
</form:form>
</body>
</html>
