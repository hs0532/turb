package com.pojo;

public class User_table {
	private String name;
	private String age;
	private String sex;
	public User_table() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User_table [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	

}
