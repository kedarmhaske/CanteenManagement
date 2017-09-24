package Mypack;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DatewiseOrder implements Controller{
	
		public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
			// TODO Auto-generated method stub
			String total=null;
			PrintWriter out=res.getWriter();
			ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
			Orderdao ad1=(Orderdao) context.getBean("odao");
		String date1=req.getParameter("date1");
	String date2=req.getParameter("date2");
	HttpSession sess=req.getSession(false);
	String empid=	(String) sess.getAttribute("empid");
	System.out.println(date1);
	System.out.println(date2);
	System.out.println(empid);
	/*SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    java.util.Date parsed = format.parse(date1);
    java.sql.Date sql_date1 = new java.sql.Date(parsed.getTime());
    format.format(sql_date1);
    java.util.Date parsed1 = format.parse(date2);
    java.sql.Date sql_date2 = new java.sql.Date(parsed1.getTime());
    format.format(sql_date2);*/
	
	/*Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen","root","root");
	Statement st=con.createStatement();	
	
	String qurey="select * from order1 where empid='"+empid+"' and date1 between '"+date1+"' and '"+date2+"'";
	ResultSet rs= st.executeQuery(qurey);
				out.println("<html>");
			out.println("<style>table{font-family : Times new Roman,sans-serif;border-collapse : inherit;width : 100%;}td,th{border : 1px solid #dddddd;text-align :left;padding : 15px;}tr:nth-child(even){background-color :#dddddd;}body{margin: 0;}.topnav {overflow: hidden;background-color: #333;}.topnav a{float: left;display: block;color: #f2f2f2;text-align: center ;padding: 14px 16px;text-decoration: none;font-size: 17px;}.topnav a:HOVER {	background-color: #ddd;	color: black;}.topnav a:ACTIVE {	background-color:#4CAF50 ;	color: white;}</style></head>");
					out.println("<body bgcolor='CornSilk'>");
					out.println("<div align='center'>");
					out.println("<h1>Your Order is</h1>");
					out.println("<table border height=200 width=400 align='center'>");
					out.println("<th>Order id</th>");
					out.println("<th>Employee id</th>");
					out.println("<th>Menu id</th>");
					out.println("<th>Menu Name</th>");
					out.println("<th>Menu Price</th>");
					out.println("<th>Qauntity</th>");
					out.println("<th>Order Date</th>");

					while(rs.next())
					{
						
						String str7=rs.getString(1);
						System.out.println(str7);
						String str8=rs.getString(2);
						System.out.println(str8);
						String str9=rs.getString(3);
						System.out.println(str9);
						String str10=rs.getString(4);
						System.out.println(str10);
						String str11=rs.getString(5);
						System.out.println(str11);
						String str12=rs.getString(6);
						System.out.println(str12);
						String str13=rs.getString(7 );
						System.out.println(str13);
						
						
			
			
				out.println("<tr align='center'>");
				out.println("<td>"+ str7+"</td>");
				out.println("<td>"+ str8+"</td>");
				out.println("<td width='400'>"+ str9+"</td>");
				out.println("<td width='400'>"+str10+"</td>");
				out.println("<td width='500'>"+str11+"</td>");
				out.println("<td width='500'>"+str12+"</td>");
				out.println("<td>"+str13+"</td>");
				out.println("</tr>");
				
			
				
			
		
			
		}
		
					out.println("</table>");
					out.println("</div>");
					out.println("</body>");
					out.println("</html>");
	
					
					

	return null;
}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
			HttpSession sess=req.getSession(false);
			String empid=	(String) sess.getAttribute("empid");
			String date1=	(String) sess.getAttribute("date");
				String date2=	(String) sess.getAttribute("date");
			System.out.println(empid);*/
			//sess.setAttribute("key1",empid);
			List<Order1> li=(List<Order1>) ad1.FindOrderByDate1(empid,date1,date2);
			//System.out.println(ad1.FindOrder(empid));
			out.println("<html>");
			out.println("<div>");
			out.println("<a href='show'>BACK");
			out.println("</a>");
			out.println("</div>");
	out.println("<style>table{font-family : Times new Roman,sans-serif;border-collapse : inherit;width : 100%;}td,th{border : 1px solid #dddddd;text-align :left;padding : 15px;}tr:nth-child(even){background-color :#dddddd;}body{margin: 0;}.topnav {overflow: hidden;background-color: #333;}.topnav a{float: left;display: block;color: #f2f2f2;text-align: center ;padding: 14px 16px;text-decoration: none;font-size: 17px;}.topnav a:HOVER {	background-color: #ddd;	color: black;}.topnav a:ACTIVE {	background-color:#4CAF50 ;	color: white;}</style></head>");
			out.println("<body bgcolor='CornSilk'>");
			out.println("<div align='center'>");
			out.println("<h1>Your Order is</h1>");
			out.println("<table border height=200 width=400 align='center'>");
			out.println("<th>Employee id</th>");
			out.println("<th>Order id</th>");
			out.println("<th>Menu id</th>");
			out.println("<th>Menu Name</th>");
			out.println("<th>Menu Price</th>");
			out.println("<th>Qauntity</th>");
			out.println("<th>Order Date</th>");

			for (Iterator iterator = li.iterator(); iterator.hasNext();) {
				Order1 Order1 = (Order1) iterator.next();
				out.println("<tr align='center'>");
				out.println("<td>"+Order1.getEmpid().getEmpid()+"</td>");
				out.println("<td>"+Order1.getId()+"</td>");
				out.println("<td>"+Order1.getMid().getMid()+"</td>");
				out.println("<td>"+Order1.getMitem()+"</td>");
				out.println("<td>"+Order1.getMenup()+"</td>");
				out.println("<td>"+Order1.getQun()+"</td>");
				out.println("<td>"+Order1.getDate1()+"</td>");
				/*total= Order1.getMenup()+total;
				int cal=Integer.parseInt(total);
				System.out.println(""+Order1.getMenup());*/
				//out.println("<td>"+cal+"</td>");
				out.println("</tr>");
				
			}
			
			out.println("</table>");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
			return null;
			
			

		
	}

}
