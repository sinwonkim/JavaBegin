package ThirdWeeks;

import java.util.Scanner;

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// System�̶� �츮�� ����ϰ� �ִ� �ý����� �� ���̴�. �츮�� Ű���带 ���� �Է��� ���� ���̴�. in �� �Է� Out�� ��� 
		// System.out.println();
		
		
		// System.out.println("���ڸ� �Է��� �ּ��� :");
		
		// int���� �Է� ������  
	    // int num = sc.nextInt();
	    
	    //System.out.println("����� �Է��� ���ڴ� ? " + num + "�Դϴ�.");
			
		
		
		// ���� ���α׷���  ( �� �Է� �޾Ƽ� ���� )  
	    
	    System.out.println("�迭�� ũ�⸦ �Է��ϼ��� : ");
	    int size = sc.nextInt();
	    
	    //�迭 Array ***** ������ �� ����� �ݵ�� �˰� �־�� �Ѵ� ****
	    int[] noArray = new int[size];
	    
	    System.out.println("�迭�� ũ��� : " +noArray.length );
	    System.out.println();
	    
	    for(int i=0; i<5; i++) {
	    	System.out.println((i+1) + "��° �迭�� ���ڸ� �Է��ϼ��� : ");
	    	noArray[i] = sc.nextInt();
	    }
	    
	    // �迭�� �ݺ����ϰ� ����ϸ� Ȱ�뵵�� ���� ( ��¹� �� ���谡 ��� )
	    for(int i = 0; i <size; i++) {
	    	
	    	System.out.println((i+1)+"��° �迭�� ���� ? : "+noArray[i]);
	    }
	    
	    //
	    String[] HueHotel = new String[10];
	    HueHotel[0] = "jasmin";
	    HueHotel[1] = "Born";
	     
	}

}
