<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register Employee</title>
    <link rel="stylesheet" href="/register.css">
</head>

<body>

    <form action="/register" method="post">
        <h2>Register Employee</h2>

        <label>Employee Name:-</label>
        <input type="text" name="name" required>

        <label>Employee Email:-</label>
        <input type="email" name="email" required>

        <label>Employee Mobile:-</label>
        <input type="text" name="mobile" required>

        <label>Employee Salary:-</label>
        <input type="number" name="salary" required>

        <label>Employee Department:-</label>
        <input type="text" name="department" required>

        <label>Employee Role :-</label>
        <input type="text" name="role" required>
        
        <label>Employee Experience:-</label>
        <input type="number" name="experience">

        <label>Employee Address:-</label>
        <input type="text" name="address">

        <label>Employee Joining Date:-</label>
        <input type="date" name="joiningDate">

        <input type="submit" value="Register">
    </form>

    <div class="footer">
        © 2026 Employee Management System | Designed by Abhijeet Bhonge
    </div>

</body>
</html>
