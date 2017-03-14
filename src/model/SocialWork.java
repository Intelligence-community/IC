package model;

import java.util.Date;

//社工任务类

public class SocialWork {
	int swj_id;  //社工工作安排id
	int sw_id;//社工片区id
	String swj_content;//社工任务内容
	Date swj_starttime;//社工任务开始时间
	Date swi_endtime;//社工任务结束时间
	String swj_progress;//社工任务进度
	int swj_marge;//管理员对社工任务完成情况根据居民评价打分
	public int getSwj_id() {
		return swj_id;
	}
	public void setSwj_id(int swj_id) {
		this.swj_id = swj_id;
	}
	public int getSw_id() {
		return sw_id;
	}
	public void setSw_id(int sw_id) {
		this.sw_id = sw_id;
	}
	public String getSwj_content() {
		return swj_content;
	}
	public void setSwj_content(String swj_content) {
		this.swj_content = swj_content;
	}
	
	public Date getSwj_starttime() {
		return swj_starttime;
	}
	public void setSwj_starttime(Date swj_starttime) {
		this.swj_starttime = swj_starttime;
	}
	public Date getSwi_endtime() {
		return swi_endtime;
	}
	public void setSwi_endtime(Date swi_endtime) {
		this.swi_endtime = swi_endtime;
	}
	public String getSwj_progress() {
		return swj_progress;
	}
	public void setSwj_progress(String swj_progress) {
		this.swj_progress = swj_progress;
	}
	public int getSwj_marge() {
		return swj_marge;
	}
	public void setSwj_marge(int swj_marge) {
		this.swj_marge = swj_marge;
	}
	
}
