package twoWekks;

public class Sample2 {

	public static void main(String[] args) {
		
		int y = 2;
		//2단 구구단을 출력하시오.
		for(int num=1; num<=9; num++) {
			 System.out.println(y + "*" + num +"="  + y * 1);
		}
		
		// 구구단을 출력하시오.
		System.out.println("---------------------------------------------------------");
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		
		for(int num=1; num<10; num++) {
			//반복하면서 실행할 동작
			
		}
		
	}
}
