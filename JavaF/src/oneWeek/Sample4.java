package oneWeek;

public class Sample4 {
	
	public static void main(String[] args) {
		
		int kor = 80;
		int eng = 60;
		double avg = ((double)kor + (double)eng)/2.0;
		
		//1�� �� ��� { } ��� ���� ������
		//if(avg >= 70)  
			//���ǽ��� ���� ��� ����� ����
			//������ ������
			// System.out.println("������ ������.");
		
		if(avg >= 80) {
			System.out.println("������ ������.");
		} else {
			System.out.println("������ ������ �ʴ´�.");
		}
		
		// and &&
		// and�� �ǹ̴� ���ʰ� �������� �Ѵ� ���϶�
		// or�� �ǹ̴� ���ʰ� ������ �߿� �ϳ��� ���϶�
		if((avg < 90) && (avg >=80) ){
			System.out.println("��");
		}
		
		else {
			System.out.println("��");
		}
		
		//
		if(avg >= 90) {
			System.out.println();
		} else if( (avg<90) && (avg >=80) ) {
			System.out.println();
		} else if( (avg < 80) && (avg >= 70) ) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		
		
 	}
}
