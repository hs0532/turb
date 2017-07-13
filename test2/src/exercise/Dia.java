package exercise;

public class Dia {
	public void dia(){
		int ro = 2*(int)(26*Math.random()+1)-1;
		int n=ro/2;
		char a = 'A';
		for(int i =0;i<=ro;i++){
			for(int j=0;j <=Math.abs(n-i);j++)
				System.out.print("  ");
			for(int j= 0;j<=2*(n-Math.abs(n-i));j++)
				System.out.print(a+" ");
			if((n-i)>0) a++;
			else a--;
			System.out.println();
		}
		
	
	}

}
