package com.duotai;

public class Rectangle extends Shapes{
	private int l;
	private int w;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(String str ,int l,int w){
		super(str);
		this.l = l;
		this.w = w;
	}
	public void setL(int l) {
		this.l = l;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getL() {
		return l;
	}
	public int getW() {
		return w;
	}
	public double area(){
		return l*w;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"长："+l+"宽："+w+"面积："+this.area();
	}

}
