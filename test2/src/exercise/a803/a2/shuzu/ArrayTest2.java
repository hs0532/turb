package exercise.a803.a2.shuzu;

import java.util.Arrays;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] a = new int[100];
		for(int i =0;i<a.length;i++){
			a[i] = (int)(1000*Math.random());
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
	
}
