package model;

import java.util.Date;

//定人推送信息类

public class PushInformation {
	int sm_id;// 定人推送ID
	String sm_title;//信息标题
	String  sm_content;//信息内容
	int u_id;//定人推送ID
	Date sm_pushtime;//推送时间
	public int getSm_id() {
		return sm_id;
	}
	public void setSm_id(int sm_id) {
		this.sm_id = sm_id;
	}
	public String getSm_title() {
		return sm_title;
	}
	public void setSm_title(String sm_title) {
		this.sm_title = sm_title;
	}
	public String getSm_content() {
		return sm_content;
	}
	public void setSm_content(String sm_content) {
		this.sm_content = sm_content;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public Date getSm_pushtime() {
		return sm_pushtime;
	}
	public void setSm_pushtime(Date sm_pushtime) {
		this.sm_pushtime = sm_pushtime;
	}
	
}
