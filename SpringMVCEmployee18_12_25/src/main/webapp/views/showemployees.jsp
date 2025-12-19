<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow p-4">

        <h2 class="text-center mb-4 text-primary">Employee List</h2>

        <table class="table table-bordered table-striped text-center align-middle">
            <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Role</th>
                    <th>Salary</th>
                    <th>Action</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach var="employee" items="${emp}">
                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.name}</td>
                        <td>${employee.role}</td>
                        <td>${employee.salary}</td>
                      <td class="d-flex flex-column align-items-center gap-2">
    <button type="button"
            class="btn btn-danger btn-sm px-3 w-100"
            onclick="deleteemployee(${employee.id})">
        Delete
    </button>

    <button type="button"
            class="btn btn-danger btn-sm px-3 w-100"
            onclick="updateemployee(${employee.id})">
        Update
    </button>
</td>





                    </tr>
                </c:forEach>

                <c:if test="${empty emp}">
                    <tr>
                        <td colspan="5" class="text-center text-muted">
                            No employees found
                        </td>
                    </tr>
                </c:if>
            </tbody>
        </table>

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

<script>
function deleteemployee(id) {
    if (confirm("Are you sure you want to delete this employee?")) {
        window.location.href = "deleteemployee?id=" + id;
    }
}

function updateemployee(id){
 if(confirm("you want to update employee?")){
   window.location.href="updateemployee?id="+id;
 }
}
</script>

</body>
</html>
