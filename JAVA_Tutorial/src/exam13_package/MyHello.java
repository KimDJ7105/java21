package exam13_package;


public class MyHello {
	
	public String pub_s;
	protected String protect_s;
	String def_s;
	private String priv_s;
	
	public void method() {
		System.out.println("MyHello.method()");
	}
	
	public MyHello() {
		
		//같은 class에서는 모든 접근지정자에 접근 가능하다.
		pub_s = "pub_s";
		protect_s = "protect_s";
		def_s = "def_s";
		priv_s = "priv_s";
	}
}
