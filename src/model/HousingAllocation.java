package model;


//房屋分配类

public class HousingAllocation {
	int b_id;//房屋ID
	int b_allnum;//房屋总数
	int num;//房屋租住数量
	String b_year;//年份
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public int getB_allnum() {
		return b_allnum;
	}
	public void setB_allnum(int b_allnum) {
		this.b_allnum = b_allnum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getB_year() {
		return b_year;
	}
	public void setB_year(String b_year) {
		this.b_year = b_year;
	}
	

}
