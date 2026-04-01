package Workshop04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		final int MAX_HEIGHT = 200;
		final int MIN_HEIGHT = 150;
		
		System.out.print("사람 수 : "); 
		int count = scan.nextInt();
		
		int [] height = new int [count];
		
		for(int i = 0 ; i < count ; ++i) {
			height[i] = r.nextInt((MAX_HEIGHT - MIN_HEIGHT + 1)) + MIN_HEIGHT;
			System.out.println("사람 " + i + " : " + height[i]);
		}
		
		Arrays.sort(height);
		
		System.out.println("최대값 : " + height[count - 1]);
	}

}
