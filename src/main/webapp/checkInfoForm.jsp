<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:useBean id="car" class="pl.altkom.web.CarBean" scope="session"/>
<jsp:setProperty name="car" property="make"/>
<jsp:setProperty name="car" property="type"/>
<jsp:setProperty name="car" property="year"/>
<jsp:setProperty name="car" property="distance"/>
<jsp:setProperty name="car" property="capacity"/>

<%--<jsp:setProperty name="car" property="*"/>--%>

<table>
    <tr>
        <td>Marka</td>
        <td><c:out value="${car.make}" /></td>
    </tr>
    <tr>
        <td>Typ</td>
        <td><jsp:getProperty name="car" property="type"/></td>
    </tr>
    <tr>
        <td>Rok produkcji</td>
        <td><c:out value="${car.year}"/></td>
    </tr>
    <tr>
        <td>Przebieg</td>
        <td><c:out value="${car.distance}"/></td>
    </tr>
    <tr>
        <td>Pojemność</td>
        <td><c:out value="${car.capacity}"/></td>
    </tr>
</table>

<form action="carInfoForm.jsp">
    <input type="submit" value="Edytuj">
</form>

<form action="add_car_info" method="get">
<%--    <input type="hidden" name="make" value='<%= request.getParameter("make")%>'>--%>
<%--    <input type="hidden" name="type" value='<%= request.getParameter("type")%>'>--%>
<%--    <input type="hidden" name="year" value='<%= request.getParameter("production_year")%>'>--%>
<%--    <input type="hidden" name="distance" value='<%= request.getParameter("millage")%>'>--%>
<%--    <input type="hidden" name="capacity" value='<%= request.getParameter("capacity")%>'>--%>
    <input type="submit" value="Zapisz samochód">
</form>


<%@include file="footer.html"%>
</body>
</html>