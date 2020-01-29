package ThirdWeeks;

import java.util.Scanner;

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// System이란 우리가 사용하고 있는 시스템이 될 것이다. 우리는 키보드를 통해 입력을 받을 것이다. in 은 입력 Out은 출력 
		// System.out.println();
		
		
		// System.out.println("숫자를 입력해 주세요 :");
		
		// int형을 입력 받을때  
	    // int num = sc.nextInt();
	    
	    //System.out.println("당신이 입력한 숫자는 ? " + num + "입니다.");
			
		
		
		// 동적 프로그래밍  ( 다 입력 받아서 실행 )  
	    
	    System.out.println("배열의 크기를 입력하세요 : ");
	    int size = sc.nextInt();
	    
	    //배열 Array ***** 생성할 때 사이즈를 반드시 알고 있어야 한다 ****
	    int[] noArray = new int[size];
	    
	    System.out.println("배열의 크기는 : " +noArray.length );
	    System.out.println();
	    
	    for(int i=0; i<5; i++) {
	    	System.out.println((i+1) + "번째 배열의 숫자를 입력하세요 : ");
	    	noArray[i] = sc.nextInt();
	    }
	    
	    // 배열은 반복문하고 사용하면 활용도가 좋다 ( 출력문 과 관계가 깊다 )
	    for(int i = 0; i <size; i++) {
	    	
	    	System.out.println((i+1)+"번째 배열의 값은 ? : "+noArray[i]);
	    }
	    
	    //
	    String[] HueHotel = new String[10];
	    HueHotel[0] = "jasmin";
	    HueHotel[1] = "Born";
	     
	}

}
