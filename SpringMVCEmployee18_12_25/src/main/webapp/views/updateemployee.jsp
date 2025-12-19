<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow p-4 col-md-6 mx-auto">

        <h3 class="text-center text-primary mb-4">Update Employee</h3>

        <form action="addemployee" method="post">

            <input type="hidden" name="id" value="${employee.id}"/>

            <div class="mb-3">
                <label class="form-label">Name</label>
                <input type="text" name="name" class="form-control"
                       value="${employee.name}" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Role</label>
                <input type="text" name="role" class="form-control"
                       value="${employee.role}" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Salary</label>
                <input type="number" name="salary" class="form-control"
                       value="${employee.salary}" required>
            </div>

            <button type="submit" class="btn btn-danger w-100">
                Update Employee
            </button>
        </form>
        
        
         <div class="text-center mt-3">
            <a href="getemployee-data" class="btn btn-primary me-2">
                Add New Employee
            </a>
            <a href="index" class="btn btn-secondary">
                Go Home
            </a>
        </div>
        
        
        
    </div>
</div>

</body>
</html>
