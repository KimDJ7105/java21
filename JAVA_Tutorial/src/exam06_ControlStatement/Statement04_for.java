package exam06_ControlStatement;

public class Statement04_for {
	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; ++i) {
			System.out.println(i);
		}
		
		for(int i = 10 ; i >= 6 ; --i) {
			System.out.println(i);
		}
		
		for (int i = 0 ; i < 10 ; i +=2) {
			System.out.println(i);
		}
		
		for (int i = 0, k = 1 ; i < 20 && k < 50 ; i +=2, k *= 3 ) {
			System.out.println(i + k);
		}
	}
}
