<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Search Employee</title>

    <link rel="stylesheet" href="/getEmpbyId.css">
</head>

<body>

<div class="container">

    <h2>Search Employee by ID</h2>

    <form action="/getEmpbyId" method="post">
        Enter Employee ID:
        <input type="number" name="id" required>
        <button type="submit">Search</button>
    </form>

    <hr>

    <c:if test="${emp != null}">
        <div class="emp-details">
            <h3>Employee Details</h3>
            <p><b>ID:</b> ${emp.id}</p>
            <p><b>Name:</b> ${emp.name}</p>
            <p><b>Email:</b> ${emp.email}</p>
            <p><b>Mobile:</b> ${emp.mobile}</p>
            <p><b>Salary:</b> ${emp.salary}</p>
            <p><b>Department:</b> ${emp.department}</p>
            <p><b>Role:</b> ${emp.role}</p>
            <p><b>Experience:</b> ${emp.experience}</p>
            <p><b>Joining Date:</b> ${emp.joiningDate}</p>
        </div>
    </c:if>

    <c:if test="${emp == null && not empty param.id}">
        <p class="error">Employee Not Found!</p>
    </c:if>

    <a href="/" class="home-btn">Home</a>

</div>

<div class="footer">
    © 2026 Employee Management System | Designed by Abhijeet Bhonge
</div>

</body>
</html>
