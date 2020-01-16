package oneWeek;
// 자바로 만든 프로그램은 1개이상의 클래스가 존재한다.

// 이름이 Main인 Class 
// 클래스 이름은 첫 글자가 대문자로 오는것이 일반적이다. 코드가 가독성 있게 작성 -> Enter와 Tab
public class Main { // 중괄호를 블록이라 부르고 쌍으로 이루어져 있다. 
	
	//Main method 프로그램 시작되는 지점 
	//메소드 - method 
	public static void main(String[] args) {
		// 알고 싶은 내용을 화면에 출력을 한다. 괄호 사이에 적으면 다만 규칙이 있다. 글자라고 한다면  
		System.out.println("JAVA 참 어렵다."); //명령문장이 끝난 후에는 반드시 ;를 해야한다. 
		System.out.println("문자열 테스트");
		System.out.println(123456);
		
		//변수 = 데이터를 저장하는 공간 
		//변수의 자료형, 변수의 이름  
		// 사용하려는 데이터가 있을건데 데이터가 종류가 여러가지일 것이다. 
		// 그 데이터의 형태에 따라서 데이터를 담아주는게
		
		// 선언을 해놓는 이유 - 다른 사람들이 미리 못 쓰게  미리 만들어 놓음 
		//변수의 자료형, 변수의 이름 
		boolean b1; // true or false를 넣을 수 있다. 
		char c; // 2byte 문자를 넣을 수 있다. 예를들면 m 값이 들어오면 남자 f 값이 들어오면 여자   ex) m 혹은 f 인데 의미 받아들일 때 남자, 여자
		byte b; // 1byte 정수(-128 ~ 127)
		short s; // 2byte 정수(-32768 ~ 32767)
		int memberNumber = 3; //선언과 생성을 동시에 할 수 있다.
		int num = 3; // 선언과 동시에 할 수도 있다.
		long l = 100000000l; // 2억이라는 단위를 넘을 때 특수한 경우일 경우 
		float f; 
		double db,dd;
		
		// 선언 이후 생성했다. 값을 대입했다.  
		// 대입연산자 = 넣어줄 값(데이터) 
		b1 = true; // 세미콜론은 명령이 끝났을 때
		// * 쌍따옴표 적으면 안됨   왜? 문자열을 뜻함 문자열: 여러개  , 홀따옴표 사용할것
		c = 'a';  
		
		System.out.println(b1);
		System.out.println(c);
		System.out.println(memberNumber);
		System.out.println(l);
		
		System.out.println("변수 num의 값은 " + num + " 입니다.");
		
		num = 5;
		
		System.out.println("변수 num의 값은 " + num + " 입니다.");
		
		int no1, no2; // 변수의 자료형, 변수의 이름 ;   >> 선언 
		no1 = 10; 
		no2 = 20;
		System.out.println(no1);
		System.out.println(no2);
		
		// 다른 변수에 있는 값을 넣는 방법 
		no1 = no2; 
		System.out.println(no1);
	}

}
