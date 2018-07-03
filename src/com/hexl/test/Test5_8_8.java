package com.hexl.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 1、2、2、3、4、5六个数字，写一个main函数：打印所有不同的排列，要求4不在第三位，3不能与5相连
 * @author Administrator
 *
 */
public class Test5_8_8 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
		for (int i = 0; i < list.size(); i++) {
			num1=(int) list.get(i);
			List list1 =(List) list.remove(i);
			for (int j = 0; j < list1.size(); j++) {
				 num2=(int) list1.get(j);
				List list2 =(List) list1.remove(j);
				for (int k = 0; k < list2.size(); j++) {
					 num3=(int) list2.get(j);
					List list3 =(List) list2.remove(j);
					for (int l = 0; l < list3.size(); l++) {
						 num4=(int) list3.get(j);
						List list4 =(List) list3.remove(j);
						 num5=(int) list4.get(0);
						 System.out.println("数字为："+num1+num2+num3+num4+num5);
					}
				}
			}
		}
	}
}
