package exercise.a805.test;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
public class dateTest {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.printf("%tT\n",d);
		System.out.printf("%tF\n",d);
		Date d1 = new Date();
		System.out.printf("%tF\n",d1);
		System.out.printf("%tD\n",d1);
		System.out.printf("%tA\n",d1);
		System.out.printf("%tm\n",d1);
		String str = "2008-08-15";
		try {
			Date dd = DateFormat.getDateInstance().parse(str);
			System.out.println(dd);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
