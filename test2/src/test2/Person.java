package test2;

public class Person {
	private String name;
	private int age;
	private boolean sex;
	
	public Person(){
		
	}
	
	public void setName(String name){
		this.name = name;
		
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setSex(boolean sex){
		this.sex = sex;
	}
	public String getName(){
		return name;
	}
	public boolean getSex(){
		return sex;
	}
	public int getAge(){
		return age;
	}
	public int add(int x,int y){
		return x+y;
	}
	public String getInfo(){
		 return "姓名："+name+"\n年龄："+age+"\n性别："+(sex ? "男":"女");
	}
	

}
