package Mypack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.cache.Cache;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class RegisterController implements Controller {
		
		public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse arg1) throws Exception {
			// TODO Auto-generated method stub
			
			String empid=req.getParameter("empid");
			String pass=req.getParameter("pass");
			String name=req.getParameter("name");
			String email=req.getParameter("email");
			String mobile=req.getParameter("mobile");
	                     	System.out.println(empid);
	      
		
		ApplicationContext app=new ClassPathXmlApplicationContext("Beans.xml");
		
		try
		{
		RegisterDao rd=(RegisterDao)app.getBean("dao");
		
		Register r=new Register();
		r.setEmpid(empid);
		r.setPass(pass);
		r.setName(name);
		r.setEmail(email);
		r.setMobile(mobile);
		
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(pass);
		
		
		rd.registerUser(r);
		return new ModelAndView("Login","msg","Register sucessfully");
		
		}catch(Exception e)
		{
			return new ModelAndView("RegisterEmp","msg","This Id is already exist");
		}
	}
}

