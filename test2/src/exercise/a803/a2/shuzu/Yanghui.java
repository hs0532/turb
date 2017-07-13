package exercise.a803.a2.shuzu;

public class Yanghui {
	
	public static void main(String[] args) {
		int[][] a = new int[10][];
		initArray(a);
		ArrayTest.pt.forPrint(a);
		trianle(a);

	}

	public static void initArray(int a[][]) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i)
					a[i][j] = 1;
				else
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
			}
		}

	}

	public static void trianle(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(String.format("%3d", a[i][j]) + " ");
			}
			System.out.println();
		}
	}
}


