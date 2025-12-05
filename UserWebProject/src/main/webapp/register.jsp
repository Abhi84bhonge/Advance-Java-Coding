<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<link rel="stylesheet" href="register.css">

<form action="/register-user" method="post">
	<h1>Register User</h1>
	<label>Enter Fullname </label> <input type="text" name="fullname"
		required> <br> <br>
		 <label>Email<input type="text" name="email" required><br> <br></label> 
		 <label>Mobile No <input type="text" name="mobileno" required>
	</label> <br> <br>
	<label> Enter username <input type="text" name="username"
		required></label><br> <br> <label>Enter Password</label> <input
		type="password" name="password" required> <br> <br>
	<input type="submit" value="sign up">
</form>