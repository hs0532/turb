package exercise.a808.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args) {
		System.out.printf("今天的日期是  %1$tF  %1$tA ，今天 所在的月份的日历如下： \n\n" , new Date()  );
		
		System.out.println("---------------------------------------------------");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		System.out.println("---------------------------------------------------");
		
		Calendar dt = new GregorianCalendar();  //自动定位到当前系统时钟一致日期时间上。
		
		int month = dt.get( Calendar.MONTH ); //当月
		int today = dt.get( Calendar.DAY_OF_MONTH ); //今天
		
		//将日子定位到1号上。
		dt.set( Calendar.DAY_OF_MONTH , 1 );
		//读取1号对应的星期几
		int weekday = dt.get(Calendar.DAY_OF_WEEK  );
		
		//目的: 打印星期天 至 1号对应星期几 间的空格
		for(int w = Calendar.SUNDAY;  w < weekday;  w++ ){
			System.out.print("        ");
		}
		
		//读取当月的每一天，并打印
		//1 读取当前日历中月份
		int m = dt.get( Calendar.MONTH );
		
		//2 判断月份是否为8月份
		while( m == month ){
			//3 读取 当月的每一天
			int day = dt.get( Calendar.DAY_OF_MONTH ); 
			//4 打印
			//System.out.printf("%2d\t",  day  );
			
			//11
			if( day == today ){
				System.out.printf("%2d★\t",  day  );
			}else{
				System.out.printf("%2d\t",  day  );
			}
			
			//8读取当天对应的星期几
			weekday = dt.get( Calendar.DAY_OF_WEEK );
			//9 判断它是星期六吗
			if( weekday == Calendar.SATURDAY ){
				//10换行 
				System.out.println();
			}
			
			
			//5 进入明天
			dt.add( Calendar.DAY_OF_MONTH, 1 );
			
			//6 获取明天对应的月份
			m = dt.get( Calendar.MONTH );
			
		} //7 返回去判断: 月份是否为当月
		
		System.out.println("\n===================================================");
		
	}
}
