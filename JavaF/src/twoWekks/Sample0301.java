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
		
		// 174 p å  4�� ���� ��Ģ�� ����
		// i�� �þ�� ���ΰ� �þ�� 
		// j�� �þ�� ���ΰ� �þ 
		/*
		 * for(int i=1; i<=5; i++) { for(int j=1; j<=i; j++) { System.out.print("*");
		 * 
		 * } System.out.println(); }
		 */
		
		/*
		 * for(int i=1;i<=5;i++){ for(int j=5;j>i; j--){ System.out.print(" "); }
		 * for(int k=1;k<=i;k++){ System.out.print("*"); } System.out.println(""); }
		 */
		
		// ���ǹ��� �ݺ����� �𸣸� �ȵ� 
		for(int i=1; i<=5; i++) { // �ٱ��� ���ǹ� �����ϸ� �ȿ� ���� 
			for(int j=5; j>=1; j--) {
				
				if(j <= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//�Ƕ�̵� �غ��� 
		
	}
}
