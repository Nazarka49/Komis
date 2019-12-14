<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 14.12.2019
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, tr, th, td {border: 1px solid; border-collapse: collapse; text-align: center}
    </style>
</head>
<body>

    <%!
        int silnia(int n) {
            if (n <=1) return 1;
            return n*silnia(n-1);
        }
    %>

    <% int num = 10; %>
    <% Object p = request.getParameter("num");%>
    <% if(p != null)  num = Integer.parseInt(p.toString());%>
    <% %>

    <table>
        <tr>
            <th>Liczba</th>
            <th>Silnia</th>
        </tr>
        <% for (int i = 1; i <=num; i++) { %>
        <tr>
            <td><%= i %></td>
            <td><%= silnia(i)%></td>
        </tr>
        <% } %>
</table>
</body>
</html>
