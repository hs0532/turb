package test2;

public class MyRectangle {
	private int xUp;
	private int yUp;
	private int xDown;
	private int yDown;
	
	public MyRectangle(){
		
	}
	public MyRectangle(int xUp,int yUp,int xDown,int yDown){
		this.xUp = xUp;
		this.yUp = yUp;
		this.xDown = xDown;
		this.yDown = yDown;	
	}
	public int getW(){
		return Math.abs(xUp - xDown);
	}
	public int getH(){
		return Math.abs(yUp - yDown);
	}
	public int area(){
		return getW()*getH();
	}
	public String toString(){
		return "矩形宽："+getW()+" 高："+getH()+" 面积："+area();
	}
}
