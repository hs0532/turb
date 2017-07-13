package test2;

public class Dog {
	private String kind;
	private String name;
	private int age;
	private boolean sex;
	private int weight;
	
	public Dog(){
		
	}
public Dog(String kind,String name,int age,boolean sex,int weight){
	this.kind = kind;
	this.name = name;
	this.age = age;
	this.sex = sex;
	this.weight = weight;
		
	}
	public void setKind(String kind){
		this.kind=kind;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age= age;
	}
	public void setWight(int weight){
		this.weight = weight;
	}
	public void setSex(boolean sex){
		this.sex = sex;
	}
	public String getKind(){
		return kind;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getWeight(){
		return weight;
	}
	public boolean getSex(){
		return sex;
	}
	public String getInfo(){
		return "种类："+kind+"\n名字："+name+"\n性别："+(sex ? "公":"母")+"\n年龄："+age+"\n体重："+weight+"KG";
	}
	
}
