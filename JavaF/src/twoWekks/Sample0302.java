package twoWekks;

public class Sample0302 {
	public static void main(String[] args) {
		// 157p
		// while문을 사용할 땐 조건이 어느 순간 종료가 되게끔 조건을 만들어 줘야함 
		// for문은 반복이 종료되는 시점을 정하고 한다. 
		int i = 0;
		while (i <=5) {
			for(int j = 5; j>=i; j--) {
				System.out.print(j + "번 째 " );
			}
			System.out.println();
			i++;
		}
	}
}
