package exam10_Method;

class Test {
	int num;
	String name;
	
	public Test(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
}

public class TestCallBy {

	//static 메서드는 객체 생성 없이 사용 가능
		// Call by value
		public static void pdt(int n) {
			n = 20;
		}
		// Call by value reference
		public static void rdt(Test t) {
			t.name = "World";
			t.num = 100;
		}
		
		public static void rdt2(Test t) {
			t = new Test(999, "Reference");
		}
	
	public static void main(String[] args) {
		// call by value 실습
		int num = 10;
		System.out.println("pdt 실행 전 : " + num);
		pdt(num);
		System.out.println("pdt 실행 후 : " + num);
		
		// call by value reference 실습
		Test t = new Test(10, "Hello");
		
		System.out.println("rdt 실행 전 : " + t.name + t.num);
		rdt(t);
		System.out.println("rdt 실행 후 : " + t.name + t.num);
		
		System.out.println("rdt2 실행 전 : " + t.name + t.num);
		rdt2(t);
		System.out.println("rdt2 실행 후 : " + t.name + t.num);
	}

}
