package model;

import java.util.Date;

//��Ϣ��

public class Information {
	int m_id;//��ϢID
	String m_title;//��Ϣ����
	String m_content;//��Ϣ����
	Date m_pushtime;//����ʱ��
	String m_style;//��Ϣ����
	String m_author;//��Ϣ��������
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
