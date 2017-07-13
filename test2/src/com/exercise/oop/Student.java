package com.exercise.oop;

public class Student {
	private int student_number;
	private String name;
	private boolean sex;
	private Date birthday;
	private int score;
	private static final int count = 200911000;
	private static int counter = 0;
	public Student() {
		// TODO Auto-generated constructor stub
		counter++;
	}
	public static final Person shu =new Person();
	public Student(String name,boolean sex,Date birthday,int score){
		this();
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.student_number = counter+count;
		this.score = score;
		
	}
	public void setStudent_number() {
		this.student_number = counter;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getStudent_number() {
		return student_number;
	}
	public boolean getSex(){
		return sex;
	}
	public int getScore() {
		return score;
	}
	public static int getCount() {
		return counter;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "  "+student_number+"	"+name+"	"+(sex ? "男":"女")+"	"+birthday.toString()+"	"+score;
	}

}
