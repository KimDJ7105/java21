package Workshop03;
import java.util.Scanner;


public class Test10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = -1;
		
		while (num <= 0) {
			System.out.print("양수를 입력 : ");
			num = scan.nextInt();
			
			if(num <= 0 ) {
				System.out.println("양수가 아닙니다.");
			}
		}
		
		int sum = 0;
		for(int i = 0 ; i < num ; ++i) {
			sum += i;
		}
		
		System.out.println("총합 : " + sum);
	}

}
