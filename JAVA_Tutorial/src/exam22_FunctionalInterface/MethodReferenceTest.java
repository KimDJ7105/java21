package exam22_FunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class Test {
	public static int method(int x, int y) {
		//static 메서드
		return x+y;
	}
	
	public int method2(int x) {
		//인스턴스 메서드
		return x+100;
	}
	public Test() {} // 생성자
	public Test(int x) {}
}

public class MethodReferenceTest {

	public static void main(String[] args) {
		//Method Reference (Static)
		BinaryOperator<Integer> x = Test::method;
		System.out.println(x.apply(10, 20));
		
		Function<String, Integer> f = Integer::parseInt;
		System.out.println(f.apply("500"));
		
		// Instance Method
		Test t = new Test();
		UnaryOperator<Integer> op = t::method2;
		System.out.println(op.apply(500));
		
		// String Method
		UnaryOperator<String> op2 = String::toUpperCase;
		System.out.println(op2.apply("hello world"));
		
		// Constructer 
		Supplier<Test> sup = Test::new;
		Function<Integer,Test> sup2 = Test::new;
		
		System.out.println(sup.get());
		System.out.println(sup2.apply(4));
		
		// System out
		Consumer<String> c = System.out::println;
		
		c.accept("Hello world");
	}
}
