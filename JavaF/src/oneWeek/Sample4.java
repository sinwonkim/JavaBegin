package oneWeek;

public class Sample4 {
	
	public static void main(String[] args) {
		
		int kor = 80;
		int eng = 60;
		double avg = ((double)kor + (double)eng)/2.0;
		
		//1줄 일 경우 { } 블록 생략 가능함
		//if(avg >= 70)  
			//조건식이 참일 경우 실행될 내용
			//여행을 떠난다
			// System.out.println("여행을 떠난다.");
		
		if(avg >= 80) {
			System.out.println("여행을 떠난다.");
		} else {
			System.out.println("여행을 떠나지 않는다.");
		}
		
		// and &&
		// and의 의미는 왼쪽과 오른쪽이 둘다 참일때
		// or의 의미는 왼쪽과 오른쪽 중에 하나라도 참일때
		if((avg < 90) && (avg >=80) ){
			System.out.println("우");
		}
		
		else {
			System.out.println("가");
		}
		
		//
		if(avg >= 90) {
			System.out.println();
		} else if( (avg<90) && (avg >=80) ) {
			System.out.println();
		} else if( (avg < 80) && (avg >= 70) ) {
			System.out.println("미");
		} else {
			System.out.println("가");
		}
		
		
 	}
}
