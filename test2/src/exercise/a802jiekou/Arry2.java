package exercise.a802jiekou;

public class Arry2 {
	public static void initArry(int[] n){
		for(int i =0;i < n.length;i++){
			n[i] = (int)(100*Math.random());
			for(int j = 0;j<i;j++){
				if(n[i] == n[j]){
//					n[i] = (int)(100*Math.random());
//					j =0;	
					i =i-1;
					break;
				}
			}
		}
	}
	public static void sort(int[] n){
		for(int i = 0;i < n.length;i++)
			for(int j = 0;i+j<n.length-1;j++)
				if(n[j] > n[j + 1])
	            {
	                int temp = n[j];
	                n[j] = n[j + 1];
	                n[j + 1] = temp;
	            }
	}
	public static void printArry(int[] n){
		for(int tn :n)
			System.out.print(tn+" ");
	}
}
