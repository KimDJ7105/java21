package exam17_Lambda;

@FunctionalInterface
interface C {
	public abstract String c();
}

@FunctionalInterface
interface D {
	public abstract int d(int n, int n2);
}

public class TestMain2 {

	public static void main(String[] args) {
		C c = ()->{ return "C";};
		C c2 = ()->"C2";
		//return 문만 있다면 return과 {}생략 가능
		
		System.out.println(c.c());
		System.out.println(c2.c());
		
		
		D d = (int n, int n2)->{return n + n2;};
		D d2 = (n, n2)->{return n + n2 + 2;};
		// 인자의 자료형 생략 가능
		D d3 = (n, n2)->n + n2 + 3;
		//return 문만 있다면 return과 {}생략 가능
		
		System.out.println(d.d(10, 15));
		System.out.println(d2.d(10, 15));
		System.out.println(d3.d(10, 15));
	}

}
