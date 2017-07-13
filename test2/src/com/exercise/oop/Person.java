package com.exercise.oop;

@SuppressWarnings("rawtypes")
public class Person implements Comparable {
	@Override
	public int compareTo(Object o) {// 比较年龄大小
		Person aa = (Person) o;
		int re = 0;
		if (this.age > aa.age)
			re = 1;
		else if (this.age < aa.age)
			re = -1;
		else
			re = 0;
		return re;
	}

	public int sexDiv(Object w) {// 返回性别
		Person ww = (Person) w;
		int r = (this.sex + "").compareTo(ww.sex + "");
		int z = -(this.age - ww.age);
		if (r != 0)
			return r;
		else
			return z;

	}

	// public Person[] divName(Person an[]){//中文首字母
	//
	//
	//
	// }
	private String name;
	private final boolean sex;
	private int age;

	public Person() {
		sex = true;
	}

	public Person(String name, boolean sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public boolean getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return "\t" + name + "\t" + (sex ? "男" : "女") + "\t" + age;
	}

	public void dyin(int a, int b) {
		System.out.println(a + b);
	}

}
