package exam03_DataCast;

public class CastTest00_autoCast {

	public static void main(String[] args) {
		// int보다 작은 정수 끼리의 연산 결과는 int로
		short s = 10;
	    short s2 = 20;
	    short s3 = (short)(s + s2); 
	    //(s + s2)는 int 임
	    
	    System.out.println(s3);
	    
	    // 다른 자료형끼리의 연산 결과는 큰 자료형
	    int k = 10;
	    double k2 = 20;
	    int k3 = (int)(k + k2); 
	    // int와 double의 연산 결과는 double 이다.
	    
	    System.out.println(k3);
	}

}