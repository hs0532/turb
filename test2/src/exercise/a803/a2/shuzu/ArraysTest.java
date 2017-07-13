package exercise.a803.a2.shuzu;

public class ArraysTest {
	public static void main(String[] args) {
		int[][] a = {{11},{21,22},{31,32,33}};
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < a.length; i++) {
			sum2 += a[i][a[i].length-1];
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
		}
		System.out.println("数组所有元素的和为："+sum+"\n所有行末尾和为："+sum2);
	} 
}
