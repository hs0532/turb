package exercise.a808.test;

import java.util.Arrays;

public class sortTest {
	public static void main(String[] args) {
		int[][] a = { 
				{ 1, 5, 9, 4, 8, 3, 5, 4 }, 
				{ 5, 4, 8, 45, 1, 3, 4 }, 
				{ 8, 9, 5, 1, 2, 454, 13, 14, 5 },
				{ 9, 1, 2, 54, 3, 8, 4, 6, 2 }};
		printArrays(a);
		System.out.println("排序后为：");
		sortArrays(a);
		printArrays(a);

	}

	public static void sortArrays(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int j2 = j; j2 < a[i].length; j2++) {
					if (a[i][j] > a[i][j2]) {
						int temp;
						temp = a[i][j];
						a[i][j] = a[i][j2];
						a[i][j2] = temp;
					}
				}
			}
		}
	}

	public static void printArrays(int[][] a) {
//		for (int[] is : a) {
//			for (int i : is) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
}
