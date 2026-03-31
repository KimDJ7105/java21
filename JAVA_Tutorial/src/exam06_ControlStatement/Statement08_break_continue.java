package exam06_ControlStatement;

public class Statement08_break_continue {
	public static void main(String[] args) {
		int n = 0;
		
		while(true) {
			System.out.println(n++);
			
			if(n == 10) break; 
			// n 이 10 이 되면 반복문에서 빠져나옴
		}
		
		for (int i = 0 ; i < 10 ; ++i) {
			if (i % 2 != 0) continue; // 홀수는 넘어감
			System.out.println(i);
		}
	}
}
