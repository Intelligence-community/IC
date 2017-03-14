package model;

//社工区域分配类

public class ZoneAllocation {

	int sw_id;   //社工服务区片id
	int u_id;    //服务区片负责人id
	String sw_place;  //服务区片
	public int getSw_id() {
		return sw_id;
	}
	public void setSw_id(int sw_id) {
		this.sw_id = sw_id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getSw_place() {
		return sw_place;
	}
	public void setSw_place(String sw_place) {
		this.sw_place = sw_place;
	}
	
}
