package Mypack;

import java.util.Date;

public class Order  {

	private int id;
	private Register register;
	private Menu mid;
	private String date1;
	private String menup;
	private String mitem;
	private int qun;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Register getRegister() {
		return register;
	}
	public void setRegister(Register register) {
		this.register = register;
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
	public int getQun() {
		return qun;
	}
	public void setQun(int qun) {
		this.qun = qun;
	}
	public Order(Register register, Menu mid, String date1, String menup, String mitem, int qun) {
		super();
		
		this.register = register;
		this.mid = mid;
		this.date1 = date1;
		this.menup = menup;
		this.mitem = mitem;
		this.qun = qun;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	
}
