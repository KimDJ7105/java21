package exam06_Conditional;
import java.util.Scanner;


public class Statement02_if_else_if {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		
		char grade = 'A';
		
		if(score < 70) {
			grade = 'F';
		}
		
		else if(score < 80) {
			grade = 'C';
		}
		else if(score < 90){
			grade = 'B';
		}
		else if (score <= 100) {
			grade = 'A';
		}
		
		System.out.println("당신의 학점은 " + grade + " 입니다.");
	}

}
