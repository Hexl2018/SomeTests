package com.hexl.knowledgePoint;

import java.util.Scanner;
/**
 * �ݹ�
 * @author Hexl
 *
 */
public class Recursion {
	/**
	 * �ݹ�򵥼���һ��1һֱ�ӵ�x�ĺ�
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
			//System.out.println("��ǰ���֣�"+num+"+Recursion("+(num-1)+")");
			return num+Recursion(num-1);
		}	
		else
			return 0;
	}
}
