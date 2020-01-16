package oneWeek;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//증감 연산자, 후위연산자
		//int num1 = 10;
		
		// System.out.println(num1++); // 후위 연산자는 출력을 먼저  그리고 연산
		//System.out.println(++num1); // 전위 연산자는 연산 먼저  그리고 출력 실행 
		//System.out.println(--num1);//
		// System.out.println(num1--); // 출력 먼저 그 이후 연산 
		
		// 복합 대입연산자 
		int num3 = 5;
		int num4 = 6;
		
		// num3 = num3 + num4;
		num3 += num4; // += 더한 후, 대입 
		System.out.println(num3);
		num3 -= num4; // -= 뺀 후, 대입 
		System.out.println(num3);
	}

}
