package Workshop03;
import java.util.Scanner;


public class Test05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int sum = 0;
		int ave = 0;
		
		for(int i = 1 ; i < num + 1 ; ++i) {
			if(i % 2 == 0) sum += i;
			ave += i;
		}
		
		float avef = ave / (float)num;
		
		System.out.println("총합 : " + sum);
		System.out.println("평균값 : " + avef);
	}

}
