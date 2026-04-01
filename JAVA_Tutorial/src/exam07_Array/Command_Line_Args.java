package exam07_Array;

public class Command_Line_Args {

	public static void main(String[] args) {
		
		System.out.println("입력 받은 String : ");
		
		for (String s : args) {
			System.out.println(s);
		}
		
		System.out.println("end");
	}

}
