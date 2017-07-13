package test2;
import java.util.Scanner;

public class Computer {
	public Computer(){
		
	}
	public void show(){
		
		int ex = 0;
		do{
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			System.out.println("请输入算式：");
			double x = sc.nextInt();
			char ch = sc.next().charAt(0);
			double y = sc.nextInt();
			switch(ch){
				case '+': System.out.println((int)x+" + "+(int)y+" = "+add((int)x, (int)y));ex = exx();break;
				case '-': System.out.println((int)x+" - "+(int)y+" = "+sub((int)x, (int)y)); ex = exx();break;
				case '*': System.out.println((int)x+" × "+(int)y+" = "+mul((int)x, (int)y));ex = exx();break;
				case '/': System.out.println(x+" ÷ "+y+" = "+div(x, y)); ex = exx();break;
				case '^': System.out.println((int)x+" ^ "+(int)y+" = "+pow((int)x, (int)y));ex = exx();break;	 
				}
		}while(ex==1);
	}
		
	public int exx(){
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		System.out.println("退出请按2继续请按1：");
		return sc1.nextInt();
	}	
		
	
	public int add(int x,int y){
		return x+y;
	}
	public int mul(int x,int y){
		return x*y;
	}
	public double div(double x,double y){
		return x/y;
	}
	public int sub(int x,int y){
		return x-y;
	}
	public int pow(int x,int y){
		return mull(x,y);
	}
	int mull(int m,int n){
		int sum=1;
		for(int i =0;i<n;i++){
			if(n==0)
				sum= 1;
			else
				sum = sum*m;
		}
		return sum;
			
			
	}

}

