package com.exercise.oop;

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请猜测一个100以内的正整数：");
		int count = 0;
		boolean en = true;
		int n = (int)(100*Math.random()+1);
		do{
			System.out.print("请猜测>>");	
			int num = sc.nextInt();
			count++;
			if(num == n){
//				en = false;
				System.out.println("你经过第"+count+"次猜测，猜到了"+num+"这个数字\n是否继续（y/n）?");
				char ac = sc.next().charAt(0);
				if(ac == 'y'||ac == 'Y'){
					en = true;
					n = (int)(100*Math.random()+1);
				}
				else en = false;
		
			}
			else if(num > n){
				en = true;
				System.out.println("第"+count+"次：大了");
			}else{
				en = true;
				System.out.println("第"+count+"次：小了");
			}
		}while(en);
		
	}
	
}
