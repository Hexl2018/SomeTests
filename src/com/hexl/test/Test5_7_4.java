package com.hexl.test;

import java.util.Scanner;

/**
 * �������ֽ�������
 *
 */
public class Test5_7_4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("��������Ҫ�ֽ����������");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		System.out.print(num+"=");
		primeFactorizations(num);
	}
	
	public static void primeFactorizations(int x){
		for (int i = 2; i <= x; i++) {
			if(x%i==0){
				System.out.print(i);
				if(i!=x){
					System.out.print("*");
				}
				primeFactorizations(x/i);
			}
		}
		System.exit(0);
	}
	
}
