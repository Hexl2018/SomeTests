package com.hexl.test;

import java.util.Scanner;

/**
 * 输入年月日，判断这是这一年的第几天
 * 闰年定义
 * 普通年：能被4整除，但不能被100整除
 * 世纪年：能被400整除
 */
public class Test5_8_1 {
	/**
	 * 闰年判定
	 * @param year
	 * @return
	 */
	public static boolean ifLeapYear(int year){
		if((year%4==0&&year%100!=0)||(year%400==0))
			return true;
		else
			return false;
	}
	
	public static int getNoDays(int year,int month,int day){
		int Nodays=0;
		int Febdays=28;
		if(ifLeapYear(year)){
			Febdays=29;
		}
		switch (month) {
		case 1:
			Nodays=day;
			break;
		case 2:
			Nodays=day+31;
			break;
		case 3:
			Nodays=day+31+Febdays;
			break;
		case 4:
			Nodays=day+31+Febdays+31;
			break;
		case 5:
			Nodays=day+31+Febdays+31+30;
			break;
		case 6:
			Nodays=day+31+Febdays+31+30+31;
			break;
		case 7:
			Nodays=day+31+Febdays+31+30+31+30;
			break;
		case 8:
			Nodays=day+31+Febdays+31+30+31+30+31;
			break;
		case 9:
			Nodays=day+31+Febdays+31+30+31+30+31+31;
			break;
		case 10:
			Nodays=day+31+Febdays+31+30+31+30+31+31+30;
			break;
		case 11:
			Nodays=day+31+Febdays+31+30+31+30+31+31+30+31;
			break;
		case 12:
			Nodays=day+31+Febdays+31+30+31+30+31+31+30+31+30;
			break;
		default:
			break;
		}
		System.out.println(year+"年"+month+"月"+day+"日 是这一年的第"+Nodays+"天");
		return Nodays;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("请输入年月日，以英文逗号分隔");
		Scanner in=new Scanner(System.in);
		String[] result=in.next().split(",");
		getNoDays(Integer.parseInt(result[0]), Integer.parseInt(result[1]), Integer.parseInt(result[2]));
	}
}
