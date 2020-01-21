package twoWekks;

public class Sample1 {

	public static void main(String[] args) {
		
		// Quiz 1 산술연산자
		int num1 = 20;
		
		//if문을 사용하여 num1이 3의 배수 인지 아닌지를 판단하고
		//3의 배수 일 경우에는 '3의배수'를 출력
		//아닐경우에는 '3의 배수가 아님'을 출력하시오
		
		if(num1 % 3 == 0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("3의 배수가 아님");
		}
		
		
		// Quiz 2.
		
		// if문 사용하고 % 나머지 연산자 사용
		// 논리연산자 &&(and) , ||(or), !(not)
		// num2의 값이 3의 배수 이면서 15의 배수가 아닌 것을 판단
		// num2의 값이 3의 배수 이면서 15의 배수가 아니면 '15의 배수가 아님' 출력 
		// num2의 값이 3의 배수 이면서 15의 배수 이면 '3과15의배수'를 출력
		
		int num2 = 9;
		
		if((num2 % 3 == 0) && (num2%15 == 0)) {
			System.out.println("3과 15의 배수");
		}else if((num2 % 3 == 0) && (num2 % 15 != 0)) {
			System.out.println("15의 배수가 아님");
		}
		
		// Quiz 3.
		
		int kor = 90;
		int eng = 84;
		int mat = 70;
		
		double avg = (double)(kor+eng+mat)/3;
		double avg2 = (kor+eng+mat)/3.0;
	
		System.out.println(avg);
		
		int maxNum;
		int minNum;
		// 최대 값과 최소 값   값을 다 비교해서 
		
		int max = 0; 
		max = kor;
		if(max < eng) {
			max = eng;
		}
		if(max < mat) {
			max = mat;
		}
		System.out.println("최대값은 : " + max);
		
		int min = 0;
		min = kor; 
		if(min > eng) {
			min = eng;
		}
		if(min > mat ) {
			min = mat;
		}
		System.out.println("최소값은 : " + min);
		
		int num5 =  34;
		
		switch (num5%2) {
		case 0:
			// 동작 
			System.out.println("짝수 입니다.");
			break;
		case 1:
			// 동작 
			System.out.println("홀수가 됩니다.");
			break;
		default:
			System.out.println("잘못된 결과 입니다.");
			break;
		}
	}
}
