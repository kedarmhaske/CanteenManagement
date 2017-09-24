package Mypack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ForgotControler implements Controller{

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub

		String empid=req.getParameter("empid");
		String mobile=req.getParameter("mobile");
		
		ApplicationContext app=new ClassPathXmlApplicationContext("Beans.xml");
		
		try{
				RegisterDao rd=(RegisterDao)app.getBean("dao");
				Register r=rd.getByEmpid1(empid);
			
				
				String r2=r.getName();
				
				HttpSession sess=req.getSession();
				sess.setAttribute("key1",empid);
				sess.setAttribute("key2",mobile);
				sess.setAttribute("key3",r.getEmail());
						
				/*HttpSession session=req.getSession();
				session.setAttribute("key", r2);
				*/
				if(empid.equals(r.getEmpid()) && mobile.equals(r.getMobile()))
				{
				
					return new ModelAndView("conform");
				}
				String msg="Please Enter valid id and Mobile";
				return new ModelAndView("Login","msg",msg);

			}catch(Exception e)
			{
				String msg="Please Enter valid id and Mobile";
				return new ModelAndView("Login","msg",msg);
			}
			
			
	}

}
