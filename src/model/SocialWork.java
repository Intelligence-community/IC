package model;

import java.util.Date;

//�繤������

public class SocialWork {
	int swj_id;  //�繤��������id
	int sw_id;//�繤Ƭ��id
	String swj_content;//�繤��������
	Date swj_starttime;//�繤����ʼʱ��
	Date swi_endtime;//�繤�������ʱ��
	String swj_progress;//�繤�������
	int swj_marge;//����Ա���繤�������������ݾ������۴��
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
