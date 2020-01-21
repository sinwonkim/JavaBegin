package twoWekks;

public class Sample0 {

	public static void main(String[] args) {
		int num1 = 3;
		
		// 작은 타입에서 큰 타입인 경우는 괜찮지만
		double num2 = num1;
		num1 = ++num1;
		
		// 큰 타입에서 작은 타입인 경우 명시적 형변환 해야한다.
		int num3 = (int)num2; 
		
		System.out.println(num1);
		
		boolean b1 = true;  
		boolean b2 = false;
		
		if(true) {
			System.out.println("조건식이 참 일때 출력"); 
		} 
		
		if(num1 < 2) {
			System.out.println("조건식이 참 입니다.");
		} else if(num1 < 5) {
			System.out.println("2번째 조건식이 참 일때");
		} else {
			System.out.println("조건식을 만족하지 못했을 때");
		}
		
		
	}
}
