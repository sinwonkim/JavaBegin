package ThirdWeeks;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("���ڸ� �Է����ּ� ");
			int menu = sc.nextInt();
			
		switch (menu) {
		case 1:
			System.out.println("���");
			break;
		case 2:
			System.out.println("����");
			break;
			
		case 0:
		   System.out.println("����"); 
		   System.exit(0);
		   break;
		 default:
			 System.out.println("�߸��Է��Ͽ����ϴ�.");
			 break;
		}
		}
		}
		
		
	}
