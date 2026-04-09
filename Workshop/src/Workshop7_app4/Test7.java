package Workshop7_app4;

public class Test7 {

	public static void main(String[] args) {
		String mesg = "    홍길동/이순신/유관순    ";
		
				
		System.out.println(mesg.length());
		System.out.println(mesg.strip());
		String mesg2 = mesg.strip();
		System.out.println(mesg2.length());
		System.out.println("문자열의 부분열 : " + mesg2.substring(0,8));
		System.out.println("문자열의 부분열 : " + mesg2.substring(0,3));
		System.out.println("문자열의 부분열 : " + mesg2.substring(8));
	}

}
