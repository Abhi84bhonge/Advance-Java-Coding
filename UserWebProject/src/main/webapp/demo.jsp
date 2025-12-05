<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Add Numbers</title>
    
</head>

<body>


    <h2>Add Two Numbers (JSP)</h2>
Enter Name : <input type="text" name="name" placeholder="enter name">
    <%
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
        //for view page output 
        out.println(sum);
    %>


</body>
</html>
