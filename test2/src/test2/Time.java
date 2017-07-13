package test2;

public class Time {
	private static 	int[] leap = {0,31,60,91,121,152,182,213,244,274,305,335,366};
					   //{31,28,31,30, 31, 30, 31, 31, 30, 31, 30, 31};
						//private String date; 
	private int year;
	private int month;
	private int day;
	
	public Time(){
		
	}
	public Time(int year,int month,int day){
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
	public boolean isRunYeay(){
		if(year%4==0&&year%100!=0||year % 400 ==0)
			return true;
		else
			return false;
	}
	public int getDate(){
		//int date = 1;
		if(isRunYeay())
			return leap[month-1]+day;
		else
			return leap[month-1]+day-1;
	
	/*	for(int i =1;i<month;i++){
		if((year%4==0||year%400==0)&&month==2)
			date +=29;
		else if(year ==1||year == 3||year ==5||year==7||year==8||year==10||year == 12)
			date +=31;
		else if((year%4!=0||year%400!=0)&&month == 2)
			date +=28;
		else
			date +=30;
		
		
		}*/
		
	}

}
