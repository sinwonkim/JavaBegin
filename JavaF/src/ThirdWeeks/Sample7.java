package ThirdWeeks;

import java.util.Scanner;

public class Sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//배열의 크기를 입력받아서 생성 
		System.out.println("배열의 크기를 입력해주세요 : ");
		int size = sc.nextInt();
		// 입력된 크기만큼 배열 생성 
//		int[] num = {1,2,3,4,5,6,7,8};
		int[] num = new int[size];
		
		for(int t=0; t<num.length; t++) {
			System.out.println((t+1)+"번째 숫자를 입력하세요.");
			num[t] = sc.nextInt();
		}
		
		//정렬
		//회차
		for(int i = 0; i<num.length; i++) {
			//배열의 숫자를 비교하는 반복
			for(int j=0; j<num.length-1-i; j++) {
				//크기비교
				if(num[j] < num[j+1]) {
					// 자리 바꾸기
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
			
			System.out.print((i+1)+"회차 : ");
			for(int k=0; k<num.length; k++) {
				System.out.print(num[k]+" ");
			}
			System.out.println();
		}
	
	}

}
