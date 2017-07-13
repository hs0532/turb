package exercise.a802jiekou;

import exercise.a802.test.Arithmatic;
import exercise.a802.test.B;
import exercise.a802.test.C;
import static test2.Welcome.goodBye;
/**
 * 
 * 接口的导入 import；
 *
 */

public class InterTest {
	static F f = new F(){ // 匿名内部类，在类构造器括号后加｛方法｝
		public int addm(int x, int y) {
			System.out.print(x+" + "+y+" = ");
			return x+y;
		}
	};
	public static void main(String[] args) {
		
		System.out.println(f.addm(2,7));
		C test = new D();
		System.out.println(test.div(7, 8));
		B t = new D();
		/*
		 * B去定义一个对象 该对象只能用它自身和继承来的方法，不能用D的方法
		 * */
		int tt = t.mul(3, 9);
		((Arithmatic) t).add(2, 4);
		/**
		 * 、强制转换 向下转型，将父类的对象还原为子类的引用 ， 向下转型Father a = new Son();此时假设method（）Son特有的方法
		 * 
		 * 
		 * 另外 Java规定向下转型格式为： 子类名 变量名 = （子类名）父亲对象变量； Son a = (son) a;
		 * (（son）a).方法； 之后：a.method();此时，可以访问子类对象特有的方法
		 * 
		 * 由对象变量可以引用子类的对象，Object 得对象变量可以引用任意类的对象
		 * 
		 * 注意：向下转型必须有一个前提是父类的对象引用
		 */
		D t2 = new D();
		int tt2 = t2.mul(6, 4);
		System.out.println(tt + " " + tt2);
		goodBye();
	}
}

class D implements C { //J接口的实现
	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public double div(int x, int y) {
		// TODO Auto-generated method stub
		return x * 1.0 / y;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x * y;
	}
}
abstract class F{
	public abstract int addm(int x,int y);
}