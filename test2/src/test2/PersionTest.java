package test2;

import exercise.Dia;
import exercise.Ex;
import exercise.Table;

public class PersionTest {
	public static void main(String[] args){
		Ex e = new Ex();
		Person p1 = new Person();
		Dog d1 = new Dog("中华田园犬","黑黑",5,true,24);
		Computer c = new Computer();
	
		Table t = new Table();
		Dia d = new Dia();
		Area a = new Area();
		e.mul();
		t.table();
		d.dia();
		
		p1.setName("小李");
		p1.setAge(13);
		p1.setSex(true);
		System.out.println(p1.getInfo());
		System.out.println("\n\n");
		
		
		System.out.println(d1.getInfo());
	
		
		Welcome.goodBye();
		int s1 = Area.volume(5);
		System.out.println("边长为5的立方体的体积："+s1);
		int s2 = a.volume(3, 4, 5);
		System.out.println("长宽高分别为5,4,3的体积："+s2);
		double s3 = a.volume(5.0, 6.0);
		System.out.println("半径为5.0高为6.0的圆柱体的体积："+s3);
		MyRectangle m = new MyRectangle(5,10,1,2);
		System.out.println(m.toString());
		
		MyCube m2 = new MyCube(m,5);
		int area = m2.area();
		int volume = m2.volume();
		System.out.println("立方体的面积为："+area+" 体积为："+volume);
		
		MyCube2 m3 = new MyCube2(7, 8, 4, 3, 6);
		System.out.println("立方体的面积："+m3.area()+"  立方体的体积为："+m3.volume());
		
		Time t1 = new Time(2016,7,27);
		int date = t1.getDate();
		System.out.println("2016/5/14是2016年第："+date+"天");
		c.show();
		
	}

}
