package student;

@SuppressWarnings("rawtypes")
public class Date implements Comparable{
	
	private int year;
	private int month;
	private int day;
	public Date() {
		// TODO Auto-generated constructor stub
	}
	public Date(int year, int month, int day) {
		
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	@Override
	public String toString() {
		return year+"-"+String.format("%02d",month)+"-"+String.format("%02d",day);
	}
	@Override
	public int compareTo(Object o) {
		Date stu = (Date)o;
		int year = this.getYear() - stu.getYear(); 
		int month = this.getMonth() - stu.getMonth(); 
		int day = this.getDay() - stu.getDay(); 
		if(year > 0){
			return 1;
		}else if(month >0&&year == 0){
			return 1;
		}else if(day > 0&&year == 0&&month ==0){
			return 1;
		}else if(day ==0 &&year == 0&&month ==0)
			return 0;
		return -1;
	}
}
