<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Update Employee</title>
    <link rel="stylesheet" href="/updateByIdForm.css">
</head>
<body>
<div class="container">

<c:if test="${emp == null}">
    <p style="color:red; font-weight:bold;">Employee Not Found!</p>
</c:if>

<c:if test="${emp != null}">
    <h2>Update Employee</h2>
    <form action="/updateEmployee" method="post">
        <input type="hidden" name="id" value="${emp.id}">

        Name: <input type="text" name="name" value="${emp.name}" required><br>
        Email: <input type="text" name="email" value="${emp.email}" required><br>
        Mobile: <input type="text" name="mobile" value="${emp.mobile}" required><br>
        Salary: <input type="number" name="salary" value="${emp.salary}" required><br>
        Department: <input type="text" name="department" value="${emp.department}" required><br>
        Role: <input type="text" name="role" value="${emp.role}" required><br>
        Experience: <input type="number" name="experience" value="${emp.experience}" required><br>
        Joining Date: <input type="date" name="joiningDate" value="${emp.joiningDate}" required><br><br>

        <button type="submit">Update Employee</button>
    </form>
</c:if>

<a href="/" class="home-btn">Home</a>
</div>
</body>
</html>
