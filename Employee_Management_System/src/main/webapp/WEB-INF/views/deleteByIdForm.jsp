<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Delete Employee</title>
    <link rel="stylesheet" href="/deleteByIdForm.css">
</head>
<body>
<div class="container">

    <c:if test="${emp == null}">
        <p class="error">${msg}</p>
    </c:if>

    <c:if test="${emp != null}">
        <h2>Delete Employee</h2>
        <p><b>ID:</b> ${emp.id}</p>
        <p><b>Name:</b> ${emp.name}</p>
        <p><b>Email:</b> ${emp.email}</p>
        <p><b>Mobile:</b> ${emp.mobile}</p>
        <p><b>Salary:</b> ${emp.salary}</p>
        <p><b>Department:</b> ${emp.department}</p>
        <p><b>Role:</b> ${emp.role}</p>
        <p><b>Experience:</b> ${emp.experience}</p>
        <p><b>Joining Date:</b> ${emp.joiningDate}</p>

        <form action="/deleteEmployee" method="post">
            <input type="hidden" name="id" value="${emp.id}">
            <button type="submit">Confirm Delete</button>
        </form>
    </c:if>

    <a href="/" class="home-btn">Home</a>
</div>
</body>
</html>
