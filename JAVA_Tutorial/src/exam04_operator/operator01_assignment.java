package exam04_operator;

public class operator01_assignment {

	public static void main(String[] args) {
		int n = 10;
		int n2 = 3;
		
		n += n2;
		
		System.out.println(n + "\t" + n2);
		
		n -= n2;
		
		System.out.println(n + "\t" + n2);
		
		n *= n2;
		
		System.out.println(n + "\t" + n2);
		
		n /= n2;
		
		System.out.println(n + "\t" + n2);
		
		n %= n2;
		
		System.out.println(n + "\t" + n2);
	}
}
