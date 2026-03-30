package exam04_operator;

public class operator03_logical {

	public static void main(String[] args) {
		
		// and
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&false); 
		// or
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||false);
		// not
		System.out.println(!true);
		System.out.println(!false);
		
		int n = 10;
		int n2 = 20;
		
		// n 값이 15보다 크고 n2 값이 30 보다 작나?
		System.out.println((n > 15) && (n2 < 30));
		// n 값이 15보다 크거나 n2 값이 30 보다 작나?
		System.out.println((n > 15) || (n2 < 30));
		
	}
}
