package com.hexl.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class Test5_8_6 {
	public static void main(String[] args) {
		substringNum();
	}
	
	@SuppressWarnings("resource")
	public static void substringNum(){
		Scanner in=new Scanner(System.in);
		String numString=in.next();
		char[] arr=numString.toCharArray();
		Arrays.sort(arr);
		StringBuffer buffer=new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			buffer.append(arr[i]);
		}
		System.out.println("");
		System.out.println(buffer.reverse().toString());
	}
}
