package exercise;

public class Table {
	public void table(){
		for(int i =9;i >=1;i--){
			for(int j = 0;j<9-i;j++)
				System.out.print("        ");
			for(int j = 1;j <= i;j++)
				System.out.print(j+"×"+i+"="+String.format("%2d", i*j)+"  ");
		System.out.println();
		}
	}

}
