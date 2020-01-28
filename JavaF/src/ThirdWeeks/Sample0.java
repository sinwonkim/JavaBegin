package ThirdWeeks;

import java.util.Scanner;

public class Sample0 {

	public static void main(String[] args) {
		
		// 입출력에 관련된 변수명을 적는다고 보시면 됨 
		// 우측에 있는게 좌측으로 들어감 
		// 우측에 있는건 생성 하는거임 
		// System에서 in  in은 안으로 들어옴  입력을 받음  
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력해 주세요 : ");
		String str = sc.nextLine();
		System.out.println(str);
		
		System.out.print("숫자를 입력해 주세요 : ");
		int num = sc.nextInt();
		System.out.println(num);
		// System.out 은 out은 나가다 
		
	}
}
