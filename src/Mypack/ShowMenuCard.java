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

public class ShowMenuCard implements Controller {

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter out=res.getWriter();
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		menuDao ad1=(menuDao) context.getBean("mdao");
		List<Menu> li=(List<Menu>) ad1.getMenu();
		out.println("<html>");
		out.println("<body bgcolor='CornSilk'>");
		out.println("<div align='center'>");
		out.println("<h1>Menu Card</h1>");
		out.println("<table border height=200 width=400 align='center'>");
		out.println("<th>Menu id</th>");
		out.println("<th>Menu Name</th>");
		out.println("<th>Menu Price</th>");
		out.println("<th>Add Quantity</th>");
		out.println("<th>Order Menu</th>");
		
		
		for (Iterator iterator = li.iterator(); iterator.hasNext();) {
			Menu Menu = (Menu) iterator.next();
			out.println("<tr align='center'>");
			out.println("<td>"+Menu.getMid()+"</td>");
			out.println("<td>"+Menu.getMitem()+"</td>");
			out.println("<td>"+Menu.getMenup()+"</td>");
/*
            <td>
             <input type="text" name="qun" >
                                          
              <!--    out.println(session.getAttribute("pdest" + j ));  -->
                <input type="hidden" value="<%=j%>" name="jv">
                
            </td>
			*/
			
			out.println("<td><input type='text' name='qun'>"+"</td>");
			out.println("<td><input type='hidden' value='<%=j%>' name='jv'>"+"</td>");
			out.println("</tr>");
			
		}
		
		out.println("</table>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		return null;
	}

}
