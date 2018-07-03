package com.hexl.knowledgePoint;

import java.util.Scanner;

/**
 * 素数
 * 定义：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
 *
 */
public class Prime {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("请输入取素数的范围：\n请输入第一个数：");
		Scanner in1=new Scanner(System.in);
		int num1=in1.nextInt();
		System.out.print("请输入第二个数：");
		Scanner in2=new Scanner(System.in);
		int num2=in2.nextInt();
		int count=num2-num1+1;
		for (int i = num1; i <=num2; i++) {
			boolean flag=true;
			for (int j = 2; j < i; j++) {
				if(i%j==0){
					flag=false;
					count--;
					break;
				}
			}
			if(flag==true)
				System.out.println(i+"为素数！");
		}
		System.out.println(num1+"~"+num2+"总有素数"+count+"个！");
	}
}
