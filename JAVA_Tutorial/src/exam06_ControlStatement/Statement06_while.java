package exam06_ControlStatement;
import java.util.Scanner;

public class Statement06_while {
	public static void main(String[] args) {
		
		int n = 1;
		
		while (n <= 5) {
			System.out.println(n);
			n++;
		}
		
		String name = "";
		int age = 0;
		
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("==============");
			System.out.println("1. 이름 입력");
			System.out.println("2. 나이 입력");
			System.out.println("3. Quit");
			System.out.println("==============");
			
			int num = scan.nextInt();
			
			switch(num) {
			case 1 : 
				System.out.print("이름을 입력해주세요 : ");
				name = scan.next();
				break;
			case 2 : 
				System.out.print("나이를 입력해주세요 : ");
				age = scan.nextInt();
				break;
			case 3 : 
				System.exit(0);
				break;
			default : System.out.println("1 ~ 3의 값을 입력해주세요");
			}
			
		}
	}
}
