package exam22_FunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.IntUnaryOperator;

public class OperatorTest {

	public static void main(String[] args) {
		
		BinaryOperator<String> x = new BinaryOperator<String>() {
			
			@Override
			public String apply(String t, String u) {
				// TODO Auto-generated method stub
				return t+u;
			}
		};
		
		BinaryOperator<String> x2 = (t,u)->t+u;
		
		System.out.println(x.apply("Hello", "World"));
	
		System.out.println(x2.apply("Hello2", "World2"));
		
		IntUnaryOperator y = new IntUnaryOperator() {
			
			@Override
			public int applyAsInt(int operand) {
				return operand * operand;
			}
		};
		
		IntUnaryOperator y2 = operand-> operand * operand;
	
		System.out.println(y.applyAsInt(25));
		System.out.println(y2.applyAsInt(25));
	
	}

}
