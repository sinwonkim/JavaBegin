package oneWeek;

public class Sample2 {
	
	public static void main(String[] args ) {
		
		// int 자료형 선언과 초기화 
		//int inum = 160;
		
		//System.out.println("키는  " + inum + "센티미터 입니다.");
		//System.out.println("double형 변수에 대입합니다.");
		// 큰 사이즈의 형에 대입합니다. 
		//double dnum = inum;
		//System.out.println("키는  "+ dnum + " 센티미터 입니다.");
		
		 
		double dnum = 160.5;
		System.out.println("키는" +dnum + "센티미터 입니다.");
		System.out.println("int형 변수에 대입합니다.");
		// 작은 사이즈형에 대입하기  큰거 -> 작은 형태 바꿀때 꼭 형변환 할것 !!!!!!!!!!!!!!!!!!!!!!!!!!
		int inum = (int)dnum;
		System.out.println("키는"+ inum +"센티미터 입니다.");
		
		int d = 2;
		double pi = 3.14;
		
		System.out.println("지름이"+d+"센티미터 원의");
		System.out.println("둘레는 " + (d*pi)+ "센티미터 입니다.");
		
		
		
	}
}
