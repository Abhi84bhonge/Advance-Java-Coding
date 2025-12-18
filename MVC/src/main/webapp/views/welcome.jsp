<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- scripplet tags -->

<% int a=20;
int b=34;
int c=a+b;
%>

<!-- expression tag -->
<h2> <%= c %></h2>

<h2 id=23>welcome page</h2>


<!-- declaration tag -->
<%! int value=2300;      
   public int getmet(){
	int v=value;
	return v;
} 
%>

<h4> the value is <%= getmet() %></h4>


 
<h4> </h4>

<h1>hey , welcome ${xyz}</h1><br>
<h1>your city ${city}</h1>



</body>
</html>