package model;

//社工评价与反馈类

public class EvaluativeFeedback {
	int ef_id;//社工评价与反馈ID
	int u_id;//反馈人
	int swj_id;//对应反馈任务ID
	String ef_evaluation;//评价
	String ef_feedback;//反馈
	public int getEf_id() {
		return ef_id;
	}
	public void setEf_id(int ef_id) {
		this.ef_id = ef_id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public int getSwj_id() {
		return swj_id;
	}
	public void setSwj_id(int swj_id) {
		this.swj_id = swj_id;
	}
	public String getEf_evaluation() {
		return ef_evaluation;
	}
	public void setEf_evaluation(String ef_evaluation) {
		this.ef_evaluation = ef_evaluation;
	}
	public String getEf_feedback() {
		return ef_feedback;
	}
	public void setEf_feedback(String ef_feedback) {
		this.ef_feedback = ef_feedback;
	}
	
}
