package ThirdWeeks;

public class Sample6 {

	public static void main(String[] args) {
		// int[] num = new int[10];
		
		// ���������� �غ���
		int[] num = {1,2,3,4,5,6,7,8};
		
		// index�� 0���� �����ϴϱ� �ݺ��� �Ҷ� 0���� �����ϴ°� ���� 
		// ȸ�� 
		for(int i = 0; i<num.length; i++) {
			//�迭�� ���ڸ� ���ϴ� �ݺ� 
			for(int j=0; j<num.length-1-i; j++) {
				
				//ũ�� ��
				if(num[j] < num[j+1]) {
					// �ڸ��ٲٱ�
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
			
			System.out.print((i+1)+"ȸ�� : ");
			for(int k=0; k<num.length; k++) {
				System.out.print(num[k]+" ");
			}
			System.out.println();
			
		}
		
		
	}
}
