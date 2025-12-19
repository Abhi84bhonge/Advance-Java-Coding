<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Home</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6 text-center">

            <div class="card shadow">
                <div class="card-body">
                    <h1 class="text-primary mb-4">Welcome to Employee Page</h1>

                    <a href="getemployee-data" class="btn btn-primary">
                         Add Employee
                    </a>
                    <br><br>
                    <a href="showemployees" class="btn btn-primary">
                        Show All Employees
                    </a>
                </div>
            </div>

        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
