package Mypack;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class RegisterDao {
	
		HibernateTemplate template;

		public HibernateTemplate getTemplate() {
			return template;
		}

		public void setTemplate(HibernateTemplate template) {
			this.template = template;
		}
		
		public void registerUser(Register reg){
			
			template.save(reg);
		}
		
		
		
public Register getByEmpid1(String empid){
			
			Register r=(Register)template.get(Register.class, empid);
			
			return r;
			
		}
		
		
		
		public Register getByEmpid(String empid){
			
			Register r=(Register)template.find("from Register where empid='"+empid+"'");
			
			return r;
			
		}
		
public void UpdatePass(Register reg){
			
			template.update(reg);
		}
		

}
