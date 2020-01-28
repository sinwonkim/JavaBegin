package ThirdWeeks;

import java.util.Scanner;

public class Sample4 {
	public static void main(String[] args) {
		// 배열 176p
		
		// 선언 - 선언만 했을때 사용 못함
		
		int[] test;
		
		//생성   크기 50개 
		test = new int[50];
		
		// 선언과 생성
		int[] num = new int[10];
		/*
		 * test[0] = 1; test[1] = 2; test[2] = 3; test[3] = 4; test[4] = 5;
		 * 
		 * for(int i=0; i<5; i++) { System.out.println(test[i]); }
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		for( int i = 0; i<5; i++) {
			System.out.println("숫자를 입력하세요 ");
			num[i] = sc.nextInt();
		}
		for ( int j = 0; j < 5; j++) {
			System.out.println(num[j]);
		}
		
	}
}
