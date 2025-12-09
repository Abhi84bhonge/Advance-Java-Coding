<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Success</title>
    <link rel="stylesheet" href="/successupdateemp.css">
</head>

<body>

<div class="container">

    <h2>✔ Operation Successful</h2>

    <c:if test="${not empty msg}">
        <p class="message">${msg}</p>
    </c:if>

    <c:if test="${empty msg}">
        <p class="message">Employee Saved Successfully!</p>
    </c:if>

    <a href="/" class="home-btn">Home</a>
    <a href="/allemployees" class="view-btn">View All Employees</a>

</div>

</body>
</html>
