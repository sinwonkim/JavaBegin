package twoWekks;

public class Sample3 {
	
		public static void main(String[] args) {
		
		// 9���� 1���� ���ڸ� �ٿ���
		for(int num=0; num>0; num--) {
			
			System.out.println(num);
		}
			
		// 1~10���� ����� �ϴµ� 2�� ����
		for(int num2=1; num2<10; num2+=2) {
			
			System.out.println("num2�� ���� 2�� ���� : "+num2);
		}
		
		for(int num=1; num<=100; num++) {
			//���ǹ�(Ȧ�� �϶��� ���)
			if(num%2 == 1) {
				System.out.println(num);
			}
 			
		}
		
		//1~9������ �հ踦 ���ؼ� ����Ͻÿ�.
				//�հ踦 ������ ����
				int sum = 0;
				
				// 1+2+3+4+5+6+7+8+9
				for(int num=1; num<10; num=num+1) {
					//sum = sum + num;
					sum+=num;
					System.out.println("�ݺ�Ƚ�� : " + num);
					System.out.println("");
				}
				
				
		// 1~100���� ����� �ϴµ� 1�� ����
		// Ȧ���� �հ�
		int odd = 0;
		// ¦���� �հ�
		int even = 0;
		
		// Ȧ��, ¦�� 
			for(int num=1; num<=100; num++) {
				if(num%2 == 1) {
					//Ȧ��
					odd += num;
					
				} else {
					// ¦�� 
					even += num;
					
				}
			}
			System.out.println("Ȧ���� �� : "+odd);
			System.out.println("¦���� �� : " +even);
	 }
		
}
