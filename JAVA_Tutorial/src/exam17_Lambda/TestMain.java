package exam17_Lambda;

@FunctionalInterface
interface A { // 추상 메서드가 1개인 인터페이스
	void a();
	
	//default 메서드는 가질 수 있다.
	public default void b() {
		System.out.println("default method b");
	}
	
	//static 메서드도 제한 없이 가질 수 있다.
	public static void c() {
		System.out.println("static method c");
	}
}

@FunctionalInterface
interface B {
	public abstract void b(int n);
}

public class TestMain {

	public static void main(String[] args) {
		A a = ()->{System.out.println("method a Overrided by lambda");};
		
		a.a(); //lambda 표현식으로 생성된 인스턴스
		a.b(); //default 메서드도 사용 가능
		A.c(); //static 메서드도 사용 가능
		
		A a2 = ()->System.out.println("method from b");
		// 실행문이 1줄이면 중괄호 생략 가능
		a2.a(); // 오버라이딩 메서드 호출
		//a 와 a2는 서로 다른 인스턴스로 분류된다.
		
		B b = (int n)->{System.out.println("bb" + n);}; // 람다 표현식
		B b2 = (int n )->System.out.println("b2" + n);
		// 만약 실행문이 한 줄 이라면 {} 생략 가능 
		B b3 = (n)->System.out.println("b3" + n);
		// 인자의 자료형 생략 가능
		B b4 = n->System.out.println("b4" + n);
		// 인자가 하나인 경우 ()생략 가능
		//B b4 = (n, n2)->System.out.println("b4" + n);
		// 인자가 두 개인 경우 생략 불가능!!!
		
		b.b(0);
		b2.b(2);
		b3.b(3);
		b4.b(4);
	}

}
