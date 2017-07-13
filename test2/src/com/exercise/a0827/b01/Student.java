package com.exercise.a0827.b01;

import com.exercise.oop.Person;

public class Student extends Person {
	private final int ID;
	private String school;
	private static final int counter = 201656000;
	private static int count = 0;
	public static Person shu = new Person();

	public Student() {
		count++;
		ID = count + counter;
	}

	public Student(String name, boolean sex, int age, String school) {
		super(name, sex, age);
		this.school = school;
		count++;
		ID = count + counter;
	}

	public static int getCount() {
		return count;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getID() {
		return ID;
	}

	public String getSchool() {
		return school;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return " " + ID + super.toString() + "\t" + school;
	}
}
