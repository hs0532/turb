package exercise.a803.a2.shuzu;

import java.util.Arrays;

public class ArrayTest {

	public static final Prin pt = new Prin();
	static Prin pr = new Prin() { // 匿名内部类
		@Override
		public void toStprint(int[][] a) {
			// TODO Auto-generated method stub
			System.out.println("\n\n如何使用Arrays.toString()方法来输出二维数组？");
			for (int i = 0; i < a.length; i++) {
				System.out.println(i + "    " + Arrays.toString(a[i]));
			}
		}
	};

	public static void main(String[] args) {
		int[][] a = new int[3][]; // 定义二维数组
		initArray(a);
		int[][] n = a.clone();
		pr.toStprint(n);
		/*
		 * 输出
		 */
		pr.toStprint(a);
		pr.forPrint(a);
		pr.forStprint(a);
		Print2 pr2 = new Prin();
		pr2.forStprint(a);
		/*
		 * for (int i = 0; i < a.length; i++) { System.out.print(i + "     ");
		 * for (int j = 0; j < a[i].length; j++) { System.out.print(a[i][j] +
		 * "  "); } System.out.println(); }
		 *//**
			 * 思考1: 如何使用Arrays.toString()方法来输出二维数组？
			 */
		/*
		 * System.out.println("\n\n如何使用Arrays.toString()方法来输出二维数组？"); for (int i
		 * = 0; i < a.length; i++) { System.out.println(i+"    "
		 * +Arrays.toString(a[i])); }
		 *//**
			 * 思考2: 如何使用增强的for循环实现二维数组的输出。
			 */

		/*
		 * * System.out.println("\n\n如何使用增强的for循环实现二维数组的输出。"); for (int te[] :a)
		 * { System.out.print(te+"    "); for (int tep:te) {
		 * System.out.print(tep+ "  "); } System.out.println(); }
		 *//**
			 * 思考3: 如何使用增强的for循环与Arrays工具类配合实现二维数组的输出。
			 *//*
			 * System.out.println("\n\n如何使用增强的for循环与Arrays工具类配合实现二维数组的输出。");
			 * for(int[] te :a){ System.out.println(te+"    "
			 * +Arrays.toString(te)); }
			 */
	}

	public static void initArray(int a[][]) {
		for (int i = 0; i < a.length; i++) {

			int n = (int) (10 * Math.random()) + 1;
			a[i] = new int[n]; // 给二维数组第i行定义一个一维数组
		}
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (10 * Math.random());
			}
		}
	}
}

class Prin extends Print1 implements Print2 {
	public void toStprint(int a[][]) {
	}

	@Override
	public void forPrint(int[][] a) {
		// TODO Auto-generated method stub
		// System.out.println("\n\n如何使用增强的for循环实现二维数组的输出。");
		for (int te[] : a) {
			// System.out.print(te + " ");
			for (int tep : te) {
				System.out.print(String.format("%3d", tep) + "  ");
			}
			System.out.println();
		}

	}

	@Override
	public void forStprint(int[][] a) {
		// TODO Auto-generated method stub
		System.out.println("\n\n如何使用增强的for循环与Arrays工具类配合实现二维数组的输出。");
		for (int[] te : a) {
			System.out.println(te + "    " + Arrays.toString(te));
		}

	}
}

interface Print2 {
	void forStprint(int a[][]);
}

abstract class Print1 {
	public abstract void forPrint(int a[][]);
}