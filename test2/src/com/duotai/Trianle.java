package com.duotai;

public class Trianle extends Shapes {
	private int a;
	private int h;
	public Trianle() {
		// TODO Auto-generated constructor stub
	}
	public Trianle(String str,int a, int h) {
		super(str);
		this.a = a;
		this.h = h;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getA() {
		return a;
	}
	public int getH() {
		return h;
	}
	public double area() {
		return a*h/2.0;
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"三角形底边："+a+"三角形高："+h+"面积："+this.area();
	}
	
}
