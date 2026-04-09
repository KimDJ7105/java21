package Workshop7_app1;

public class CalcTest {

	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("잘못된 정보입니다.");
		}
		
		int a = Integer.parseInt(args[0]);
		String s = args[1];
		int b = Integer.parseInt(args[2]);
		
		Calculator c = new Calculator();
		
		switch(s) {
			case "+" : c.plus(a, b); break;
			case "-" : c.minus(a, b); break;
			case "*" : c.multiplication(a, b); break;
			case "/" : c.divide(a, b); break;
			
			default : System.out.println("잘못된 정보입니다.");
		}
	}

}
