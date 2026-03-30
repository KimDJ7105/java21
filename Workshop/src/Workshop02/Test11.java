package Workshop02;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.정수 입력하세요");
		int a = scan.nextInt();
		System.out.println("2.정수 입력하세요");
		int b = scan.nextInt();
		System.out.println("3.정수 입력하세요");
		int c = scan.nextInt();
		
		System.out.printf("정수 %d 과 정수 %d, 정수 %d 중에서 최대값 : %d", a, b, c, 
				(a > b) ? (a > c) ? a : c : (b > c) ? b : c);
		
		scan.close();
	}

}
