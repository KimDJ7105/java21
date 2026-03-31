package Workshop03;
import java.util.Scanner;


public class Test20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("근무 시간 : ");
		int tm = scan.nextInt();
		
		System.out.print("월급 : ");
		int sl = scan.nextInt();
		
		int bo = 0;
		
		if (tm >= 25) bo = sl;
		else if (tm >= 20) bo = (int)(sl * 0.8); 
		else if (tm >= 18) bo = (int)(sl * 0.5); 
		
		System.out.println("보너스 : " + bo);
		System.out.println("지급 급여 : " + (bo + sl));
		
	}

}
