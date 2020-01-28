package ThirdWeeks;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("숫자를 입력해주세 ");
			int menu = sc.nextInt();
			
		switch (menu) {
		case 1:
			System.out.println("등록");
			break;
		case 2:
			System.out.println("삭제");
			break;
			
		case 0:
		   System.out.println("종료"); 
		   System.exit(0);
		   break;
		 default:
			 System.out.println("잘못입력하였습니다.");
			 break;
		}
		}
		}
		
		
	}
