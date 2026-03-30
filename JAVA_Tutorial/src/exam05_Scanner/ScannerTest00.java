package exam05_Scanner;
import java.util.Scanner;


public class ScannerTest00 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		
		System.out.printf("이름 : %s 나이 : %d\n", name, age);
		
		scan.close(); // 자원 반납
	}

}
