package com.hexl.test;

import java.util.Scanner;
/**
 * С��׼��ȥħ�������ɹ�ħ������,����ħ��������Ҫʹ��ħ����,����С������һöħ���Ҷ�û��,����С������̨ħ����������ͨ��Ͷ��x(x����Ϊ0)��ħ���Ҳ��������ħ���ҡ�
 * ħ������1:���Ͷ��x��ħ����,ħ�������Ὣ���Ϊ2x+1��ħ����
 * ħ������2:���Ͷ��x��ħ����,ħ�������Ὣ���Ϊ2x+2��ħ����
 * С�ײɹ�ħ�������ܹ���Ҫn��ħ����,����С��ֻ��ͨ����̨ħ����������ǡ��n��ħ����,С����Ҫ��������һ��Ͷ�뷽��ʹ�����ǡ��ӵ��n��ħ����
 * @author Administrator
 */
public class Test5_7 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while (in.hasNext()) {
			int coinCount=in.nextInt();
			StringBuffer sb=new StringBuffer();
			while (coinCount>0) {//���Ƶ�����û��ħ���ҵ����
				if(coinCount%2==0){
					coinCount=(coinCount-2)/2;
					sb.append("2");
				}else{
					coinCount=(coinCount-1)/2;
					sb.append("1");
				}
			}//StringBuffer��reverse()�������ã���StringBuffer���ݵߵ�������abc������������cba
			System.out.println(sb.reverse().toString());
		}
	}
}
