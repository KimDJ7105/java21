package Workshop04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest10 {

	public static void main(String[] args) {
		int [] arr = {0, 0};
		boolean flag = false;
		Random r = new Random();
		
		for (int i = 0 ; i < 2 ; ++i ) {
			if(args.length != 2) {
				System.out.println("다시 입력하세요");
				flag = true;
				break;
			}
			
			int num = Integer.parseInt(args[i]);
			if(num < 1 || num > 5) {
				System.out.println("숫자를 확인하세요");
				flag = true;
				break;
			}
			
			arr[i] = num;
		}
		
		
		while(flag) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("a b 형식으로 입력 : ");
			
			arr[0] = scan.nextInt();
			arr[1] = scan.nextInt();
			
			if (arr[0] > 0 && arr[0] < 6 && arr[1] > 0 && arr[1] < 6) {
				flag = false;
			}
			
		}
		
		System.out.println("입력한 숫자 : " + arr[0] + " " + arr[1]);
		
		int [][] num;
		num = new int [arr[0]][arr[1]];
		int sum = 0;
		
		for(int i = 0 ; i < arr[0] ; ++i) {
			for(int j = 0 ; j < arr[1] ;++j) {
				num[i][j] = r.nextInt(5) + 1;
				sum += num[i][j];
				
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("sum = " + (float)sum);
		System.out.println("avg = " + sum/(float)(arr[0]*arr[1]));
		
	}

}
