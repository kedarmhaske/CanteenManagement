<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1 align="center">
<b>The employee details:</b></h1>
<table align="center" border="1" height="200" width="400">
<tr><td>
Order Id</td><td><%= session.getAttribute("key5") %></td></tr>
<br>
<tr><td>
Employee Id</td><td><%= session.getAttribute("key6") %></td></tr>
<br>
<tr><td>
Menu Id</td><td><%= session.getAttribute("key10") %></td></tr>
<br>
<tr><td>
 MenuItem</td><td><%= session.getAttribute("key12") %></td></tr>
 
 <tr><td>
 Menu Price </td><td><%= session.getAttribute("key11") %></td></tr>
<br>
<tr><td>
Quantity</td><td><%= session.getAttribute("key14") %></td></tr>
<br>
<tr><td>
 Date</td><td><%= session.getAttribute("key13") %></td></tr>
</table>
</body>

</html>