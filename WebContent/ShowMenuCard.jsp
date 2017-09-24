<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table{
font-family : Times new Roman,sans-serif;
border-collapse : inherit;
width : 100%;
}

td,th{

border : 1px solid #dddddd;
text-align :left;
padding : 15px;
}

tr:nth-child(even){

background-color :#dddddd;

}
body{margin: 0;


}

.topnav {

overflow: hidden;
background-color: #333;

}
.topnav a{
float: left;
display: block;
color: #f2f2f2;
text-align: center ;
padding: 14px 16px;
text-decoration: none;
font-size: 17px;


}

.topnav a:HOVER {
	background-color: #ddd;
	color: black;
	
}

.topnav a:ACTIVE {
	
	background-color:#4CAF50 ;
	color: white;
	
}


</style>

</head>
<body>

<div class="topnav">
 
    <a href="showempallorder.jsp">Show My Order</a>
  <a href=" showemporder.jsp">Your All Orders</a>
  <a href="Datewiseorder.jsp">Date Wise All Orders</a>
  <a href="Login.jsp">Back</a>
   <a href="Home.jsp">Logout</a>
     
      
</div>
 <div align="right">
<% 
 out.println(session.getAttribute("key"));
%>
</div>
<h2>Make A Order....</h2>

    <table> 
           <tr>
               <th>Menu Id</th>
               <th>Menu Name</th>
               <th>Price</th>
               <th>Add Qauntity</th>
               <th>Add Order</th>
               <!-- <th>Cost</th>
               <th>Duration</th> -->
               
           </tr>
           <%  
              Integer s=(Integer)session.getAttribute("size");
              int i = 0;
              if(s!=null)
            	  i=s;
              for (int j=1;j<= i; j++)
              {
              
               
            	  %>
            	  <form action="odr">
           <tr>
                 <td>
                       	<% 
                        out.println(session.getAttribute("mid" + j )); 
                        %>
                  </td>
              
                  <td>
                       <% 
                       out.println(session.getAttribute("mitem" + j )); 
                       %>
                 </td>
              
                  <td>
                      <% 
                      out.println(session.getAttribute("menup" + j )); 
                       %>
                 </td>
              
           
                 <td>
                  <input type="number" name="qun" min=1 >
                                               
                   <!--    out.println(session.getAttribute("pdest" + j ));  -->
                     <input type="hidden"  value="<%=j%>" name="jv">
                     
                 </td>
              
              <td>
                
                    <button name="jval" value="<%=j%>" type="submit">Order</button>
                   <!--  <input type="submit" value="Order">  -->
                  </td>
              
                <%-- <td>
                     <% 
                     out.println(session.getAttribute("pcost" + j )); 
                     %>
                </td>
              
                <td>
                     <% 
                     out.println(session.getAttribute("pduration" + j )); 
                     %>
               </td> --%> 
            </tr>
            
           
                  </form>     
           
            
            <% 
            
              }
          
            %>
            
               
                           
               </table>
               
                 
</body>
</html>