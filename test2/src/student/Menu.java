package student;

import java.util.Scanner;

public class Menu {
	
	public void show() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Student[] stu = intiStudentArray();
		System.out.println("		          截至8月"+Student.getCount()+"号，已招生5人，学生信息如下：");
		printArray(stu);

		do {
			choseMenu();
			int ch = sc.nextInt();
			if(ch< 1||ch>6)
				continue;
			switch (ch) {
			case 1:
				Sort.sortGrade(stu, chose());
				printArray(stu); 
				break;
			case 2: 
				Sort.sortName(stu, chose());
				printArray(stu);
				break;
			case 3:
				Sort.sortSex(stu, chose());
				printArray(stu);
				break;
			case 4:
				Sort.sortBirthday(stu, chose());
				printArray(stu);
				break;
			case 5:
				Sort.sortSchool(stu, chose());
				printArray(stu);
				break;
			case 6:
				ModifyInformation.modifyStudentInformatin(stu);
				printArray(stu);
				break;
			case 7:
				System.out.println("程序已关闭.");
				System.exit(0);

			}
		} while (true);
	}

	public static void choseMenu() {
		System.out.println("其他业务请选择一下菜单：" + "\n================" + "\n  1、按入学成绩排序" + "\n  2、按  姓  名  排  序"
				+ "\n  3、按  性  别  排  序" + "\n  4、按出生日期排序" + "\n  5、按  学  校  排  序" + "\n  6、编 辑 学生 信 息"
				+ "\n  7、退  出  本  系  统" + "\n================" + "\n请输入[1 ~ 7]数字操作>>>>>");
	}

	public static void printArray(Student[] a) {
		System.out.println("===================================================================\n"
				+ "\t学号\t姓名\t性别\t年龄\t出生日期\t\t学校\t成绩\n"
				+ "===================================================================");
		for (Student s : a) {
			System.out.println(s);
			System.out.println("-------------------------------------------------------------------");
		}
	}

	public static Student[] intiStudentArray() {
		Student stu[] = { new Student("赵默",  true, new Date(1993, 5, 1), 780, "尚学堂"),
				new Student("李四",  false, new Date(1991, 3, 29), 800, "通州大学"),
				new Student("张三",  false, new Date(1992, 6, 16), 577, "北京大学"),
				new Student("王二",  true, new Date(1993, 3, 28), 637, "尚学堂"),
				new Student("武一",  true, new Date(1994, 11, 2), 580, "通州大学") };
		return stu;

	}

	public static int chose() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("其他业务请选择一下菜单：" + "\n================" + "\n  1、升序" + "\n  2、降序" + "\n================"
				+ "\n请输入[1 ~ 2]数字操作>>>>>");
		return sc.nextInt();
	}
}
