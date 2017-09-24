package Mypack;

public class Register {
	String empid;
	String name;
	String email;
	String mobile;
	String pass;
	public Register(String empid){
		
		this.empid=empid;
	}
	public Register() {
		// TODO Auto-generated constructor stub
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public Register(String empid, String name, String email, String mobile, String pass) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.pass = pass;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
}
