package com.exercise.oop;

class Base {

	/*
	 * public void aMethoda( ); final void aMethodb( ); void aMethodc(){ }
	 * private void aMethodd( );
	 */
	{
		System.out.println("wadawdwa");
	}
	public void method() {
		System.out.print("Base method");
	}
}

class Child extends Base {
	public void methodB() {
		System.out.print("Child methodB");
	}
}

public class Sample {
	public static void main(String[] args) {
		Base base = new Child();
		((Child) base).methodB();
	}
}

/*
 * public class Something { public static void main(String[] args) { final Other
 * o = new Other(); new Something().addOne(o);// 1 System.out.println(o.i); }
 * 
 * public void addOne(Other o) { o.i++;// 2 o = new Other();// 3 } }
 * 
 * class Other { public int i; }
 */
/*
 * abstract class MyClass{ public int constInt=5; public abstract void
 * method(int a); public abstract void anotherMethod( ); //add code here public
 * void method( ){ } }
 * 
 * class HelloA { public HelloA() { System.out.println("HelloA"); }
 * 
 * { System.out.println("I'm A class"); } static { System.out.println("static A"
 * ); } }
 * 
 * public class HelloB extends HelloA { public HelloB() {
 * System.out.println("HelloB"); }
 * 
 * { System.out.println("I'm B class"); } static { System.out.println("static B"
 * ); }
 * 
 * public static void main(String[] args) { new HelloB(); } }
 */