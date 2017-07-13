package test2;

import static test2.Area.volume;;
public class Tex {
	public static void main(String[] args) {
		String a = "ab";
		int b = 25;
		double c = 3.0;
		System.out.printf("%5s,%03d,%05.2f \n",a,b,c);
		System.out.println(String.format("%02d", b));
		System.out.println(new java.util.Date());
		System.out.printf("\n%tT\n", new java.util.Date());
		System.out.println(String.format("%tT",new java.util.Date()));
		System.out.println(String.format("%o", b));
		System.out.printf("0%o  \n",b);
		System.out.printf("0x%x  \n",b);
		b = 2;
		int v = volume(b);
		System.out.println(v);
		double di = 2.0;
		double d = 3.0;
		byte bi = (byte)di;
		double da = Double.compare(di,d);
		double dd =Double.max(c, di);
		Double dii = new Double(di);
		dii.intValue();
		System.out.printf("%2.2f %2.2f %2.2f %2.2f %2s %2d  \n\n\n\n",dd,di,d,da,bi,dii.intValue());
	}
}
