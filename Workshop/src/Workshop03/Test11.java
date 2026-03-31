package Workshop03;
import java.util.Scanner;


public class Test11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		int b = Integer.MIN_VALUE;
		
		System.out.print("a의 값 : ");
		a = scan.nextInt();
		
		while (b < a) {
			System.out.print("b의 값 : ");
			b = scan.nextInt();
			
			if(b < a) {
				System.out.println("b가 a보다 작습니다.");
			}
		}
		
		System.out.println("b - a = " + (b-a));
	}

}
