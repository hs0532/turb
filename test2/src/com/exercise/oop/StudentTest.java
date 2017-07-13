package com.exercise.oop;


public class StudentTest {
	public static void main(String[] args) {
		System.out.println("目前学校的人数是："+Student.getCount()+"\n\n\n");	
//		byte a = '0';
		Student stu1 = new Student("刘默",false,new Date(1993,5,1),780);
		Student stu2 = new Student("张三",true,new Date(1993,3,29),800);
		Student stu3 = new Student("李四",false,new Date(1992,6,16),577);
		Student stu4 = new Student("王二",true,new Date(1993,2,28),637);
		Student stu5 = new Student("武一",true,new Date(1994,11,2),580);
		System.out.println("现在开始招生：\n截至8月28日，共招生人数是："+Student.getCount()+"\n以下是所有学生的信息：");
		System.out.println("===================================================\n"
				+ "\t学号	姓名	性别 	出生日期	  	成绩\n"
				+ "===================================================\n"
				+ stu1+"\n"
				+ "---------------------------------------------------\n"
				+ stu2+"\n"
				+ "---------------------------------------------------\n"
				+ stu3+"\n"
				+ "---------------------------------------------------\n"
				+ stu4+"\n"
				+ "---------------------------------------------------\n"
				+ stu5+"\n"
				+ "===================================================\n");	
	}

}
