package twoWekks;

public class Sample1 {

	public static void main(String[] args) {
		
		// Quiz 1 ���������
		int num1 = 20;
		
		//if���� ����Ͽ� num1�� 3�� ��� ���� �ƴ����� �Ǵ��ϰ�
		//3�� ��� �� ��쿡�� '3�ǹ��'�� ���
		//�ƴҰ�쿡�� '3�� ����� �ƴ�'�� ����Ͻÿ�
		
		if(num1 % 3 == 0) {
			System.out.println("3�� ���");
		}else {
			System.out.println("3�� ����� �ƴ�");
		}
		
		
		// Quiz 2.
		
		// if�� ����ϰ� % ������ ������ ���
		// �������� &&(and) , ||(or), !(not)
		// num2�� ���� 3�� ��� �̸鼭 15�� ����� �ƴ� ���� �Ǵ�
		// num2�� ���� 3�� ��� �̸鼭 15�� ����� �ƴϸ� '15�� ����� �ƴ�' ��� 
		// num2�� ���� 3�� ��� �̸鼭 15�� ��� �̸� '3��15�ǹ��'�� ���
		
		int num2 = 9;
		
		if((num2 % 3 == 0) && (num2%15 == 0)) {
			System.out.println("3�� 15�� ���");
		}else if((num2 % 3 == 0) && (num2 % 15 != 0)) {
			System.out.println("15�� ����� �ƴ�");
		}
		
		// Quiz 3.
		
		int kor = 90;
		int eng = 84;
		int mat = 70;
		
		double avg = (double)(kor+eng+mat)/3;
		double avg2 = (kor+eng+mat)/3.0;
	
		System.out.println(avg);
		
		int maxNum;
		int minNum;
		// �ִ� ���� �ּ� ��   ���� �� ���ؼ� 
		
		int max = 0; 
		max = kor;
		if(max < eng) {
			max = eng;
		}
		if(max < mat) {
			max = mat;
		}
		System.out.println("�ִ밪�� : " + max);
		
		int min = 0;
		min = kor; 
		if(min > eng) {
			min = eng;
		}
		if(min > mat ) {
			min = mat;
		}
		System.out.println("�ּҰ��� : " + min);
		
		int num5 =  34;
		
		switch (num5%2) {
		case 0:
			// ���� 
			System.out.println("¦�� �Դϴ�.");
			break;
		case 1:
			// ���� 
			System.out.println("Ȧ���� �˴ϴ�.");
			break;
		default:
			System.out.println("�߸��� ��� �Դϴ�.");
			break;
		}
	}
}
