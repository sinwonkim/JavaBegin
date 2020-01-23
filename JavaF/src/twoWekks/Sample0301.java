package twoWekks;

public class Sample0301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * for(int i=1; i<=5; i++) { for(int j=1; j<=5; j++) {
		 * System.out.print("("+i+","+j+")");
		 * 
		 * } System.out.println();
		 * 
		 * }
		 */
		
		// 174 p 책  4번 문제 규칙을 보라
		// i가 늘어나면 세로가 늘어나고 
		// j가 늘어나면 가로가 늘어남 
		/*
		 * for(int i=1; i<=5; i++) { for(int j=1; j<=i; j++) { System.out.print("*");
		 * 
		 * } System.out.println(); }
		 */
		
		/*
		 * for(int i=1;i<=5;i++){ for(int j=5;j>i; j--){ System.out.print(" "); }
		 * for(int k=1;k<=i;k++){ System.out.print("*"); } System.out.println(""); }
		 */
		
		// 조건문과 반복문을 모르면 안됨 
		for(int i=1; i<=5; i++) { // 바깥쪽 조건문 충족하면 안에 실행 
			for(int j=5; j>=1; j--) {
				
				if(j <= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//피라미드 해보기 
		
	}
}
