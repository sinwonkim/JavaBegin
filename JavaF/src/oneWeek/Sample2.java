package oneWeek;

public class Sample2 {
	
	public static void main(String[] args ) {
		
		// int �ڷ��� ����� �ʱ�ȭ 
		//int inum = 160;
		
		//System.out.println("Ű��  " + inum + "��Ƽ���� �Դϴ�.");
		//System.out.println("double�� ������ �����մϴ�.");
		// ū �������� ���� �����մϴ�. 
		//double dnum = inum;
		//System.out.println("Ű��  "+ dnum + " ��Ƽ���� �Դϴ�.");
		
		 
		double dnum = 160.5;
		System.out.println("Ű��" +dnum + "��Ƽ���� �Դϴ�.");
		System.out.println("int�� ������ �����մϴ�.");
		// ���� ���������� �����ϱ�  ū�� -> ���� ���� �ٲܶ� �� ����ȯ �Ұ� !!!!!!!!!!!!!!!!!!!!!!!!!!
		int inum = (int)dnum;
		System.out.println("Ű��"+ inum +"��Ƽ���� �Դϴ�.");
		
		int d = 2;
		double pi = 3.14;
		
		System.out.println("������"+d+"��Ƽ���� ����");
		System.out.println("�ѷ��� " + (d*pi)+ "��Ƽ���� �Դϴ�.");
		
		
		
	}
}
