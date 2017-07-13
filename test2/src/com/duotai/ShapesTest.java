package com.duotai;

/**
	多态；
 */
public class ShapesTest {
	public static void main(String[] args) {
		Shapes[] s = new Shapes[5];
		//((Circle)s[2]).getR();
		for(int i = 0;i<s.length;i ++){
			s[i] = contets();
		}
		System.out.println("所有图形总面积："+String.format("%.2f", allArea(s)));
		
		
	}
	public static double allArea(Shapes[] n){
		double total = 0;
		for(int i =0;i<n.length;i++ ){
			total += n[i].area();
			System.out.println(n[i].toString());
		}
		return total;
		
	}
	public static Shapes contets(){
		int type = (int)(3*Math.random());
		if(type == 0){
			return new Circle("圆",3);
		}else if(type == 1){
			return new Rectangle("矩形",3,4);
		}
		else{
			return new Trianle("三角形",5,4);
		}
	}
	
}
