package exam16_anonymousClass;

public class TestMain {

	public static void main(String[] args) {
		// 이름 있는 class의 인스턴스 생성
		Bird b = new Bird();
		// interface에서 구현한 메서드 호출
		b.fly(); 
		
		Flyer f = new Flyer() {
			@Override
			public void fly() {
				System.out.println("Anonymous Fly"); 
			}
			
			@Override
			public void land() {
				System.out.println("Anonymous land"); 
			}
		}; //익명 class 인스턴스 생성
		
		f.fly(); // 익명 class의 메서드 호출
		
		b.land();
		f.land();

	}

}
