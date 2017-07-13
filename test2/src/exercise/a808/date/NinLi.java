package exercise.a808.date;

import java.util.Calendar;
//import java.util.Date;
import java.util.GregorianCalendar;

public class NinLi {
	public static void main(String[] args) {
		for (int i = 0; i < 12; i++) {
			month(i);
		}
		
//		Calendar dt = new GregorianCalendar();
//		int month = dt.get(Calendar.MONTH);
//		int today = dt.get(Calendar.DAY_OF_MONTH);
//		System.out.println("\t\t<<<<2016年"+(month+1)+"月>>>>"
//				+ "\n===================================================");
//		System.out.println("日\t一\t二\t三\t四\t五\t六"
//				+ "\n---------------------------------------------------");
//		dt.set(Calendar.DAY_OF_MONTH,1);
//		int weekDay = dt.get(Calendar.DAY_OF_WEEK);
//		for (int i = Calendar.SUNDAY; i < weekDay; i++) {
//			System.out.print(" \t");
//		}
//		int m = dt.get(Calendar.MONTH);
//		while(m == month){
//			int day = dt.get(Calendar.DAY_OF_MONTH);
//			if(day != today){
//				System.out.printf("%2d\t",day);
//			}else{
//				System.out.printf("%2d|\t",day);
//			}
//			weekDay = dt.get(Calendar.DAY_OF_WEEK);
//			if(weekDay == Calendar.SATURDAY)
//				System.out.println();
//			dt.add(Calendar.DAY_OF_MONTH, 1);
//			m = dt.get(Calendar.MONTH);
//		}
//		System.out.println("\n---------------------------------------------------");
		
	}
	public static void month(int mt) {
		Calendar dt = new GregorianCalendar();
		int nowmonth = dt.get(Calendar.MONTH);
		int today = dt.get(Calendar.DAY_OF_MONTH);
		System.out.println("\t\t<<<<2016年"+(mt+1)+"月>>>>"
				+ "\n===================================================");
		System.out.println("日\t一\t二\t三\t四\t五\t六"
				+ "\n---------------------------------------------------");
		dt.set(Calendar.MONTH, mt);
		dt.set(Calendar.DAY_OF_MONTH,1);
		int weekDay = dt.get(Calendar.DAY_OF_WEEK);
		for (int i = Calendar.SUNDAY; i < weekDay; i++) {
			System.out.print("\t");
		}
		int m = dt.get(Calendar.MONTH);
		while(m == mt){
			int day = dt.get(Calendar.DAY_OF_MONTH);
			if(day == today&&m == nowmonth){
				System.out.printf("%2d|\t",day);
			}else{
				System.out.printf("%2d\t",day);
			}
			weekDay = dt.get(Calendar.DAY_OF_WEEK);
			if(weekDay == Calendar.SATURDAY)
				System.out.println();
			dt.add(Calendar.DAY_OF_MONTH, 1);
			m = dt.get(Calendar.MONTH);
		}
		System.out.println("\n---------------------------------------------------");
		

	}
}
