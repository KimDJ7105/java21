package exam01_PDT;

public class PDT03_char {

	public static void main(String[] args) {
		//char 출력
		System.out.println('가');
		System.out.println('A');
		//System.out.println('안녕'); 오류!
		
		//일부 특수 문자 출력 (이스케이프 문자)
		char c = '\\';
		System.out.println(c);
		c = '\'';
		System.out.println(c);
		c = '\"';
		System.out.println(c);
		
		//이스케이프 문자
		c = '\n';
		System.out.print("hello world");
		System.out.print(c); // 줄바꿈
		System.out.println("hello\nworld"); // \n 확인
		c = '\t';
		System.out.print("hello");
		System.out.print(c); //tab 삽입
		System.out.println("world");
		System.out.println("hello\tworld"); // \t 확인
		
	}

}
