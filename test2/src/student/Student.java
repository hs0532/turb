package student;

public class Student extends Person{
	private int ID;
	private static final int counter =  200956000;
	private static int count = 0;
	private String school;
	private int grade;
	public Student() {
		count++;
	}
	public Student(String name, boolean sex, Date birthday,int grade,String school) {
		super(name,  sex, birthday);
		count++;
		ID = counter + count;
		this.school = school;
		this.grade = grade;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getID() {
		return ID;
	}
	public String getSchool() {
		return school;
	}
	public int getGrade() {
		return grade;
	}
	public static int getCount() {
		return count;
	}
	@Override
	public String toString() {
		return ID+"\t"+super.toString()+"\t"+school+"\t"+grade;
	}
	
	
	
}
