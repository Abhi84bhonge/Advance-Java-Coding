<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
    <title>Update Employee - Enter ID</title>
    <link rel="stylesheet" href="/updatebyId.css">
</head>
<body>
<div class="container">
    <h2>Enter Employee ID to Update</h2>

    <form action="/updatebyId" method="post">
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
