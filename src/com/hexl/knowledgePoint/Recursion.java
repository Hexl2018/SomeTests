package com.hexl.knowledgePoint;

import java.util.Scanner;
/**
 * 递归
 * @author Hexl
 *
 */
public class Recursion {
	/**
	 * 递归简单计算一下1一直加到x的和
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		System.out.println(Recursion(num));
	}
	
	public static int Recursion(int num){
		if(num>0){
			//System.out.println("当前数字："+num+"+Recursion("+(num-1)+")");
			return num+Recursion(num-1);
		}	
		else
			return 0;
	}
}
