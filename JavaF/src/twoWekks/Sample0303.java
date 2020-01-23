package twoWekks;

public class Sample0303 {
	public static void main(String[] args) {
		
	/*	// while 문 156p 
		int i = 1;
		
		do {
			System.out.println(i + "번째 반복입니다.");
			i++;
		}while(i >= 5);
	}*/
	
		
		// break 문
		
		/*
		 * int num = 5; for (int i = 1; i <= 10; i++) { System.out.println(i +
		 * "번째 처리입니다."); if (i == num) { break; } }
		 * 
		 * int max = 2000; int sum = 0;
		 * 
		 * for (int i = 1; i <= 1000; i++) { System.out.println(i + "번째 처리입니다."); sum +=
		 * i; if (sum >= max) { break; } } System.out.println("합계는 : " + sum);
		 */	
	
		
		
		// continue 문
		
		for(int i =1; i<=10; i++) {
			if( i < 5) {
				if(i %2 == 1) {
					continue;
				}
				
			}
			System.out.println(i+ " 번 째 처리 입니다.");
		}
		
	}
}
