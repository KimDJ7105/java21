package Workshop02;

// 100의 자리 숫자만 남기기

public class Test02 {
	public static void main(String[] args) {
		int num = 456; 
		int result = num - (num % 100);

		System.out.println(result);
	}
}
