package ThirdWeeks;

import java.util.Scanner;

public class Sample4 {
	public static void main(String[] args) {
		// �迭 176p
		
		// ���� - ���� ������ ��� ����
		
		int[] test;
		
		//����   ũ�� 50�� 
		test = new int[50];
		
		// ����� ����
		int[] num = new int[10];
		/*
		 * test[0] = 1; test[1] = 2; test[2] = 3; test[3] = 4; test[4] = 5;
		 * 
		 * for(int i=0; i<5; i++) { System.out.println(test[i]); }
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		for( int i = 0; i<5; i++) {
			System.out.println("���ڸ� �Է��ϼ��� ");
			num[i] = sc.nextInt();
		}
		for ( int j = 0; j < 5; j++) {
			System.out.println(num[j]);
		}
		
	}
}
