package exam06_Conditional;

public class Statement00_singleif {

	public static void main(String[] args) {
		int num = 5;
		
		
		System.out.println("문장 1");

		if(num == 5) System.out.println("문장 2");
		
		if(num < 5) {
			System.out.println("문장 3");
			System.out.println("문장 4");
		}
		
		System.out.println("문장 end");
	}

}
