package exam22_FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjDoubleConsumer;

/*
@FunctionalInterface
public interface Consumer<T>{
   void accept(T t); // public abstract void accept(T t);
} 
*/

public class ConsumerTest {

	public static void main(String[] args) {
		//Consumer 인터페이스 사용
		
		//익명 클래스
		Consumer<String> con = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println("Consumer : " + t);
				
			}
		};

		con.accept("Hello");
		
		//람다 표현식
		Consumer<String> con2 = t->System.out.println("Consumer Lambda : " + t);
	
		con2.accept("World");
		
		//BiConsumer 사용
		//익명 클래스
		BiConsumer<String, Integer> bicon = new BiConsumer<String, Integer>() {
			
			@Override
			public void accept(String t, Integer u) {
				System.out.println(t + u);
				
			}
		};
		
		//람다 표현식
		BiConsumer<String, Integer> bicon2 = (t, u)->System.out.println("Lambda. " + t + u);
		
		bicon.accept("Hello", 5);
		bicon2.accept("World", 5);
		
		//ObjDoubleConsumer
		ObjDoubleConsumer<Float> obc = new ObjDoubleConsumer<Float>() {
			
			@Override
			public void accept(Float t, double value) {
				System.out.println(t + value);
				
			}
		};
		
		ObjDoubleConsumer<Float> obc2 = (t, value)->System.out.println(t + value);
		
		obc.accept(3.14f, 2.56);
		obc2.accept(3.14f, 2.56);
	}

}
