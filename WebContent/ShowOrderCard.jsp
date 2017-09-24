<%-- <%@page import="org.apache.jasper.jstl.core.ForEach"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
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
  <%response.sendRedirect("emporder"); %>
 <%--   
  <a href="ShowMenuCard.jsp">Back</a>
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
               <th>Order Id</th>
               <th>Empid</th>
               <th>Menu Id</th>
               <th>Price</th>
               <th>Menu Name</th>
               <th>Date</th>
               <th>Quantity</th>
               <!-- <th>Cost</th>
               <th>Duration</th> -->
               
            </tr>
           <%  
              String s=session.getAttribute("size3").toString();
              int i = Integer.parseInt(s);
              
              for (int j=1;j<= i; j++)
              {
              
               
            	  %>
            	  <!-- <form action="odr"> -->
           <tr>
                 <td>
                       	<% 
                        out.println(session.getAttribute("oid3" + j )); 
                        %>
                  </td>
              
                  <td>
                       <% 
                       out.println(session.getAttribute("empid3" + j )); 
                       %>
                 </td>
              
                  <td>
                      <% 
                      out.println(session.getAttribute("mid3" + j )); 
                       %>
                 </td>
              
           
                 <td>
                  
                     <% 
                      out.println(session.getAttribute("price3" + j )); 
                       %>
                 </td>
              
              
              <td>
                  
                     <% 
                      out.println(session.getAttribute("mitem3" + j )); 
                       %>
                 </td>
              
              <td> 
                  
                     <% 
                      out.println(session.getAttribute("date13" + j )); 
                       %>
                 </td>
              
              
               
            </tr>
            
           
              
           <tr><c:forEach var="lv" items="${list}">
            <td>${lv.id}</td>
             <td>${lv.empid}</td>
             <td>${lv.mid}</td>
              <td>${lv.price}</td>
               <td>${lv.mitem}</td>
                <td>${lv.date1}</td>
                 <td>${lv.qun}</td>
                 </c:forEach>
                 </tr>
                 
                 
         <% 
            
              }
          
            %>
             
               
                           
               </table>
               
                  --%>
</body>
</html>