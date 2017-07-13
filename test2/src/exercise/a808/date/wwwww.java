package exercise.a808.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class wwwww {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Calendar dt = new GregorianCalendar();
		int nowmonth = dt.get(Calendar.MONTH);
		int today = dt.get(Calendar.DAY_OF_MONTH);
		int nowYear = dt.get(Calendar.YEAR);
//		System.out.println("\t\t\t<<<<"+year+"年"+(mt+1)+"月>>>>"
//				+ "\n==========================================================");
//		System.out.println("周\t日\t二\t三\t四\t五\t六\t一"
//				+ "\n----------------------------------------------------------");
		dt.set(Calendar.YEAR,2015);
		dt.set(Calendar.MONTH, 11);
		dt.set(Calendar.DAY_OF_MONTH,31);
		long i = dt.getTimeInMillis();
		Date t =new Date(i);
		System.out.printf("%tF\n",t);
		System.out.println(dt.get(Calendar.WEEK_OF_YEAR));
		System.out.println(dt.getActualMaximum(Calendar.WEEK_OF_YEAR));

	}
}
