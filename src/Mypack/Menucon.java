package Mypack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;



public class Menucon implements Controller {

	
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse arg1) throws Exception {
	// TODO Auto-generated method stub
		String mid=req.getParameter("mid");
		String mitem=req.getParameter("mitem");
		String menup=req.getParameter("menup");
		
	
	ApplicationContext me=new ClassPathXmlApplicationContext("Beans.xml");
	
	try
	{
	menuDao md=(menuDao)me.getBean("mdao");
	
	Menu m=new Menu();
	m.setMenup(menup);
	m.setMid(mid);
	m.setMitem(mitem);
	
	
	/*System.out.println(name);
	System.out.println(email);
	System.out.println(pass);*/
	
	md.registerUser(m);
	return new ModelAndView("menu","msg","insert sucessfully");
	
	}catch(Exception e)
	{
		return new ModelAndView("menu","msg","This Id is already exist");
	}
}
	}


