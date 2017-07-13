package student;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
	private String name;
	@SuppressWarnings("unused")
	private int age;
	private final boolean sex;
	private Date birthday;

	public Person() {
		sex = true;
	}

	public Person(String name,  boolean sex,Date birthday) {
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		int nowYear = new GregorianCalendar().get(Calendar.YEAR);
		return nowYear - birthday.getYear();
	}

	public boolean isSex() {
		return sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	@Override
	public String toString() {
		return name + "\t" + (sex? "男":"女") + "\t" + this.getAge() + "\t" + birthday.toString();
	}

}
