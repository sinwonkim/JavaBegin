package ThirdWeeks;

import java.util.Scanner;

public class Sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//�迭�� ũ�⸦ �Է¹޾Ƽ� ���� 
		System.out.println("�迭�� ũ�⸦ �Է����ּ��� : ");
		int size = sc.nextInt();
		// �Էµ� ũ�⸸ŭ �迭 ���� 
//		int[] num = {1,2,3,4,5,6,7,8};
		int[] num = new int[size];
		
		for(int t=0; t<num.length; t++) {
			System.out.println((t+1)+"��° ���ڸ� �Է��ϼ���.");
			num[t] = sc.nextInt();
		}
		
		//����
		//ȸ��
		for(int i = 0; i<num.length; i++) {
			//�迭�� ���ڸ� ���ϴ� �ݺ�
			for(int j=0; j<num.length-1-i; j++) {
				//ũ���
				if(num[j] < num[j+1]) {
					// �ڸ� �ٲٱ�
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
