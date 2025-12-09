<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Employees</title>
    <link rel="stylesheet" href="/allemployees.css">
</head>

<body>

<h2>All Employees</h2>

<!-- Home Button -->
<div class="top-buttons">
    <a href="/" class="home-btn">🏠 Home Page</a>
</div>

<div class="table-container">
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Department</th>
            <th>Role</th>
            <th>Salary</th>
            <th>Experience</th>
            <th>Address</th>
            <th>Joining Date</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach var="emp" items="${employees}">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.name}</td>
                <td>${emp.email}</td>
                <td>${emp.mobile}</td>
                <td>${emp.department}</td>
                <td>${emp.role}</td>
                <td>${emp.salary}</td>
                <td>${emp.experience} yrs</td>
                <td>${emp.address}</td>
                <td>${emp.joiningDate}</td>
            </tr>
        </c:forEach>
    </tbody>

</table>
</div>

<div class="footer">
    © 2026 Employee Management System | Designed by Abhijeet Bhonge
</div>

</body>
</html>
