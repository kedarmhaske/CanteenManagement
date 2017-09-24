package Mypack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ConformControler implements Controller {

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ConformControler");
		String pass1=req.getParameter("pass1");
		String pass2=req.getParameter("pass2");
		
		ApplicationContext app=new ClassPathXmlApplicationContext("Beans.xml");
		
		try{
				RegisterDao rd=(RegisterDao)app.getBean("dao");
							
				HttpSession sess=req.getSession(false);
				String id=(String)sess.getAttribute("key1");
				String key3=(String) sess.getAttribute("key3");
				System.out.println(key3);
				Register r=rd.getByEmpid1(id);
				
				if(pass1.equals(pass2))
				{
					
					r.setPass(pass1);
					rd.UpdatePass(r);
							
					SendEmail send=new SendEmail();
					System.out.println("Mail is going to send..");
					System.out.println(key3);
					send.ok(key3);
					System.out.println("Mail is send..");
					return new ModelAndView("Login","msg","Sucessfully password changes");
				}
			}catch(Exception e)
			{
				e.printStackTrace();
				String msg="Please Enter valid id and Mobile";
				return new ModelAndView("Login","msg",msg);
			}
		return new ModelAndView("Login","msg","Please Enter valid id and Mobile.....");
			

	}

}
