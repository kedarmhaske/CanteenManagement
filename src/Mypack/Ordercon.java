package Mypack;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Ordercon implements Controller {

	
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse arg1) throws Exception {
		
		
		
		
		HttpSession sess=req.getSession(false);
		int j=Integer.parseInt(req.getParameter("jv"));
		//String j=req.getParameter("jv");
		System.out.println(j);
		String jval=req.getParameter("jval");
		System.out.println(jval);
		
		String empid=(String)sess.getAttribute("empid");
		String mid=(String)sess.getAttribute("mid"+j);
		String mitem=(String)sess.getAttribute("mitem"+j);
		
		String menup=(String)sess.getAttribute("menup"+j);
		String qun=req.getParameter("qun");
		
		System.out.println(empid);
		System.out.println(mid);
		System.out.println(mitem);
		System.out.println(menup);
		System.out.println(qun);
		
		/*String empid=req.getParameter("empid");
		String mid=req.getParameter("mid");
		String menup=req.getParameter("menup");*/
		//System.out.println(empid);
		//System.out.println(qun);
ApplicationContext ord=new ClassPathXmlApplicationContext("Beans.xml");
		
Orderdao rd=(Orderdao)ord.getBean("odao");

Order1 or=new Order1();
Register reg1=new Register(empid);

Date date = new Date();  
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
String strDate= formatter.format(date);
sess.setAttribute("date",strDate);

System.out.println(mitem);
System.out.println(menup);
/*Menu menu1=new Menu(mid,mitem,menup);*/
Menu menu1=new Menu(mid);
or.setMitem(mitem);
or.setMenup(menup);
or.setEmpid(reg1);
or.setMid(menu1);
or.setDate1(strDate);
or.setQun(qun);
rd.registerOrder(or);
		//Register register = new Register(register.getEmpid());
				
		//Menu menu=new Menu(menu.getMid());
	
		//Menu menu1=new Menu();
		//menu1.getMid();
		
		//Register reg1=new Register();
		//reg1.getEmpid();
		//Order order=new Order();
		//Order.set



  
System.out.println(strDate); 

/*
//String m1=m.getMid();
//Menu m2=new Menu(menup);
//String m3=m2.getMenup();
   //System.out.println(mid);  
Register e2= new Register(empid);
   //System.out.println(empid);  



Order1 or=new Order1();

//System.out.println(empid);

//String empid;
//Register r=rd.getByEmpid(empid);


//System.out.println(e2);
	//or.setDate(odate);*/
/*
or.setQun(qun);
or.setMid(m);
or.setPrice(m);
or.setEmpid(e2);
or.setDate(date);

od1.registerOrder(or);
//System.out.println(odate);
*/		return new ModelAndView("showemporder");
		
	}
		
	}	
	 

	
	


