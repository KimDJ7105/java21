package exam04_operator;

public class operator04_ince_dece {

	public static void main(String[] args) {
		
		//prefix
		int n = 10;
		++n; // n = n + 1 , n += 1과 동일
		
		System.out.println(n);
		
		--n; // n = n - 1 , n -= 1과 동일
		
		System.out.println(n);
		
		//postfix
		int n2 = 10;
		n2++;
		System.out.println(n2);
		n2--;
		System.out.println(n2);
		
		int result = ++n;
		System.out.println(result);
		result = n2++;
		System.out.println(result);
	}
}
