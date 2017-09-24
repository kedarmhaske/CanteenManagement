package Mypack;

public class Menu {
	private String mid;
	private String mitem;
	private String menup;

	public Menu() {
		// TODO Auto-generated constructor stub
	}
	public Menu(String mid) {
		this.mid = mid;
		// TODO Auto-generated constructor stub
	}
	/*public Menu(String mid, String mitem, String menup) {
		super();
		this.mid = mid;
		this.mitem = mitem;
		this.menup = menup;
	}*/

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMitem() {
		return mitem;
	}

	public void setMitem(String mitem) {
		this.mitem = mitem;
	}

	public String getMenup() {
		return menup;
	}

	public void setMenup(String menup) {
		this.menup = menup;
	}

}
