package com.hexl.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * �����������֣��Ƚϴ�С��˳�����
 */
public class Test5_8_3 {
	public static void main(String[] args) {
		
	}
	
	@SuppressWarnings("resource")
	public void method1(){
		int[] arr=new int[3];
		Scanner in=new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������"+(i+1)+"����");
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("����֮��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1)
				System.out.print("<");
		}
	}
}
