package com.exercise.oop;

public class Date {
	private int year;
	private int month;
	private int day;
	public Date() {
		// TODO Auto-generated constructor stub
	}
	public Date(int year,int month,int day){
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
	public String getMonth() {
		if(month<10)
			return "0"+month;
		else
			return month+"";
	}
	public String getDay() {
		if(day<10)
			return "0"+day;
		else
			return ""+day;
	}
	
	public String toString() {
		
		return year+"-"+getMonth()+"-"+getDay();
	}
}
