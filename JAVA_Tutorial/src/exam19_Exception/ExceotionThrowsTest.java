package exam19_Exception;

class Test {
	public void a() throws NullPointerException, ArithmeticException {
		//Arithmetic, NullPointer 예외 발생시
		//throws 로 호출 메서드에 예외 전달
		//여러 예외를 throws 하도록 할 수 있다.
		
		b();
		
		c();
	}
	
	public void b() throws NullPointerException {
		//NullPointer 예외 발생시
		//throws 로 호출 메서드에 예외 전달
		
		/*
		try { // 발생된 곳에서 예외 처리하기
		String s = null;
		System.out.println(s.lastIndexOf(0));
		//NullPointer 예외 발생 시키기
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		
		String s = null;
		System.out.println(s.lastIndexOf(0));
		//NullPointer 예외 발생 시키기
	}
	
	public void c() throws ArithmeticException {
		//Arithmetic 예외 발생시
		//throws 로 호출 메서드에 예외 전달
		
		int n = 0;
		System.out.println(10/n);
	}
}

public class ExceotionThrowsTest {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		try { 
			Test t = new Test();
			t.a();
		
		} catch(NullPointerException e) {
			//throws 된 예외를 catch하여 처리
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료");
	}
}
