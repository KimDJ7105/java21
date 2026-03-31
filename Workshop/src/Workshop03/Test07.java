package Workshop03;
import java.util.Scanner;


public class Test07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int sum = 0;
		for(int i = 1 ; i < 101 ; ++i) {
			if(i % num == 0 ) {
				sum += i;
				
				if(i + num <= 100) {
					System.out.print(i + " + ");
				}
				
				else {
					System.out.print(i + " = ");
					break;
				}
			}
			
		}
		
		System.out.print(sum + "\n");
		
	}

}
