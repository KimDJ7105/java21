package exam04_operator;

public class operator05_ternary {

	public static void main(String[] args) {
		
		int num = 10;
		int result = (num > 2) ? 100 : 200;
		
		System.out.println(result);
		
		String result2 = (num > 3) ? "hello" : "world";
		
		System.out.println(result2);
		
		//중첩도 가능은 함.
		int result3 = (num > 2) ? (num > 29) ? 10 : 20 : 200;
		System.out.println(result3);
	}
}
