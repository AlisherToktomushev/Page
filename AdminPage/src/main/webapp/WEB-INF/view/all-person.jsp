<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Alisher
  Date: 07.08.2022
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
</head>
<body style="background: #d3d3d3">
<div style="text-align: center">
<table style="display: inline-block;">

    <tr>
        <th style="padding: 20px;font-family: 'Hind Madurai', sans-serif;
    font-size: 20px;
    line-height: 19px;">Name</th>
        <th style="padding: 20px;font-family: 'Hind Madurai', sans-serif;
    font-size: 20px;
    line-height: 19px;">Surname</th>
        <th style="padding: 20px;font-family: 'Hind Madurai', sans-serif;
    font-size: 20px;
    line-height: 19px;">Department</th>
        <th style="padding: 20px;font-family: 'Hind Madurai', sans-serif;
    font-size: 20px;
    line-height: 19px;">Salary</th>
    </tr>
    <c:forEach var="emp" items="${allEmps}">
        <c:url var="updateButton" value="/updateInfo">
            <c:param name="empId" value="${emp.id}"/>

        </c:url>
        <c:url var="deleteButton" value="/deletePerson">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>
    <tr style="font-family: 'Hind Madurai', sans-serif;
    font-size: 20px;
    line-height: 19px; margin: 30px">
        <td style="padding: 20px;font-family: 'Hind Madurai', sans-serif;
    font-size: 20px;
    line-height: 19px;" >${emp.name}</td>
        <td style="padding: 20px;font-family: 'Hind Madurai', sans-serif;
    font-size: 20px;
    line-height: 19px;">${emp.surname}</td>
        <td style="padding: 20px;font-family: 'Hind Madurai', sans-serif;
    font-size: 20px;
    line-height: 19px;">${emp.department}</td>
        <td style="padding: 20px;font-family: 'Hind Madurai', sans-serif;
    font-size: 20px;
    line-height: 19px;">${emp.salary}</td>
        <td>
            <input style="background:#D23166; border-radius: 5px;color: #fafafa;font-size: 20px;width: 80px;" type="button" value="update" onclick="window.location.href='${updateButton}'"/>
        <input style="background:#D23166; border-radius: 5px;color: #fafafa;font-size: 20px;width: 80px;" type="button" value="delete" onclick="window.location.href='${deleteButton}'">

    </tr>
</c:forEach>
</table>

<br>
<input style="background:#D23166; border-radius: 5px;color: #fafafa;font-size: 20px;width: 80px" type="button" value="Add" onclick="window.location.href='addNewPerson' "/>
</div>
</body>
</html>
