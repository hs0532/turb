package student;

import java.util.Scanner;

public class ModifyInformation {
	public static void modifyStudentInformatin(Object[] o){
		Student[] stu =(Student[])o;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean ex = true;
		do{
			modifyMenu();
			int ch = sc.nextInt();
			switch(ch){
				case 1: Modify.mod(findName(stu)); break;
				case 2: Modify.mod(findId(stu));break;
				case 3: ex = false;break;
				
			}
			}while(ex);
	}

	private static void modifyMenu() {
		System.out.println("其他业务请选择一下菜单："
				+ "\n================"
				+ "\n  1、按姓名查找"
				+ "\n  2、按学号查找"
				+ "\n  3、返回"
				+  "\n================"
				+ "\n请输入[1 ~ 3]数字操作>>>>>");
	}
	public static Student findName(Object[] o){
		Student[] stu =(Student[]) o;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生姓名\n");
		
		String str = sc.next();
		System.out.println("查找中.......");
		for (int i = 0; i < stu.length; i++) {
			if(str.compareTo(stu[i].getName())==0){
				prinOne(stu[i]);
				return stu[i];
			}else if(i ==stu.length-1){
				System.out.println("不存在该学生");
			return null;
			}
		}
		return null;
	}
	public static Student findId(Object[] o){
		Student[] stu =(Student[]) o;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生学号");
		int str = sc.nextInt();
		System.out.println("查找中.......");
		for (int i = 0; i < stu.length; i++) {
			int n = stu[i].getID() - str;
			if(n==0){
				prinOne(stu[i]);
				return stu[i];
				
			}else if(i ==stu.length-1){
				System.out.println("不存在该学生");
				return null;
			}
			
		}
		return null;
	}
	public static void prinOne(Student o) {
		System.out.println("===================================================================\n"
				+ "\t学号\t姓名\t性别\t年龄\t出生日期\t\t学校\t成绩\n"
				+ "===================================================================");
		System.out.println(o);	

	}
	
}
class Modify{
	public static void mod(Student stu){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean ex = true;
		do{
			modifyMenu();
			int ch = sc.nextInt();
			switch(ch){
				case 1: modName(stu);  break;
				case 2: modGrade(stu); break;
				case 3: modSchool(stu); break;
				case 4: ex = false;break;
				
			}
			}while(ex);
	}

	private static void modifyMenu() {
		System.out.println("其他业务请选择一下菜单："
				+ "\n================"
				+ "\n  1、修改姓名"
				+ "\n  2、修改成绩"
				+ "\n  3、修改学校"
				+ "\n  4、返回"
				+  "\n================"
				+ "\n请输入[1 ~ 5]数字操作>>>>>");
		
	}
	public static void modName(Student stu) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入新的姓名");
		String str = sc.next();
		System.out.println("修改.......");
		stu.setName(str);
		ModifyInformation.prinOne(stu);

	}
	
	public static void modGrade(Student stu) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入新的成绩");
		int str = sc.nextInt();
		System.out.println("修改.......");
		stu.setGrade(str);
		ModifyInformation.prinOne(stu);

	}
	public static void modSchool(Student stu) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入新的学校");
		String str = sc.next();
		System.out.println("修改.......");
		stu.setSchool(str);
		ModifyInformation.prinOne(stu);

	}
}
