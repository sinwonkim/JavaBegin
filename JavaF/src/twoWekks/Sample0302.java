package twoWekks;

public class Sample0302 {
	public static void main(String[] args) {
		// 157p
		// while���� ����� �� ������ ��� ���� ���ᰡ �ǰԲ� ������ ����� ����� 
		// for���� �ݺ��� ����Ǵ� ������ ���ϰ� �Ѵ�. 
		int i = 0;
		while (i <=5) {
			for(int j = 5; j>=i; j--) {
				System.out.print(j + "�� ° " );
			}
			System.out.println();
			i++;
		}
	}
}
