package com.hexl.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入三个数字，比较大小后按顺序输出
 */
public class Test5_8_3 {
	public static void main(String[] args) {
		
	}
	
	@SuppressWarnings("resource")
	public void method1(){
		int[] arr=new int[3];
		Scanner in=new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第"+(i+1)+"个数");
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("排序之后");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1)
				System.out.print("<");
		}
	}
}
