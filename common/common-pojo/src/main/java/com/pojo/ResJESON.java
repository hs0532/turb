package com.pojo;


public class ResJESON {
	private String result;
	private String error;
	private String success;
	public ResJESON() {
		// TODO Auto-generated constructor stub
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	@Override
	public String toString() {
		return "ResJESON [result=" + result + ", error=" + error + ", success=" + success + "]";
	}
	

}
