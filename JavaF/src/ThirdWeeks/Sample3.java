package ThirdWeeks;

import java.util.Scanner;

public class Sample3 {
	public static void main(String[] args) {
		
		// 그림으로 배우는 Java Programming Basic 174p 
		// 순서대로 입력할 것  
		// 소수 구하기 - 1과 자기 자신만으로 나누어 떨어지는 1보다 큰 양의 정수
		
		//1.숫자를 입력 받는다.
		//2. 2-1 입력받은 숫자를 2부터 입력받은 숫자 미만까지 나누어서 
		//   2-2 나머지가 0이 되는 숫자가 있는지 확인
		//3. 
		// 그 결과 한번이라도 나머지가 0인 경우가 있었다면 '소수가 아님'을 출력 아니라면 '소수'를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요");
		int num = sc.nextInt();
		// 소수인지 아닌지 판단하는 기준  boolean이 좋음  ( 참과 거짓만 있어서 ) 
		boolean check = true;
		
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				check = false;
				break;
			}
		}
		
		if(check) {
			System.out.println("소수 입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
		
	}
}
