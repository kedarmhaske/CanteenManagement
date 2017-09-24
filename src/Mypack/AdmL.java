package Mypack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class AdmL implements Controller {

	
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
			
		String admin=req.getParameter("admid");
		String apass=req.getParameter("apass");
		
		HttpSession sess=req.getSession();
		sess.setAttribute("admin",apass);
		
		
		if(admin.equals("1000")&&apass.equals("admin"))
		{
			return new ModelAndView("AdminWelcome");
		}
		
		String msg="Please Enter valid id and password...";
		return new ModelAndView("adminl","msg",msg);

	}


}
