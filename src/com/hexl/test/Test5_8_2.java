package com.hexl.test;
/**
 * ¥Ú”°9*9≥À∑®±Ì
 * @author Administrator
 *
 */
public class Test5_8_2 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(j+"*"+i+"="+i*j+(i*j>=10?" ":"  "));
			}
			System.out.println("");
		}
	}
}
