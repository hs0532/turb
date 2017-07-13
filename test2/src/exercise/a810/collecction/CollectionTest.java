package exercise.a810.collecction;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Collection c = new HashSet();
		c.add("鐚�");
		c.add("缇�");
		c.add("楦�");
		c.add("楣�");
		System.out.println(c+"   "+c.size());
		Iterator t = c.iterator();
		while(t.hasNext()){
			Object  emn;
			emn = t.next();
			System.out.println(emn);
		}
		c.add("缇�");
		System.out.println(c+"   "+c.size());
		Collection c2 = new HashSet();
		c2.add(new Dog("鍦熺嫍",10,true));
		c2.add(new Dog("鍝堝＋濂�",2,false));
		c2.add(new Dog("閲戞瘺",5,true));
		
		c2.add(new Dog("闃挎媺鏂姞",4,false));
		System.out.println(c2+"   "+c2.size());
		System.out.println("澧炲姞涓ゅ彧鍙細");
		c2.add(new Dog("閲戞瘺",5,true));
		c2.add(new Dog("閲戞瘺",6,true));
		System.out.println(c2+"   "+c2.size());
//		Iterator t1 = c2.iterator();
//		while(t1.hasNext()){
//			Object  emn;
//			emn = t1.next();
//			
//			System.out.println(emn);
//		}
		Collection c3 = new HashSet();
		c3.add(new Dog("鍦熺嫍",2,false));
		c3.add(new Dog("鍝堝＋濂�",3,true));
		c3.add(new Dog("閲戞瘺",1,false));
		System.out.println(c3);
		c2.addAll(c3);
		System.out.println(c2+"   "+c2.size());
	}
}
class Dog{
	private String name;
	private int age;
	private boolean sex;
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, int age, boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String toString() {
		return "\n灏忕嫍鐨勫悕绉�: " + name + "  鍏瘝: " + (sex ? "鍏�":"姣�") + "  澶у皬: " + age;
	}
	@Override
	public boolean equals(Object obj) {
		Dog ob = (Dog)obj;
		if(this.name.equals(ob.name)&& this.age == ob.age&&this.sex == ob.sex)
			return true;
		else
			return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode() + this.age + (this.sex+"").hashCode();
	}
}