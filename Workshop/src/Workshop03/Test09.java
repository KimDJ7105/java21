package Workshop03;
import java.util.Scanner;


public class Test09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		if(min > a) min = a;
		if(min > b) min = b;
		if(min > c) min = c;
		
		
		if(max < a) max = a;
		if(max < b) max = b;
		if(max < c) max = c;
		
		System.out.println("최대값 : " + max + " 최소값 : " + min );
	}

}
