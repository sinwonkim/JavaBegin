package ThirdWeeks;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1부터 10까지 합계를 구하는 프로그램을 작성하시오.
		int sum = 0 ; // 
		for(int i = 1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println("합계는 : " + sum );
		
	
		Scanner sc = new Scanner(System.in);
		//사용자로부터 숫자 2개를 입력받아서 두 숫자 사이의 합계를 구하는 프로그램을 작성하시오.
		//첫번째 입력한 숫자가 반드시 두 번째 입력한 숫자 
		
		System.out.println("첫 번째 숫자를 입력해주세여ㅛ");
		int no1 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요");
		int no2 = sc.nextInt();
		int sum2 =   0;
		
		// 첫번째 입력한 숫자와 두번째 입력한 숫자 사이의 관계시작
		// 첫번째가 더 작을경우는 문제가 없는데
		// 첫번째 더 클 경우 시작과 종료지점을 교체
		int temp = 0;
		if(no1 > no2) {
			temp = no1;
			no1 = no2; 
			no2 = temp;
		}
		
		for(int j=no1; j<=no2; j++) {
			sum2 = sum2 + j;
		}
		
		System.out.println("두 숫자 사이의 합계는 :" +sum2);
	}

}
