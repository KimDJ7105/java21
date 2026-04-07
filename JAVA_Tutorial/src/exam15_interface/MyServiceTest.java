package exam15_interface;

public class MyServiceTest {

	public static void main(String[] args) {
		//MyService s = new MyService();
		// 인터페이스는 인스턴스 생성이 불가.
		
		MyServiceImpl s = new MyServiceImpl();
		
		//상수 접근
		System.out.println(s.NUM + "\t" +  MyService.SIZE);
		s.a(); //재정의된 추상 메서드
		s.b();
		s.c(); //default 메서드 호출
		MyService.d(); //static 메서드 호출
		s.x(); // 다중 구현 가능
		s.showCase(); // 상속도 가능
	}

}
