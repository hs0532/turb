package exercise;

import java.util.Arrays;

//import java.util.Scanner;
public class Cul {
	public static void main(String[] args) {// awdawdawdwdawdwadw
		// Scanner sc=new Scanner(System.in);
		if (args[0] == null)
			System.exit(0);
		System.out.println(Arrays.toString(args));
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);
		char i = args[1].charAt(0);
		/*
		 * System.out.println("璇疯緭鍏ヤ袱涓暟瀛梐b锛�"); a =sc.nextInt(); b =sc.nextInt();
		 * System.out.println("璇烽�夋嫨杩愮畻绗︼細+ 鈥� * /"); i =sc.next().charAt(0);
		 */
		double result = 0;
		switch (i) {
		case '+':
			result = add(a, b);
			break;
		case '-':
			result = sub(a, b);
			break;
		case '/':
			result = Sconed.div(a, b);
			break;
		case '×':
			result = First.mul(a, b);
			break;
		case '乘':
			result = First.mul(a, b);
			break;
		}
		System.out.println(a + " " + i + " " + b + " = " + String.format("%.2f", result));
	}

	public static int add(int m, int n) {

		return m + n;

	}

	public static int sub(int m, int n) {

		return m - n;
	}

}

class First {
	public static int mul(int m, int n) {

		return m * n;
	}
}

class Sconed {
	public static double div(int m, int n) {
		return m * 1.0 / n;
	}
}
