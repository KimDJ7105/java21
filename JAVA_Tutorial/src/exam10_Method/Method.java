package exam10_Method;

public class Method {
	//1. 인자와 리턴 값 모두 없는 메서드
	public void method() {
		System.out.println("method");
	}
	//2. 인자는 있고 리턴 값 없는 메서드
	public void method2(int num, String s) {
		System.out.println(num + s);
	}
	//3. 인자는 없고 리턴 값 있는 메서드
	public String method3() {
		return "method3";
	}
	//4. 인자와 리턴 값 모두 있는 메서드
	public int method4(int num) {
		return ++num;
	}
	
	// 오버로딩 메서드
	public void a() {}
	public void a(int n) {}
	public void a(String s) {}
	public void a(int n, String s) {}
	public void a(String s, int n) {}
	//public int a() {}
	//반환 타입은 메서드 구분 요소가 아니다.
}
