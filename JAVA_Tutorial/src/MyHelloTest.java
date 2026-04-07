//default 페키지
import exam13_package.MyHello;

public class MyHelloTest {

	public static void main(String[] args) {
		exam13_package.MyHello h = new exam13_package.MyHello();
		//MyHello는 다른 페키지에 있어 접근 불가
		//패키지의 위치를 명시적으로 지정해서 접근 할 수 있다.
		
		h.method();
		
		//import를 사용해서 클래스에 바로 접근 가능하다.
		MyHello h2 = new MyHello();
		
		h2.method();
	}

}
