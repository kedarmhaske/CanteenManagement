package Mypack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class Orderdao {

	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	/*public void registerOrder(Order1 reg){
		
		template.save(reg);
	}*/
public void registerOrder(Order1 reg){
		
		template.save(reg);
	}
	
/*public Order getByEmpid(String Empid){
		
		Order r=(Order)template.get(Order.class, Empid);
		
		return r;
		
	}*/
	
	public Register FindByEmpid(String Empid)
	{
		Register r=(Register)template.find("from Register where empid='"+Empid+"'");
		return r;
		
	}
	
	public Menu FindByMid(String Mid)
	{
		Menu m=(Menu)template.find("from Menu where mid='"+Mid+"'");
		
		return m;
		
		
		
	}
	public Menu FindByMenup(String Menup)
	{
		Menu m1=(Menu)template.find("from Menu where menup='"+Menup+"'");
		
		return m1;
		
		
		
	}
	
	/*public Menu FindOrderByDate(String empid,String date1)
	{
		Menu m1=(Menu)template.find("from Order1 where empid='"+empid+"'and date1='"+date1+"'");
		
		return m1;
			
	}
	*/
	public List<Order1> FindOrderByDate(String empid,String date1) {
	    List<Order1> comList = template.find("from Order1 where empid='"+empid+"'and date1='"+date1+"'");
	    System.out.println("Employees found: " + comList.size());
	    return comList;
	}
	/*public List<Order1> FindOrderByDate1(String date1,String date2) {
	    List<Order1> comList = template.find("from Order1 where date1 between date1='"+date1+"'and date1='"+date2+"'");
	    System.out.println("Employees found: " + comList.size());
	    return comList;
	}*/
	public List<Order1> FindOrderByDate1(String empid,String date1,String date2) {
	    List<Order1> comList = template.find("from Order1 where empid='"+empid+"' and date1 between '"+date1+"' and '"+date2+"'");
	    System.out.println("Employees found: " + comList.size());
	    return comList;
	}
	/*public Order1 FindOrder(String empid)
	{
		Order1 m1=(Order1)template.find("from Order1 where empid='"+empid+"'");
		
		return m1;
		
		
		
	}*/
	public List<Order1> FindOrder(String empid) {
	    List<Order1> comList = template.find("from Order1 where empid='"+empid+"'");
	    System.out.println("Employees found: " + comList.size());
	    return comList;
	}
	
public void UpdatePass(Register reg){
		
		template.update(reg);
	}
/*	
public List<Order1> GetOrder()
{
     List<Order1> list= template.loadAll(Order1.class);
	
	return list;
}*/


public List<Order1> getOrder1(){
	List<Order1> list=template.loadAll(Order1.class);
	return list;
}
public List<Order1> getOrder() {
    List<Order1> comList = template.find("from Order1");
    System.out.println("Employees found: " + comList.size());
    return comList;
}public void deleteorder(Order r)
{
	
	template.delete(r);
	
}



}
