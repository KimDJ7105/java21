package Workshop7_app3;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		
		String s = "4,2,3,6,7";
		StringTokenizer st = new StringTokenizer(s, ",");
		
		int sum = 0;
		while(st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken()); 
		}
		
		System.out.println(sum);
	}

}
