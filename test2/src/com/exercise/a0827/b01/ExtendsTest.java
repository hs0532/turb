package com.exercise.a0827.b01;

import com.exercise.oop.Person;

public class ExtendsTest {
	public static void main(String[] args) {
		/*
		 * Student stu1 =new Student("刘默",false,22,"十一中"); Student stu2 =new
		 * Student("张三",false,19,"四儿中"); Student stu3 =new
		 * Student("李四",true,17,"一中"); Student stu4 =new
		 * Student("王五",false,21,"十一中"); Student stu5 =new
		 * Student("姜七",true,22,"光明中学");
		 */
		Student stu[] = { 
				new Student("刘默", false, 22, "十一中"), new Student("张三", false, 19, "四儿中"),
				new Student("李四", true, 17, "一中"), new Student("王五", false, 21, "十一中"),
				new Student("姜七", true, 22, "光明中学") };
		System.out.println("   学号\t\t姓名\t性别\t年龄\t学校\n=============================================");
		// Student stu[] = {stu1,stu2,stu3,stu4,stu5} ;
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
			System.out.println("---------------------------------------------");
		}

		Student.shu.dyin(2, 4);
		Person n = new Student("姜七", true, 22, "光明中学");
		System.out.println(n);
		Student a = (Student) n;
		int age = a.getAge();
		System.out.println(age);
		Person pe[] = { 
				new Person("打我的", false, 23), new Person("瓦达", true, 15), new Person("突然", false, 43),
				new Person("我打", true, 36), new Person("破天", false, 24), new Person("区分", false, 31),
				new Person("大卫", true, 19), new Person("擦拭", false, 46), new Person("自行车", true, 25),

		};
		for (Person ats : pe) {
			System.out.println(ats);
			System.out.println("-----------------------------------");
		}

		/**
		 * 年龄升序
		 */
		System.out.println("\n\n\n\n年龄升序：\n");
		for (int i = 0; i < pe.length; i++)
			for (int j = i + 1; j < pe.length; j++) {
				int re = pe[i].compareTo(pe[j]);
				if (re > 0) {
					Person temp = pe[i];
					pe[i] = pe[j];
					pe[j] = temp;
				}
			}
		for (Person ats : pe) {
			System.out.println(ats);
			System.out.println("-----------------------------------");
		}
		/**
		 * 性别
		 */
		System.out.println("\n\n\n\n性别分类：\n");
		for (int i = 0, count = 0; i < pe.length; i++) {
			if (pe[i].getSex()) {
				Person temp = pe[i];
				pe[i] = pe[count];
				pe[count] = temp;
				count++;
			}

		}
		for (Person ats : pe) {
			System.out.println(ats);
			System.out.println("-----------------------------------");
		}

		/**
		 * 性别分类降序排列
		 */
		System.out.println("\n\n\n性别分类降序排列：\n");
		/*
		 * int counter = 0; for(int i =0;i<pe.length;i++){ if(pe[i].getSex())
		 * counter++; for(int j = i+1;j<pe.length;j++){ if(pe[j].getSex()){ int
		 * re = pe[i].compareTo(pe[j]); if(re < 0){ Person temp = pe[i]; pe[i] =
		 * pe[j]; pe[j] = temp; } } } }
		 * 
		 * System.out.println(counter);
		 */
		for (int i = 0; i < pe.length; i++)
			for (int j = i + 1; j < pe.length; j++) {
				int re = pe[i].sexDiv(pe[j]);
				if (re > 0) {
					Person temp = pe[i];
					pe[i] = pe[j];
					pe[j] = temp;
				}
			}
		for (Person ats : pe) {
			System.out.println(ats);
			System.out.println("-----------------------------------");
		}

		/**
		 * 姓名
		 */
		System.out.println("\n\n\n\n姓名：\n");

		// Person[] re =p22.divName(pe);

		/*
		 * for(int i =0;i<pe.length;i++) for(int j = i+1;j<pe.length;j++) { int
		 * re = pe[i].divName(pe[j]); if(re < 0 ){ Person temp = pe[i]; pe[i] =
		 * pe[j]; pe[j] = temp; } }
		 */

		// System.out.println();
		// System.out.println("-----------------------------------");

	}

	static Person pe1 = new Person() {  //匿名内部类
		public int getAge() {
			System.out.println("age");
			return super.getAge();
		}
	};

}
