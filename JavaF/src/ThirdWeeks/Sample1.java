package ThirdWeeks;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1���� 10���� �հ踦 ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int sum = 0 ; // 
		for(int i = 1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println("�հ�� : " + sum );
		
	
		Scanner sc = new Scanner(System.in);
		//����ڷκ��� ���� 2���� �Է¹޾Ƽ� �� ���� ������ �հ踦 ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//ù��° �Է��� ���ڰ� �ݵ�� �� ��° �Է��� ���� 
		
		System.out.println("ù ��° ���ڸ� �Է����ּ�����");
		int no1 = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է����ּ���");
		int no2 = sc.nextInt();
		int sum2 =   0;
		
		// ù��° �Է��� ���ڿ� �ι�° �Է��� ���� ������ �������
		// ù��°�� �� �������� ������ ���µ�
		// ù��° �� Ŭ ��� ���۰� ���������� ��ü
		int temp = 0;
		if(no1 > no2) {
			temp = no1;
			no1 = no2; 
			no2 = temp;
		}
		
		for(int j=no1; j<=no2; j++) {
			sum2 = sum2 + j;
		}
		
		System.out.println("�� ���� ������ �հ�� :" +sum2);
	}

}
