<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<div align="right">
<a href="forgot.jsp">Back</a>

<body bgcolor="pink"> 
<div align="center">
<h1 style="font-family:fantasy;">Employee Conform Password</h1> 
<table align="center">
<form action="conform">
<tr><td><label>Enter password</label></td>
<td><input type="text" name="pass1" placeholder="Enter password" required></td></tr>
<tr><td><label>Conform Password</label></td>
<td><input type="text" name="pass2" placeholder="Enter password " required></td></tr>
<tr><td><input type="submit" value="Conform"></td></tr>
</form>
    </table>
</body>
</html>