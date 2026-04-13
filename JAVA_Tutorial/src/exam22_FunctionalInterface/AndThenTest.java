package exam22_FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;

public class AndThenTest {

	public static void main(String[] args) {
		//Consumer 이용
		Consumer<String> c = s->System.out.println("First " + s);
		Consumer<String> c2 = s->System.out.println("Second " + s);
		
		//andThen
		Consumer<String> c3 = c.andThen(c2);
		c3.accept("Hello");
		
		//Function 이용
		Function<String, Integer> f = s->s.length();
		Function<Integer, Integer> f2 = l->l*l;
		
		Function<String, Integer> f3 = f.andThen(f2);
		
		System.out.println(f3.apply("Hello"));
		
	}

}
