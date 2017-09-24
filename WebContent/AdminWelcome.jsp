<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>
body {margin:0;
background-image: url("C:/max.jpg");
background-repeat:no-repeat;
 background-size: 1320px 600px;
}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
    background-color: #4CAF50;
    color: white;
}
</style>

</head>

<body bgcolor="pink"> 

<div class="topnav">
  Welcome <%= session.getAttribute("admin") %>
  <a href="Show.jsp">Employee Order details</a>
  <a href="ShowSpecific.jsp">Specific Employee Order details</a>
  <a href="ShowAdminMenu.jsp">Canteen Menu card</a>
  <a href="Home.jsp">Back</a>
 
</div>

</body>
</html>




