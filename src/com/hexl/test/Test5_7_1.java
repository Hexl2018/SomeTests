package com.hexl.test;

import java.util.Scanner;

public class Test5_7_1 {
/**
 * 为了得到一个数的"相反数",我们将这个数的数字顺序颠倒,然后再加上原先的数得到"相反数"。
 * 例如,为了得到1325的"相反数",首先我们将该数的数字顺序颠倒,我们得到5231,之后再加上原先的数,我们得到5231+1325=6556.
 * 如果颠倒之后的数字有前缀零,前缀零将会被忽略。例如n = 100, 颠倒之后是1.
 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//while (in.hasNext()) {
			String number = (String) in.next();
			System.out.println(Integer.parseInt(new StringBuffer(number).reverse().toString())+Integer.parseInt(number));
		//}
	}
}
