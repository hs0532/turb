package src;

public class Test {
	public static void main(String[] args){
		int row=2*(int)(26*Math.random()+1)-1;
		int n=row/2;
		char a= 'A';
		for(int i=0;i<row;i++){
			for(int j=0;j<=Math.abs(n-i);j++)
				System.out.print("  ");
			for(int j =0;j<=2*(n-Math.abs(n-i));j++){		
				System.out.print(a+" ");
			}
				if((n-i)>0) a++;
				else a--;
			System.out.println();		
		}
		Tabel_1.show();
		System.out.println("\n\n");
		Tabel_2.show();
		System.out.println("\n\n");
		Tabel_3.show();
		System.out.println("\n\n");
		Tabel_4.show();
		System.out.println("\n\n");
		Tabel_5.show();
		System.out.println("\n\n");
		Tabel_6.show();
	}
}




class Tabel_1{
public static void show(){
int i;
int j; 
System.out.println("\n\t\t\t\t    第一形态：\n");
for(i =1;i<=9;i++){
	System.out.println();
	for(j =1;j<=i;j++)
		System.out.print(j+"×"+i+"="+String.format("%2d",j*i)+"  ");
	}		
}
}
class Tabel_2{
public static void show(){
int i;
int j;
System.out.println("\n\t\t\t\t    第二形态：\n");
for(i =9;i>=1;i--){
	System.out.println();
	for(j =1;j<=i;j++)
		System.out.print(j+"×"+i+"="+String.format("%2d",j*i)+"  ");
	}
}
}
class Tabel_3{
public static void show(){
int i;
int j;
System.out.println("\n\t\t\t\t    第三形态：\n");
for(i =9;i>=1;i--){
	System.out.println();
	for(int m =0;m<9-i;m++){
		System.out.print("        ");
		}
	for(j =1;j<=i;j++)
		System.out.print(j+"×"+i+"="+String.format("%2d",j*i)+"  ");
	}
}
}
class Tabel_4{
public static void show(){
int i;
int j;
System.out.println("\n\t\t\t\t    第四形态：\n");
for(i =9;i>=1;i--){
	
	for(int m =0;m<9-i;m++){
		System.out.print("         ");
		}
	for(j =1;j<=i;j++)
		System.out.print(j+"×"+i+"="+String.format("%2d",j*i)+"  ");
		System.out.println();
	}
}
}
class Tabel_5{
public static void show(){
int i;
int j;
System.out.println("\n\t\t\t\t    第五形态：\n");
	for(i =1;i<=9;i++){
	System.out.println();
	for(int m =0;m<9-i;m++){
		System.out.print("       ");
		}
	for(j =1;j<=i;j++)
		System.out.print(j+"×"+i+"="+String.format("%2d",j*i)+"  ");
	}		
}




}
class Tabel_6{
public static void show(){
int i;
int j;
System.out.println("\n\t\t\t\t    第六形态：\n");
for(i =1;i<=9;i++){
System.out.println();
for(int m =0;m<9-i;m++){
	System.out.print("         ");
	}
for(j =1;j<=i;j++)
	System.out.print(j+"×"+i+"="+String.format("%2d",j*i)+"  ");
}		
}

}
