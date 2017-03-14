package model;

//用户信息表

public class User {
	int u_id;      //用户id
	String u_name;  //用户姓名
	int u_age;    //用户年龄
	String u_sex;   //用户性别
	String u_job;   //用户职业
	String u_tele;   //用户联系电话
	String u_email;  //用户邮件
	String u_from;   //查看用户是否本地人
	String u_place;   //所属小区区片
	int u_right;    //用户权限
	
	public int getU_right() {
		return u_right;
	}
	public void setU_right(int u_right) {
		this.u_right = u_right;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public int getU_age() {
		return u_age;
	}
	public void setU_age(int u_age) {
		this.u_age = u_age;
	}
	public String getU_sex() {
		return u_sex;
	}
	public void setU_sex(String u_sex) {
		this.u_sex = u_sex;
	}
	public String getU_job() {
		return u_job;
	}
	public void setU_job(String u_job) {
		this.u_job = u_job;
	}
	public String getU_tele() {
		return u_tele;
	}
	public void setU_tele(String u_tele) {
		this.u_tele = u_tele;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public String getU_from() {
		return u_from;
	}
	public void setU_from(String u_from) {
		this.u_from = u_from;
	}
	public String getU_place() {
		return u_place;
	}
	public void setU_place(String u_place) {
		this.u_place = u_place;
	}
	
}
