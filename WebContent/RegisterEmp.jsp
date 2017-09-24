<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
 
</head>
<%-- <body>
<div class="topnav">

</div>
  <div id="bg"></div>

 
<div align="center">
${msg}
</div>
<form action="register">
    
  <label for=""></label>
  <input type="number" name="empid" id="" placeholder="Enter Id" class="email">
    
  <label for=""></label>
  <input type="text" name="name" id="" placeholder="Enter name" class="pass">
    
   <label for=""></label>
  <input type="password" name="pass" id="" placeholder="password" class="pass">
    
    <label for=""></label>
  <input type="email" name="email" id="" placeholder="Enter email" class="pass">
    
    <label for=""></label>
  <input type="number" name="mobile" id="" placeholder="Enter mobile" class="pass">
       
  <button type="submit">Register Here</button>
    </form>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
 --%>
  


<div align="right">
<a href="EmpReg.jsp">Back</a>

</div>
<body background=""> 
<div align="center">
<h1 style="font-family:fantasy;">Employee Registration</h1> 
<br><br><br><br><br>
<table align="center">

<form action="register.html">
<tr><td>${ msg }</td></tr>
<tr><td><label>Enter Id</label></td>
<td><input type="number" name="empid" placeholder="Enter Id" required></td></tr>
<tr><td><label>Enter password</label></td>
<td><input type="password" name="pass" placeholder="Enter password" required></td></tr>
<tr><td><label>Enter Name</label></td>
<td><input type="text" name="name" placeholder="Enter name" required></td></tr>
<tr><td><label>Enter Email Id</label></td>
<td><input type="email" name="email" placeholder="Enter email" required></td></tr>
<tr><td><label>Enter Mobile</label></td>
<td><input type="number" name="mobile" placeholder="Enter mobile " required></td></tr>
<tr><td><input type="submit" value="Register Here"></td></tr>

</form>
    </table>
</div> 
</body>
</html>