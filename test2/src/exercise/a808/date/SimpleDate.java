package exercise.a808.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
	public static void main(String[] args) {
		Date d1 = new Date();
		
		System.out.println("默认格式>>> " + d1 );
		
		//格式化
		SimpleDateFormat  sdf = new SimpleDateFormat("\n============\n^_^yyyy年\nMM月\ndd日^_^\n============\n"); //创建和一个SimpleDateFormat类的对象，指定日期的格式。
		
		String str = sdf.format( d1 ); //将 d1 按照 sdf对象指定的格式进行格式化。
		
		System.out.println("日期格式化>>> " + str );
		
		sdf = new SimpleDateFormat("<<<HH点mm分ss秒>>>");
		str = sdf.format( d1 );
		System.out.println( str );
		
		//求当天是当年的第几天。
		sdf = new SimpleDateFormat("第D天");
		str = sdf.format( new Date() ); //将Date对象中的日期按照 sdf 指定的格式进行格式化。
		
		System.out.println( str );
		 
		str = "中华人民共和国的日期2008年08月08日";
		
		try {
			sdf = new SimpleDateFormat("中华人民共和国的日期yyyy年MM月dd日");
			Date dd = sdf.parse( str ); //将str字符串按sdf的格式还原为 Date类的对象。
			
			System.out.println( "dd>>> " + dd );
			
			str = "2008/8/8";
			sdf = new SimpleDateFormat("yyyy/MM/dd");
			dd = sdf.parse( str );
			System.out.println( "dd>>> " + dd );
			
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
	}

}
