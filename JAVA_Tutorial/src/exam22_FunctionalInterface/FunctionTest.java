package exam22_FunctionalInterface;

import java.util.function.Function;

/*
@FunctionalInterface
public interface Function<T,R>{
  R apply(T t);   // public abstract R apply(T t); 동일
}  
*/

public class FunctionTest {

	public static void main(String[] args) {
		
		//Function 익명 클래스
		Function<String, Integer> f = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		
		//Function 람다 표현식
		Function<String, Integer> f2 = t->t.length();
		
		System.out.println(f.apply("Hello"));
		System.out.println(f2.apply("Hello"));
	}

}
