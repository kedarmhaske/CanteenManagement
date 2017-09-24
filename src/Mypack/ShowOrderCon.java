package Mypack;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ShowOrderCon implements Controller{

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub

		   ApplicationContext app2 =new ClassPathXmlApplicationContext("Beans.xml");
			
			Orderdao r1 =(Orderdao) app2.getBean("odao");
			//System.out.println("owelcome");
			//List<Order1> list= r1.GetOrder();
			List list =r1.getOrder();
			HttpSession sess =req.getSession();
			
			int i=1;
			
			for(Iterator itr=list.iterator();itr.hasNext();)
			{
				Order1 obj = (Order1) itr.next();
				
				sess.setAttribute("oid3"+i,obj.getId() );
				sess.setAttribute("empid3"+i, obj.getEmpid());
				sess.setAttribute("mid3"+i, obj.getMid());
				sess.setAttribute("price3"+i, obj.getMenup());
				sess.setAttribute("mitem3"+i, obj.getMitem());
				sess.setAttribute("date13"+i, obj.getDate1());
				sess.setAttribute("qun3"+i, obj.getQun());
				sess.setAttribute("size3", i);
		        
		        i++;
		        
				
				
				
			}
		
			
			return new ModelAndView("ShowOrderCard");
			
		}
	}


