package exercise.a803.a2.shuzu;

public class zhihuan {
	public static void main(String[] args) {
		
		int[][] a = new int[4][4];
		
		for (int i = 0, n = 1, m = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i <= (a.length - 1) / 2) {
					a[i][j] = n++;
					m = n - 1;
				} else
					a[i][j] = m--;
			}
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j || j == a.length - i - 1)
					sum += a[i][j];
			}
		}
		
		System.out.println("对角线和为：" + sum);

		ArrayTest.pt.forPrint(a);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(String.format("%2d", a[j][i]) + " ");
			}
			System.out.println();
		}
	}
}
