package Workshop7_app1;

public class Calculator {
	public double plus(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}
	
	public double minus(int a, int b) {
		System.out.println(a - b);
		return a - b;
	}
	
	public double multiplication(int a, int b) {
		System.out.println(a * b);
		return a * b;
	}
	
	public double divide (int a, int b) {
		try {
			System.out.println((double)a / (double)b);
			return (double)a / (double)b;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		return -1;
	}
}
