package model;

import java.util.Date;

//信息类

public class Information {
	int m_id;//信息ID
	String m_title;//信息标题
	String m_content;//信息内容
	Date m_pushtime;//发布时间
	String m_style;//信息类型
	String m_author;//信息发布作者
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_title() {
		return m_title;
	}
	public void setM_title(String m_title) {
		this.m_title = m_title;
	}
	public String getM_content() {
		return m_content;
	}
	public void setM_content(String m_content) {
		this.m_content = m_content;
	}
	public Date getM_pushtime() {
		return m_pushtime;
	}
	public void setM_pushtime(Date m_pushtime) {
		this.m_pushtime = m_pushtime;
	}
	public String getM_style() {
		return m_style;
	}
	public void setM_style(String m_style) {
		this.m_style = m_style;
	}
	public String getM_author() {
		return m_author;
	}
	public void setM_author(String m_author) {
		this.m_author = m_author;
	}
	
}
