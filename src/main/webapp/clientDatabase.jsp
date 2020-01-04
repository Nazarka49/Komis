<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 04.01.2020
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<sql:setDataSource dataSource="jdbc:komis" var="db" />
<sql:query var="tb" dataSource="${db}" >
    SELECT * FROM pojazd
</sql:query>
<table>
    <tr>
        <th>Marka</th>
        <th>Typ</th>
        <th>Rok</th>
        <th>Przebieg</th>
        <th>Pojemnosc</th>
        <th>Edytuj</th>
    </tr>
<c:forEach var="m" items="${tb.rows}">
    <tr>
        <td><c:out value="${m.marka}"/></td>
        <td><c:out value="${m.typ}"/></td>
        <td><c:out value="${m.rok}"/></td>
        <td><c:out value="${m.przebieg}"/></td>
        <td><c:out value="${m.pojemnosc}"/></td>
        <td><form action="carInfoForm.jsp"><input type="submit" value="Edytuj"></form></td>
    </tr>
</c:forEach>
</table>
</body>
</html>
