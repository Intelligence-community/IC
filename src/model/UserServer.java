package model;

//用户服务类

public class UserServer {
	int s_id;     //服务id
	int i_id;  //服务对应的身份的ID
	public int getI_id() {
		return i_id;
	}
	public void setI_id(int i_id) {
		this.i_id = i_id;
	}
	String s_server;   //服务名称
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	
	public String getS_server() {
		return s_server;
	}
	public void setS_server(String s_server) {
		this.s_server = s_server;
	}
	
}
