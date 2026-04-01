package Workshop04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사람 수 : "); 
		int count = scan.nextInt();
		
		int [] height = new int [count];
		
		for(int i = 0 ; i < count ; ++i) {
			System.out.print("사람 " + i + " : ");
			height[i] = scan.nextInt();
		}
		
		Arrays.sort(height);
		
		System.out.println("최대값 : " + height[count - 1]);
	}

}
