package com.hexl.test;
/**
 * ����ȫƽ����
 * һ����������100�ټ���168��Ϊ��ȫƽ���������������ɶ
 */
public class Test5_8 {
	public static void main(String[] args) {
		method2();
	}
	
	//��Math.sort������
	public static void method1(){
		for (int i = 0; i < 100000000; i++) {
			if(Math.sqrt(i)%1==0){
				//��ʱ�����ԭ������Ϊ
				double x=i-100;
				if(Math.sqrt(x+268)%1==0){
					System.out.println("�����Ϊ��"+x);
					System.out.println("��100����Ϊ��"+Math.sqrt(i));
					System.out.println("�ټ�168����Ϊ��"+Math.sqrt(i+168));
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
					System.out.println("�����Ϊ��"+x);
					System.out.println("��100����Ϊ��"+Math.sqrt(x+100));
					System.out.println("�ټ�168����Ϊ��"+Math.sqrt(x+268));
				}
			}
			
		}
	}
}
