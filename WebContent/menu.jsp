<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">




<%-- <html >
  
</head>

<body>
${msg}
  <div id="bg"></div>
<form action="menu">
    
  <label for=""></label>
  <input type="number" name="mid" id="" placeholder="Menu Id" class="email">
    
  <label for=""></label>
  <input type="text" name="mitem" id="" placeholder="Enter menu item"  class="pass">
    
    <label for=""></label>
  <input type="number" name="menup" id="" placeholder="Enter menu price"  class="pass">
    
    
  <button type="submit">menu</button>
    <br>
    <br>
  
</form>
 
  
</body>
</html>

 --%>










 <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1 style="font-family:fantasy;">Add Menu</h1>

<table>
${ msg }
<form action="menu">
<tr><td><label>Enter Menu Id</label></td>
<td><input type="number" name="mid" placeholder="Menu Id" required></td></tr>
<tr><td><label>Enter Menu item</label></td>
<td><input type="text" required name="mitem"  placeholder="Enter menu item" required></td></tr>
<tr><td><label>Enter Menu Price</label></td>
<td><input type="number" required name="menup"  placeholder="Enter menu price" required></td></tr>

<tr><td><input type="submit" value="menu"><td></tr>

</form>

</table>

</div>

</body>
</html> 