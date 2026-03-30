package Workshop02;

// 삼항 연산자로 홀수 짝수 출력하기

public class Test06 {

	public static void main(String[] args) {
		int i = 5; 
		String result = (i % 2 == 0) ? "는 짝수 입니다," : "는 홀수입니다.";                     
		System.out.println("선언 변수 " + i + "일때 결과 : \n"
				+ "숫자 " + i + result); 
	}

}
