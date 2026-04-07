//default 페키지

import exam13_package.MyHello;

public class MyHelloTest {

	public static void main(String[] args) {
		MyHello h = new MyHello();
		//MyHello는 다른 페키지에 있어 접근 불가
		//패키지의 위치를 명시적으로 지정해서 접근 할 수 있다.
		
		h.method();
		
		//import를 사용해서 클래스에 바로 접근 가능하다.
		MyHello h2 = new MyHello();
		
		h2.method();
		
		//다른 패키지의 상속관계가 아닌 class는
		//public 만 접근 가능하다.
		System.out.println(h2.pub_s);
		//System.out.println(h2.protect_s);
		//System.out.println(h2.def_s);
		//System.out.println(h2.priv_s);
	}

}
