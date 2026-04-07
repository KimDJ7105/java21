package exam15_interface;

public class MyServiceImpl extends MyClass implements MyService, MyService2 {

	@Override
	public void a() {
		System.out.println("override interface method a");
		
	}

	@Override
	public void b() {
		System.out.println("override interface method b");
		
	}

	@Override
	public void x() {
		// 여러 interface를 다중 구현 가능하다
		System.out.println("override interface method x");
		
	}

}
