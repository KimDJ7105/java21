package exam19_Exception;

public class ExceotionTest {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		
		try {
			int n = 2;
			int result = 10/n;
			System.out.println(result);
			// 0으로 나누면 오류 발생
			// java.lang.ArithmeticException 예외 클래스
			
			String s = null;
			System.out.println(s.length());
			//null인 참조 변수의 메서드 호출
			//NullPointerException 발생
			
		} catch(ArithmeticException e) {
			//예외처리 코드
			System.out.println(e.getMessage());
			System.out.println("division by 0 exception");
			e.printStackTrace();
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(Exception e) {
			// 관례적으로 모든 예외를 처리할 수 있도록 마지막에 Exeption을 받는다.
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			//이 블럭은 예외 여부와 무관하게 반드시 실행됨
			System.out.println("반드시 실행!!!");
		}
		
		try {
			int n = 2;
			int result = 10/n;
			System.out.println(result);
		} finally {
			System.out.println("반드시 실행!!! (catch 없음)");
		}
		
		System.out.println("프로그램 끝");
	}

}
