package Mypack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.cache.Cache;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller
{

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		String empid=req.getParameter("empid");
		String emppass=req.getParameter("pass");
		
		
ApplicationContext app=new ClassPathXmlApplicationContext("Beans.xml");
		
try{
		RegisterDao rd=(RegisterDao)app.getBean("dao");
		System.out.println(empid);
		Register r=rd.getByEmpid1(empid);
	//	Register r1=rd.getByEmpid(emppass);
		
		String r2=r.getName();
		//String r4=r.getPass();
		
				
		HttpSession session=req.getSession();
		session.setAttribute("key", r2);
		session.setAttribute("empid",empid);
		
		//System.out.println(empid);
		//System.out.println(emppass);
		if(empid.equals(r.getEmpid()) && emppass.equals(r.getPass()))
		{
			return new ModelAndView("ShowMenu");
		}
		String msg="Please Enter valid id and password...";
		return new ModelAndView("Login","msg",msg);

	}catch(Exception e)
	{
		String msg="Please Enter valid id and password";
		return new ModelAndView("Login","msg",msg);
	}
	
	}
	}
