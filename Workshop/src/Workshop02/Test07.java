package Workshop02;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.이름을 입력하세요");
		String name = scan.next();
		System.out.println("2.나이를 입력하세요");
		int age = scan.nextInt();
		
		System.out.println("이름은 " + name + ", 나이는 " + age + " 입니다.");
	
		scan.close();
	}

}
