package com.duotai;
import static java.lang.Math.PI;
public class Circle extends Shapes{
	private int r;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(String str,int r){
		super(str);
		this.r = r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getR() {
		return r;
	}
	public double area(){
		return PI*r*r;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"半径："+r+"面积："+this.area();
	}
}
