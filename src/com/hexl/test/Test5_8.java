package com.hexl.test;
/**
 * 求完全平方数
 * 一个整数加上100再加上168均为完全平方数，求这个数是啥
 */
public class Test5_8 {
	public static void main(String[] args) {
		method2();
	}
	
	//用Math.sort反向求
	public static void method1(){
		for (int i = 0; i < 100000000; i++) {
			if(Math.sqrt(i)%1==0){
				//此时可求出原来的数为
				double x=i-100;
				if(Math.sqrt(x+268)%1==0){
					System.out.println("这个数为："+x);
					System.out.println("加100开方为："+Math.sqrt(i));
					System.out.println("再加168开方为："+Math.sqrt(i+168));
				}
			}
		}
	}
	
	public static void method2(){
		for (int i = 0; i*i< 10000; i++) {
			int temp=i+1;
			for (int j=temp; j*j < 10000&&j>i; j++) {
				if(i*i-100==j*j-268){
					int x=i*i-100;
					System.out.println("这个数为："+x);
					System.out.println("加100开方为："+Math.sqrt(x+100));
					System.out.println("再加168开方为："+Math.sqrt(x+268));
				}
			}
			
		}
	}
}
