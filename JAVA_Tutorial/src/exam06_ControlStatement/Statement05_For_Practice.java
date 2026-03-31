package exam06_ControlStatement;

public class Statement05_For_Practice {
	public static void main(String[] args) {
		// 짝수만 출력
		for(int i = 1 ; i <= 20 ; ++i) {
			if(i % 2 == 0) System.out.println(i);
		}
		
		// 3의 배수만 출력
		for(int i = 1 ; i <= 20 ; ++i) {
			if(i % 3 == 0) System.out.println(i);
		}
		
		// 총합 출력
		int sum = 0;
		for(int i = 1 ; i <= 20 ; ++i) {
			sum += i;
		}
		System.out.println(sum);
		
		//짝수값 총합 출력
		sum = 0;
		for(int i = 1 ; i <= 20 ; ++i) {
			if(i % 2 == 0) sum += i;
		}
		System.out.println(sum);
	}
}
