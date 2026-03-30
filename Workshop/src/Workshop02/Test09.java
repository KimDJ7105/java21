package Workshop02;

import java.util.Scanner;

//Scanner 클래스를 사용하여 키보드로 두 개의 정수값을 입력 받아서 
//최대값을 구하는 코드 작업. 단, 3항 연산자만 사용할 것

public class Test09 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.정수 입력하세요");
		int a = scan.nextInt();
		System.out.println("2.정수 입력하세요");
		int b = scan.nextInt();
		
		System.out.printf("정수 %d 과 정수 %d 중에서 최대값 : %d", a, b, (a > b) ? a : b);
		
		scan.close();
	}
}
