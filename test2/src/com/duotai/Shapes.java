package com.duotai;

public class Shapes {
	private String type;
	public Shapes() {
		// TODO Auto-generated constructor stub
	}
	public Shapes(String type){
		this.type = type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public double area(){
		return 0;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "类型："+ type;
	}
	

}
