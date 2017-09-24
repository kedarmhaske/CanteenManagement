package Mypack;



public class Order1  {

	private int id;
	private Register empid;
	private Menu mid;
	private String date1;
	private String menup;
	private String mitem;
	private String qun;
	
	
	public Register getEmpid() {
		return empid;
	}
	public void setEmpid(Register empid) {
		this.empid = empid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Menu getMid() {
		return mid;
	}
	public void setMid(Menu mid) {
		this.mid = mid;
	}
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public String getMenup() {
		return menup;
	}
	public void setMenup(String menup) {
		this.menup = menup;
	}
	public String getMitem() {
		return mitem;
	}
	public void setMitem(String mitem) {
		this.mitem = mitem;
	}
	
	public String getQun() {
		return qun;
	}
	public void setQun(String qun) {
		this.qun = qun;
	}
	/*public Order1(Register register, Menu mid, String date1, String menup, String mitem, int qun) {
		super();
		
		this.empid = register;
		this.mid = mid;
		this.date1 = date1;
		this.menup = menup;
		this.mitem = mitem;
		this.qun = qun;
	}*/
	public Order1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
