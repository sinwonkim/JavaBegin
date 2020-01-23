package twoWekks;

public class Sample4 {

	public static void main(String[] args) {
		
		// 9x9 라 81번이 반복됨 
		// 바깥쪽 반복문이 끝날 때까지 반복 된다.
		// 내가 어느정도 예상하겠구나 
		for(int num=1; num < 10; ++num) {
			for(int num2=1; num2 < 10; num2++) {
				System.out.println(num*num2);
			}
		}
	}
}
