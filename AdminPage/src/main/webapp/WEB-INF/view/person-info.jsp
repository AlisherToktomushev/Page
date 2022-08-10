
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Alisher
  Date: 09.08.2022
  Time: 7:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>


    <title>Title</title>
</head>
<body style="background: #d3d3d3">
<div style="text-align: center">
<h2 style="font-family: 'Hind Madurai', sans-serif;
font-weight: 600;
font-size:30.2px ;
line-height: 49px;">You can here add a new person</h2>

<form:form action="savePerson" modelAttribute="person">
    <form:hidden path="id"></form:hidden>
    <p style="font-family: 'Hind Madurai', sans-serif;
    font-size: 20px;
    line-height: 19px; ">
    Name <form:input path="name" cssStyle="
    border: 1px solid #d64374;width: 150px;"/>
    <br><br>
    Surname <form:input path="surname" cssStyle="
    border: 1px solid #d64374;width: 150px;"/>
    <br><br>
    Department <form:input path="department" cssStyle="
    border: 1px solid #d64374;width: 150px; "/>
    <br><br>
    Salary <form:input path="salary" cssStyle="
    border: 1px solid #d64374;width: 150px; "/>
</p>



<input style="background:#D23166; border-radius: 5px;color: #fafafa;font-size: 18px;width: 50px;text-align: center;" type="submit" value="Ok"/>
</div>


</form:form>

</body>
</html>
