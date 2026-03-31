package exam06_ControlStatement;

public class Statement07_do_while {
	public static void main(String[] args) {
		int n = 1;
		do {
			System.out.println(n++);
		} while(n < 6);
		
		do {
			System.out.println("once");
		} while(false);
	}
}
