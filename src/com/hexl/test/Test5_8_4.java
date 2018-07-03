package com.hexl.test;

import java.util.Scanner;

/**
 * µÝ¹éÇó½×³Ë
 * @author Administrator
 *
 */
public class Test5_8_4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int result=Factorial(num);
		System.out.print("="+result);
	}
	
	public static int Factorial(int num){
		if(num==0){
			System.out.print("0");
			return 0;
		}
		if(num>1){
			System.out.print(num);
			System.out.print("*");
			return num*Factorial(num-1);
		}else{
			System.out.print("1");
			return 1;
		}
	}
}
