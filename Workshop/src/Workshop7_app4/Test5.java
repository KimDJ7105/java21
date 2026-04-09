package Workshop7_app4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String city = s.next();
		String gu = s.next();
		String dong = s.next();
		
		int sum = city.length() + gu.length() + dong.length() + 2;
		
		System.out.println("문자 수 : " + sum);
				
	}

}
