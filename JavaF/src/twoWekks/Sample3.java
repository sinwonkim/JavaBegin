package twoWekks;

public class Sample3 {
	
		public static void main(String[] args) {
		
		// 9부터 1까지 숫자를 줄여라
		for(int num=0; num>0; num--) {
			
			System.out.println(num);
		}
			
		// 1~10까지 출력을 하는데 2씩 증가
		for(int num2=1; num2<10; num2+=2) {
			
			System.out.println("num2의 값을 2씩 증가 : "+num2);
		}
		
		for(int num=1; num<=100; num++) {
			//조건문(홀수 일때만 출력)
			if(num%2 == 1) {
				System.out.println(num);
			}
 			
		}
		
		//1~9까지의 합계를 구해서 출력하시오.
				//합계를 저장할 변수
				int sum = 0;
				
				// 1+2+3+4+5+6+7+8+9
				for(int num=1; num<10; num=num+1) {
					//sum = sum + num;
					sum+=num;
					System.out.println("반복횟수 : " + num);
					System.out.println("");
				}
				
				
		// 1~100까지 출력을 하는데 1씩 증가
		// 홀수의 합계
		int odd = 0;
		// 짝수의 합계
		int even = 0;
		
		// 홀수, 짝수 
			for(int num=1; num<=100; num++) {
				if(num%2 == 1) {
					//홀수
					odd += num;
					
				} else {
					// 짝수 
					even += num;
					
				}
			}
			System.out.println("홀수의 합 : "+odd);
			System.out.println("짝수의 합 : " +even);
	 }
		
}
