package model;

import java.util.Date;

//双劳人员签到类

public class DoubleWorkers {
	int p_id;//签到ID
	int u_id;//双劳人员ID
	Date p_time;//签到时间
	String p_place;//签到地点
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public Date getP_time() {
		return p_time;
	}
	public void setP_time(Date p_time) {
		this.p_time = p_time;
	}
	public String getP_place() {
		return p_place;
	}
	public void setP_place(String p_place) {
		this.p_place = p_place;
	}
	

}
