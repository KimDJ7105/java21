package Workshop03;
import java.util.Scanner;


public class Test13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = -1;
		
		while (a < 9 || a > 100) {
			System.out.print("2자리 양의 정수 : ");
			a = scan.nextInt();
			
		}
		
		System.out.println("입력값 : " + a);
	}

}
