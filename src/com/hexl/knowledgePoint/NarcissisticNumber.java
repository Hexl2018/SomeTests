package com.hexl.knowledgePoint;
/**
 *ˮ�ɻ���
 *����forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ��
 */
public class NarcissisticNumber {
	public static void main(String[] args) {
		System.out.println(311%100);
		for (int i = 100; i <=999; i++) {
			int j=i/100;//��λ������
			int k=(i%100)/10;//ʮλ����
			int l=i%10;//��λ����
			if(i==(j*j*j+k*k*k+l*l*l)){
				System.out.println(i+"Ϊˮ�ɻ���");
			}
		}
	}
}
