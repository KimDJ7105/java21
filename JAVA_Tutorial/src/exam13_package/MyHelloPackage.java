package exam13_package;

public class MyHelloPackage {

	public static void main(String[] args) {
		MyHello h = new MyHello();
		
		//같은 패키지에서는
		// public protect default에 접근 가능하다.
		System.out.println(h.pub_s);
		System.out.println(h.protect_s);
		System.out.println(h.def_s);
		//System.out.println(h.priv_s);

	}

}
