package com.hexl.test;

import java.util.ArrayList;
import java.util.List;

public class Test5_22 {
	public static void main(String[] args) {
		String str = new String("Bejing");
		List list=new ArrayList();
		test(list);
		test(str);
		System.out.println(list.size());
		System.out.println(str);
	}
	
	public static void test(List list){
		//list.add("beijing");
	}
	
	public static void test(String str){
		str="change";
	}
}
