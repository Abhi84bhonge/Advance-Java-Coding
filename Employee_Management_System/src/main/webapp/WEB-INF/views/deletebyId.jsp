<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Delete Employee - Enter ID</title>
    <link rel="stylesheet" href="/delete.css">
</head>
<body>
<div class="container">
    <h2>Enter Employee ID to Delete</h2>

    <form action="/deletebyId" method="post">
        Employee ID: <input type="number" name="id" required>
        <button type="submit">Fetch Employee</button>
    </form>

    <c:if test="${not empty msg}">
        <p class="error">${msg}</p>
    </c:if>

    <a href="/" class="home-btn">Home</a>
</div>
</body>
</html>
