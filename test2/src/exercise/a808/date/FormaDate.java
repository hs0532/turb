package exercise.a808.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class FormaDate {
	public static void main(String[] args) {
		Date d1 = new Date();
	
		System.out.println("日期时间的默认格式>>> " + d1 );
		
		String str = DateFormat.getDateInstance().format( d1 );
		System.out.println("对日期格式化为>>> " +  str );
		
		str = DateFormat.getTimeInstance().format( d1 );
		System.out.println("对时间格式化为>>> " + str );
		
		str = DateFormat.getDateTimeInstance().format( d1 );
		System.out.println( "对日期时间一起格式化为>>> " + str );
		
		str = "2008-08-08";
		try {
			//parse()将给定字符串按getDateInstance()[ yyyy-mm-dd ]格式进行还原为Date为的对象。
			//注意: 给定的字符串必须符合 yyyy-mm-dd格式，否则，转换失败。
			Date dd = DateFormat.getDateInstance().parse( str );
			
			System.out.println("\ndd>>> " + dd );
			
			str = "20:08:08";
			//注意: 给定的字符串必须符合 hh:mm:ss 格式
			dd = DateFormat.getTimeInstance().parse( str );
			System.out.println("\ndd>>> " + dd );
			
			str = "2008-08-08 20:08:08";
			
			dd = DateFormat.getDateTimeInstance().parse( str );
			System.out.println( dd );
			
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
	}

}
