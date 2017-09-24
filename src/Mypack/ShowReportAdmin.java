package Mypack;


		import java.io.PrintWriter;
	import java.util.Iterator;
	import java.util.List;

	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	import org.springframework.web.servlet.ModelAndView;
	import org.springframework.web.servlet.mvc.Controller;

	
	public class ShowReportAdmin implements Controller {

		
		public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
			// TODO Auto-generated method stub
			PrintWriter out=res.getWriter();
			ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
			Orderdao ad=(Orderdao ) context.getBean("odao");
			List<Order1> li=(List<Order1>) ad.getOrder();
			out.println("<html>");
			out.println("<body bgcolor='CornSilk'>");
			out.println("<div align='center'>");
			out.println("<h1>Employee Order Details</h1>");
			out.println("<table border height=200 width=600>");
			out.println("<th> Order id</th>");
			out.println("<th>Employee ID</th>");
			out.println("<th>Menu ID</th>");
			out.println("<th>Price</th>");
			out.println("<th>Menu Name</th>");
			out.println("<th>Date</th>");
			out.println("<th>Qauntity</th>");
			
			for (Iterator iterator = li.iterator(); iterator.hasNext();) {
				Order1 order = (Order1) iterator.next();
				out.println("<tr align='center'>");
				out.println("<td>"+order.getId()+"</td>");
				out.println("<td>"+order.getEmpid().getEmpid()+"</td>");
				out.println("<td width='400'>"+order.getMid().getMid()+"</td>");
				out.println("<td width='400'>"+order.getMenup()+"</td>");
				out.println("<td width='500'>"+order.getMitem()+"</td>");
				out.println("<td width='500'>"+order.getDate1()+"</td>");
				out.println("<td>"+order.getQun()+"</td>");
				out.println("</tr>");
				
			}
			
			out.println("</table>");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
			return null;
		}

	}


