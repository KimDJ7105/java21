package Workshop02;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주소를 입력하시오.");
		String doe = scan.next();
		String si = scan.next();
		String gu = scan.next();

		System.out.println("도명: " + doe);
		System.out.println("시명: " + si);
		System.out.println("구명: " + gu);
		
		scan.close();
	}

}
