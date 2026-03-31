package Workshop03;
import java.util.Scanner;


public class Test12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = -1;
		
		while (a < 0) {
			System.out.print("정수값 : ");
			a = scan.nextInt();
			
		}
		
		int index = 0;
		for (int i = 1 ; i < 100000000000L ; i *= 10) {
			if(a / i != 0) index++;
			else break;
		}
		
		System.out.println("자릿수 : " + index);
	}

}
