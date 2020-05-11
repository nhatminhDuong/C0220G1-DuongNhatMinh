<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%!
    Map<String, String> dictionary = new HashMap<>();
%>

<%
    dictionary.put("hello", "Xin chào");
    dictionary.put("how", "Thế nào");
    dictionary.put("book", "Quyển sách");
    dictionary.put("computer", "Máy tính");

    String search = request.getParameter("search");

    String result = dictionary.get(search);
    if (result != null) {
        out.println("Word: " + search);
        out.println("<br>");
        out.println("Result: " + result);
    } else {
        out.println("Not found");
    }

%>

</body>
</html>