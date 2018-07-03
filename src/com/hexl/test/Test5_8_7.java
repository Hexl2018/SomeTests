package com.hexl.test;

import java.util.Arrays;

/**
 * 合并数组
 */
public class Test5_8_7 {
	public static void main(String[] args) {
		int[] arrA={1,2,3,4,5};
		int[] arrB={6,7,8,9,10};
		int[] arrNew=Arrays.copyOf(arrA, 10);
		for (int i = 5; i < arrNew.length; i++) {
			arrNew[i]=arrB[i-5];
		}
		for (int i = 0; i < arrNew.length; i++) {
			System.out.println(arrNew[i]);
		}
	}
}
