package Mypack;

import java.io.PrintWriter;
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

public class EmployeeOrder implements Controller {

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		String total=null;
		PrintWriter out=res.getWriter();
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Orderdao ad1=(Orderdao) context.getBean("odao");
		HttpSession sess=req.getSession(false);
		String empid=	(String) sess.getAttribute("empid");
		Date date = new Date();  
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		String strDate= formatter.format(date);
		
		//String date=	(String) sess.getAttribute("date");
		System.out.println(empid);
		//sess.setAttribute("key1",empid);
		List<Order1> li=(List<Order1>) ad1.FindOrderByDate(empid,strDate);
		System.out.println(ad1.FindOrder(empid));
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
			int cal=Integer.parseInt(total);*/
			System.out.println(Order1.getMenup());
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
