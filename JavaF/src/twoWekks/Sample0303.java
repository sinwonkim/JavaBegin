package twoWekks;

public class Sample0303 {
	public static void main(String[] args) {
		
	/*	// while �� 156p 
		int i = 1;
		
		do {
			System.out.println(i + "��° �ݺ��Դϴ�.");
			i++;
		}while(i >= 5);
	}*/
	
		
		// break ��
		
		/*
		 * int num = 5; for (int i = 1; i <= 10; i++) { System.out.println(i +
		 * "��° ó���Դϴ�."); if (i == num) { break; } }
		 * 
		 * int max = 2000; int sum = 0;
		 * 
		 * for (int i = 1; i <= 1000; i++) { System.out.println(i + "��° ó���Դϴ�."); sum +=
		 * i; if (sum >= max) { break; } } System.out.println("�հ�� : " + sum);
		 */	
	
		
		
		// continue ��
		
		for(int i =1; i<=10; i++) {
			if( i < 5) {
				if(i %2 == 1) {
					continue;
				}
				
			}
			System.out.println(i+ " �� ° ó�� �Դϴ�.");
		}
		
	}
}
