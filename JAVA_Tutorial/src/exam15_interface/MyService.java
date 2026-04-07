package exam15_interface;

public interface MyService {
	//구성요소
	// 1. 상수
	public static final int NUM = 20;
	int SIZE = 30; // == public static final int SIZE
	
	// 2. 추상메서드
	public abstract void a();
	void b(); // == public abstract void b();
	
	// 3. default 메서드
	public default void c() {
		System.out.println("default method c");
	}
	
	// 4. static 메서드
	public static void d() {
		System.out.println("statuc method d");
	}
}
