package Workshop03;
import java.util.Scanner;


public class Test21 {

	public static void main(String[] args) {
		for(int i = 1 ; i < 101 ; ++i) {
			if(i < 10) System.out.print(" ");
			System.out.print(i + " ");
			if(i % 10 == 0) System.out.println();
		}
		
	}

}
