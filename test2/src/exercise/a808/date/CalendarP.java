package exercise.a808.date;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class  CalendarP {
	public static void main(String[] args) {

		int year = input("请输入要显示年份：>>");
		for (int i = 0; i < 12; i++) {
			month(i, year);
		}
	}

	public static void month(int mt,int year) {
		Calendar dt = new GregorianCalendar();
		int nowMonth = dt.get(Calendar.MONTH);
		int today = dt.get(Calendar.DAY_OF_MONTH);
		int nowYear = dt.get(Calendar.YEAR);
		System.out.println("\t\t     <<<<"+year+"年"+(mt+1)+"月>>>>"
				+ "\n==========================================================");
		System.out.println("周\t日\t二\t三\t四\t五\t六\t一"
				+ "\n----------------------------------------------------------");
		dt.set(Calendar.YEAR,year);
		dt.set(Calendar.MONTH, mt);
		dt.set(Calendar.DAY_OF_MONTH,1);
		int weekDay = dt.get(Calendar.DAY_OF_WEEK);
		int week = dt.get(Calendar.WEEK_OF_YEAR);
		System.out.print("第"+week+"周\t");
		for (int i = Calendar.SUNDAY; i < weekDay; i++) {
			System.out.print("\t");
		}
		int m = dt.get(Calendar.MONTH);
		while(m == mt){
			
			int day = dt.get(Calendar.DAY_OF_MONTH);

			if(day == today&&m == nowMonth&&Calendar.YEAR == nowYear){
				System.out.printf("%2d|\t",day);
			}else{
				System.out.printf("%2d\t",day);
			}
			weekDay = dt.get(Calendar.DAY_OF_WEEK);
			
			if(weekDay == Calendar.SATURDAY&&dt.get(Calendar.DAY_OF_MONTH)!=dt.getActualMaximum(Calendar.DAY_OF_MONTH)){
				System.out.println();
				
			}
			dt.add(Calendar.DAY_OF_MONTH, 1);
			week = dt.get(Calendar.WEEK_OF_YEAR);
			m = dt.get(Calendar.MONTH);
			if(weekDay == Calendar.SATURDAY &&dt.get(Calendar.MONTH)==mt)
				if(dt.getActualMaximum(Calendar.WEEK_OF_YEAR) == 52 && dt.get(Calendar.WEEK_OF_YEAR) == 1)
					System.out.print("第"+53+"周\t");
				else
					System.out.print("第"+week+"周\t");
			
		}
		System.out.println("\n----------------------------------------------------------");
		

	}

	public static int input(String uft) {
		System.out.print(uft);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
