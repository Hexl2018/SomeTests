package com.hexl.knowledgePoint;

import java.util.Scanner;

/**
 * ����
 * ���壺��һ�����ֱ�ȥ��2��sqrt(�����)������ܱ����������������������������֮��������
 *
 */
public class Prime {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("������ȡ�����ķ�Χ��\n�������һ������");
		Scanner in1=new Scanner(System.in);
		int num1=in1.nextInt();
		System.out.print("������ڶ�������");
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
				System.out.println(i+"Ϊ������");
		}
		System.out.println(num1+"~"+num2+"��������"+count+"����");
	}
}
