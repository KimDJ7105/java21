package exam22_FunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<String> p = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.equals("Hello");
			}
		};

		
		Predicate<String> p2 = t->t.equals("World");
	
		System.out.println(p.test("Hello"));
		System.out.println(p2.test("Hello"));
		
		BiPredicate<String, Integer> bp = new BiPredicate<String, Integer>() {
			
			@Override
			public boolean test(String t, Integer u) {
				// TODO Auto-generated method stub
				return t.length() == u;
			}
		};
		
		BiPredicate<String, Integer> bp2 = (t, u)->t.length() == u;
		
		System.out.println(bp.test("Hello", 5));
		System.out.println(bp2.test("World", 4));
		
		IntPredicate ip = n->(n%2==0);
		IntPredicate ip2 = n->(n%3==0);
		IntPredicate ip3 = ip.and(ip2);
		
		System.out.println(ip3.test(90));
	}

}
