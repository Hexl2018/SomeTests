package com.hexl.knowledgePoint;
/**
 *水仙花数
 *利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 */
public class NarcissisticNumber {
	public static void main(String[] args) {
		System.out.println(311%100);
		for (int i = 100; i <=999; i++) {
			int j=i/100;//百位的数字
			int k=(i%100)/10;//十位数字
			int l=i%10;//个位数字
			if(i==(j*j*j+k*k*k+l*l*l)){
				System.out.println(i+"为水仙花数");
			}
		}
	}
}
