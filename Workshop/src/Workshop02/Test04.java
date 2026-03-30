package Workshop02;

// fahrenheit를 celcius로 변환
// 5/9는 정수 나누기이므로 값이 0이 나옴.

public class Test04 {

	public static void main(String[] args) {
		int fahrenheit = 100; 
		float celcius = 5 / (float)9 * (fahrenheit - 32);
		
		System.out.println("Fahrenheit:"+fahrenheit); 
		System.out.println("Celcius:"+celcius);

	}

}
