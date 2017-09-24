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

public class ShowMenuCon implements Controller {

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		

		   ApplicationContext app2 =new ClassPathXmlApplicationContext("Beans.xml");
			
			menuDao r1 =(menuDao) app2.getBean("mdao");
			
			List<Menu> list= r1.GetMenu1();
			
			HttpSession sess =req.getSession();
			
			int i=1;
			
			for(Iterator itr=list.iterator();itr.hasNext();)
			{
				Menu obj = (Menu) itr.next();
				
				sess.setAttribute("mid"+i,obj.getMid() );
				sess.setAttribute("mitem"+i, obj.getMitem());
				sess.setAttribute("menup"+i, obj.getMenup());
				sess.setAttribute("size", i);
		        
		        i++;
		        
				
				
				
			}
			
			
			return new ModelAndView("ShowMenuCard");
			
		}
		
		
	}


