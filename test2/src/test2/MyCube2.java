package test2;

public class MyCube2 {
	private int h;
	MyRectangle ae ;
	public MyCube2(){
		
	}
	public MyCube2(int xUp,int yUp,int xDown,int yDown ,int h){
		ae = new MyRectangle(xUp,yUp, xDown, yDown);
		this.h = h;
	}
	public int area(){
		return 2*(h*ae.getW()+h*ae.getH()+ae.area());
	}
	public int volume(){
		return h*ae.area();
	}

}
