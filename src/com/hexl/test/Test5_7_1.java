package com.hexl.test;

import java.util.Scanner;

public class Test5_7_1 {
/**
 * Ϊ�˵õ�һ������"�෴��",���ǽ������������˳��ߵ�,Ȼ���ټ���ԭ�ȵ����õ�"�෴��"��
 * ����,Ϊ�˵õ�1325��"�෴��",�������ǽ�����������˳��ߵ�,���ǵõ�5231,֮���ټ���ԭ�ȵ���,���ǵõ�5231+1325=6556.
 * ����ߵ�֮���������ǰ׺��,ǰ׺�㽫�ᱻ���ԡ�����n = 100, �ߵ�֮����1.
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
