package exam14_Abstract;

public abstract class AbstractClass {
	int num;
	static int n = 0;
	
	public AbstractClass() {
		System.out.println("abstract class 생성");    
	}
	
	public void a() {
		System.out.println("a method");
	}
	
	public static void b() {
		System.out.println("b method");
	}
	
	public abstract void c();
}
