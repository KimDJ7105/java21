package Workshop03;
import java.util.Scanner;


public class Test15_19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		System.out.println("===============");
		
		for (int i = n; i >= 1; i--) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		System.out.println("===============");
		
		for (int i = 0; i < n; i++) {
		    // 공백을 출력하는 루프
		    for (int j = 0; j < i; j++) {
		        System.out.print(" ");
		    }
		    // 별을 출력하는 루프
		    for (int j = 0; j < n - i; j++) {
		        System.out.print("*");
		    }
		    // 줄바꿈
		    System.out.println();
		}
		
		System.out.println("===============");
		
		for (int i = 1; i <= n; i++) {
		    // n-i만큼 공백 출력
		    for (int j = 1; j <= n - i; j++) {
		        System.out.print(" ");
		    }
		    // i만큼 별 출력
		    for (int k = 1; k <= i; k++) {
		        System.out.print("*");
		    }
		    // 줄바꿈
		    System.out.println();
		}
		
		System.out.println("===============");
		
		for (int i = 1; i <= n; i++) {
		    // 공백 출력: n - i개
		    for (int j = 1; j <= n - i; j++) {
		        System.out.print(" ");
		    }
		    // 별 출력: 2 * i - 1개
		    for (int j = 1; j <= (i * 2) - 1; j++) {
		        System.out.print("*");
		    }
		    // 줄바꿈
		    System.out.println();
		}
	}

}
