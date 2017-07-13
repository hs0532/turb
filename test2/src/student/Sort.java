package student;


public class Sort {
	public static void sortName(Object[] obj,int n){
		if(n ==1)
			System.out.println("		          所有学生名字<<<升序>>>排序：");
		else
			System.out.println("		          所有学生名字<<<降序>>>排序：");
		Student[] stu = (Student[])obj;
		for (int i = 0; i < stu.length; i++) {
			for (int j = i; j < stu.length; j++) {
				int flag = stu[i].getName().compareTo(stu[j].getName()); 
				if(flag>0&&n == 2){
					Student temp;
					temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}else if(flag<0&&n == 1){
					Student temp;
					temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}						
			}
		}
	}
	
	public static void sortGrade(Object[] obj,int n){
		if(n ==1)
			System.out.println("		          所有学生入学成绩<<<升序>>>排序：");
		else
			System.out.println("		          所有学生入学成绩<<<降序>>>排序：");
		Student[] stu = (Student[])obj;
		for (int i = 0; i < stu.length; i++) {
			for (int j = i; j < stu.length; j++) {
				int flag = stu[i].getGrade() - stu[j].getGrade(); 
				if(flag < 0&& n == 2){
					Student temp;
					temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}else if(flag > 0&& n ==1){
					Student temp;
					temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}										
			}
		}
		
	}
	public static void sortSex(Object[] obj,int n){
		if(n ==1)
			System.out.println("		          所有学生性别<<<升序>>>排序：");
		else
			System.out.println("		          所有学生性别<<<降序>>>排序：");
		Student[] stu = (Student[])obj;
		int count =0;
		for (int i = 0; i < stu.length; i++) {			
				if( n ==1){	
					if(stu[i].isSex()){
					Student temp;
					temp = stu[i];
					stu[i] = stu[count];
					stu[count] = temp;
					count ++;
					}
					
				}else if(n==2){
					if(stu[i].isSex() != true){
						Student temp;
						temp = stu[i];
						stu[i] = stu[count];
						stu[count] = temp;
						count ++;
						}
				}						
			
		}
	}
	public static void sortBirthday(Object[] obj,int n){
		if(n ==1)
			System.out.println("		          所有学生出生日期<<<升序>>>排序：");
		else
			System.out.println("		          所有学生出生日期<<<降序>>>排序：");
		Student[] stu = (Student[])obj;
		for (int i = 0; i < stu.length; i++) {
			for (int j = i; j < stu.length; j++) {
				int flag = stu[i].getBirthday().compareTo(stu[j].getBirthday());
				if(flag > 0 && n ==2){
					Student temp;
					temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}else if(flag < 0 && n ==1){
					Student temp;
					temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}
			
				
					
			}
		}
	}
	public static void sortSchool(Object[] obj,int n){
		if(n ==1)
			System.out.println("		          所有学生学校<<<升序>>>排序：");
		else
			System.out.println("		          所有学生学校<<<降序>>>排序：");
		Student[] stu = (Student[])obj;
		for (int i = 0; i < stu.length; i++) {
			for (int j = i; j < stu.length; j++) {
				int flag = stu[i].getSchool().compareTo(stu[j].getSchool()); 
				if(flag>0&&n == 1){
					Student temp;
					temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}else if(flag < 0&&n == 2){
					Student temp;
					temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}
			}		
		}
	}
}
