package ThirdWeeks;

public class Sample6 {

	public static void main(String[] args) {
		// int[] num = new int[10];
		
		// 버블정렬을 해보자
		int[] num = {1,2,3,4,5,6,7,8};
		
		// index는 0부터 시작하니깐 반복문 할때 0부터 시작하는게 좋음 
		// 회차 
		for(int i = 0; i<num.length; i++) {
			//배열의 숫자를 비교하는 반복 
			for(int j=0; j<num.length-1-i; j++) {
				
				//크기 비교
				if(num[j] < num[j+1]) {
					// 자리바꾸기
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
