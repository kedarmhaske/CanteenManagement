<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
${ msg }
<form action="odr">
<tr><td><label>Enter Id</label></td>
<td><input type="number" name="empid" placeholder="Enter Id" required></td></tr>
<tr><td><label>Enter menuId</label></td>
<td><input type="number" name="mid" placeholder="Enter id" required></td></tr>
<tr><td><label>Enter date</label></td>
<td><input type="text" name="od" placeholder="Enter dname" required></td></tr>
<tr><td><label>Enter Email Id</label></td>
<td><input type="text" name="temail" placeholder="Enter temail" required></td></tr>
<tr><td><label>Enter quantity</label></td>
<td><input type="number" name="qun" placeholder="Enter qmobile " required></td></tr>
<input type="submit" value="order"><td></tr>
</form>

</table> 

</body>
</html>