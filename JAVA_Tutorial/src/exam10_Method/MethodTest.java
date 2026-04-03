package exam10_Method;

public class MethodTest {

	public static void main(String[] args) {
		Method m = new Method();
		
		m.method();
		
		m.method2(100, "Hello");
		
		String s = m.method3();
		System.out.println(s);
		
		int n = m.method4(1);
		System.out.println(n);
	}

}
