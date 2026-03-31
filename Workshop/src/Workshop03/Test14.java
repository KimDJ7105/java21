package Workshop03;
import java.util.Scanner;


public class Test14 {

	public static void main(String[] args) {
		
		System.out.println("곱셈표----------");
		
		for (int i = 1 ; i < 10 ; ++i) {
			for (int j = 1 ; j < 10 ; ++j) {
				if((i*j) <= 9) {
				System.out.print(" " + i*j + " ");
				}
				else System.out.print(i*j + " ");
			}
			System.out.println();
		}
	}

}
