package com.exercise.oop;

public class StaticT {
	private static int a = 0;
	public StaticT() {
		// TODO Auto-generated constructor stub
	}
	static{
		a++;
		System.out.println("静态初始化块1\n"+a);
	}
	static{
		a++;
		System.out.println("静态初始化块2\n"+a);
	}

}
