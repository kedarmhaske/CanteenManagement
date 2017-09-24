package Mypack;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;


public class menuDao {
	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public void registerUser(Menu menu){
		
		template.save(menu);
	}
	
	public Menu getByMid(String mid){
		
		Menu r=(Menu)template.get(Menu.class, mid);
		
		return r;
		
	}
	
public void UpdatePass(Menu menu){
		
		template.update(menu);
	}

public List<Menu> GetMenu1()
{
     List<Menu> list= template.loadAll(Menu.class);
	
	return list;
}
	
public List<?> getMenu() {
    List<?> comList = template.find("from Menu");
  //  System.out.println("Employees found: " + comList.size());
    return comList;
}

}
