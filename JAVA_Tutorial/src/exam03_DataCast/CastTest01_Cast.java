package exam03_DataCast;

public class CastTest01_Cast {

	public static void main(String[] args) {
		// 수치형 변환
		// 값의 범위가 더 넓은 자료형으로 변환 가능하다.
		// byte > short > int > long > float > double
		
		byte b = 10; 	// byte 변수 선언
		short b2 = b; 	// byte > short 로 cast
		int n = b2; 	// short > int 로 cast
		long l = n;	 	// int > long 로 cast
		float f = l; 	// long > float 로 cast
		double d = f; 	// float > double 로 cast
		
		// byte x = f; // 역은 불가
		
		// char > int 아스키 코드값으로 변환됨
		char c = 'A';
		int num = c;
		
		System.out.println(num); // 65
		System.out.println(c+1); // 문자 연산이 가능하다.

		char c2 = 'a';
		int num2 = c2;
		
		System.out.println(num2); // a
		
		// int보다 작은 정수 끼리의 연산 결과는 int로
		short s = 10;
	    short s2 = 20;
	    // short s3 = s + s2; 
	    //(s + s2)는 int 임
	    
	    // 다른 자료형끼리의 연산 결과는 큰 자료형
	    int k = 10;
	    double k2 = 20;
	    // int k3 = k + k2; 
	    // int와 double의 연산 결과는 double 이다.
	    
	    //문자열 + 비문자열의 결과는 문자열이다.
	    System.out.println("hello" + "world");
	    System.out.println("hello" + 10);
	    System.out.println("hello" + 3.14);
	    System.out.println("hello" + false);
	    
	    System.out.println("hello" + 10 + 20 + 30);
	    System.out.println(10 + 20 + 30 + "hello");
	    
		
	}

}