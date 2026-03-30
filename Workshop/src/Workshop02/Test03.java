package Workshop02;

//ch의 값이 영문자 일때만 true가 되도록 하기

public class Test03 {

	public static void main(String[] args) {
		char ch = 'z'; 
		boolean b = (ch >= 'A' && ch <= 'z');

		System.out.println(b); 

	}

}
