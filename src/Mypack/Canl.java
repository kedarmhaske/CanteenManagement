package Mypack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Canl implements Controller {

	
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		String canid=req.getParameter("canid");
		String cpass=req.getParameter("cpass");
		
		HttpSession sess=req.getSession();
		sess.setAttribute("canid",canid);
		
		
		
		if(canid.equals("2000")&&cpass.equals("canteen"))
		{
			return new ModelAndView("AddMenu");
		}
		
		String msg="Please Enter valid id and password...";
		return new ModelAndView("canlo","msg",msg);

	}


	}


