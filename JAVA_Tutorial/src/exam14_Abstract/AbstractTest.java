package exam14_Abstract;

public class AbstractTest {

	public static void main(String[] args) {
		//추상 클래스는 인스턴트 생성이 불가능하다.
		//AbstractClass ac = new AbstractClass();
		
		//추상 클래스라도 static 변수 및 메서드는
		//바로 접근 및 호출 가능하다.
		AbstractClass.b();
		System.out.println(AbstractClass.n);
		
		//추상 클래스의 생성자도 자식 클래스 생성시 호출됨.
		Child c = new Child();
		c.c(); //재정의 한 추상 메서드 호출
		c.a(); //상속받은 부모의 메서드 호출도 당연 가능
		}

}
