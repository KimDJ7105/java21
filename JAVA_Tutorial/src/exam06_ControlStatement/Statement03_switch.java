package exam06_ControlStatement;

public class Statement03_switch {

	public static void main(String[] args) {
		int num = 10;
		
		switch (num) {
		case 5 : System.out.println("5");
		break;
		case 10 : System.out.println("10");
		break;
		case 15 : System.out.println("15");
		break;
		case 20 : System.out.println("20");
		break;
		default : System.out.println("default");
		break;
		}
		
		//switch expression
		int n = 10;
		int result = switch (n) {
		case 10 -> 100;
		case 15 -> 150;
		case 20 -> 200;
		default -> 0;
		};
		
		System.out.println(result);
	}

}
