package test2;

public class MyCube {
	
	private MyRectangle re;
	private int h;
	
	public MyCube(){
		
	}
	public MyCube(MyRectangle re,int h){
		this.re = re;
		this.h = h;
		
		
	}
	public int area(){
		return 2*(h*re.getW()+h*re.getW()+re.area());
	}
	public int volume(){
		return h*re.area();
	}
	
}
