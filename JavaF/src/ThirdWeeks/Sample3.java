package ThirdWeeks;

import java.util.Scanner;

public class Sample3 {
	public static void main(String[] args) {
		
		// �׸����� ���� Java Programming Basic 174p 
		// ������� �Է��� ��  
		// �Ҽ� ���ϱ� - 1�� �ڱ� �ڽŸ����� ������ �������� 1���� ū ���� ����
		
		//1.���ڸ� �Է� �޴´�.
		//2. 2-1 �Է¹��� ���ڸ� 2���� �Է¹��� ���� �̸����� ����� 
		//   2-2 �������� 0�� �Ǵ� ���ڰ� �ִ��� Ȯ��
		//3. 
		// �� ��� �ѹ��̶� �������� 0�� ��찡 �־��ٸ� '�Ҽ��� �ƴ�'�� ��� �ƴ϶�� '�Ҽ�'�� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��� �ּ���");
		int num = sc.nextInt();
		// �Ҽ����� �ƴ��� �Ǵ��ϴ� ����  boolean�� ����  ( ���� ������ �־ ) 
		boolean check = true;
		
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				check = false;
				break;
			}
		}
		
		if(check) {
			System.out.println("�Ҽ� �Դϴ�.");
		}else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
		
	}
}
