package Workshop7_app4;

public class Test8 {

	public static void main(String[] args) {
		 String mesg = "100/200"; 
		 
		 String [] nums = mesg.split("/");
		 
		 int sum = 0;
		 for(String s : nums) {
			 sum += Integer.parseInt(s);
		 }
		 
		 System.out.println(sum);
		 System.out.println(sum / (double)nums.length);
	}

}
