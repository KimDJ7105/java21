package exam22_FunctionalInterface;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

/*
@FunctionalInterface
public interface Supplier<T>{
   T get();  // public abstract T get() 동일
}  
*/

public class SupplierTest {

	public static void main(String[] args) {
		//Supplier 익명 클래스 
		Supplier<String> s = new Supplier<String>() {
			
			@Override
			public String get() {
				return "Hello";
			}
		};
		
		//lambda 표현식
		Supplier<String> s2 = ()->"World";
		
		System.out.println(s.get());
		System.out.println(s2.get());
		
		//DoubleSupplier 익명 클래스
		DoubleSupplier ds = new DoubleSupplier() {
			
			@Override
			public double getAsDouble() {
				return 3.14d;
			}
		};
		
		DoubleSupplier ds2 = ()->2.56d;
		
		System.out.println(ds.getAsDouble() + ds2.getAsDouble());
	}

}
