package twoWekks;

public class Sample0 {

	public static void main(String[] args) {
		int num1 = 3;
		
		// ���� Ÿ�Կ��� ū Ÿ���� ���� ��������
		double num2 = num1;
		num1 = ++num1;
		
		// ū Ÿ�Կ��� ���� Ÿ���� ��� ����� ����ȯ �ؾ��Ѵ�.
		int num3 = (int)num2; 
		
		System.out.println(num1);
		
		boolean b1 = true;  
		boolean b2 = false;
		
		if(true) {
			System.out.println("���ǽ��� �� �϶� ���"); 
		} 
		
		if(num1 < 2) {
			System.out.println("���ǽ��� �� �Դϴ�.");
		} else if(num1 < 5) {
			System.out.println("2��° ���ǽ��� �� �϶�");
		} else {
			System.out.println("���ǽ��� �������� ������ ��");
		}
		
		
	}
}
