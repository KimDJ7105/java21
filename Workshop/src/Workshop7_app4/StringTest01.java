package Workshop7_app4;

import java.util.StringTokenizer;

public class StringTest01 {

	public static void main(String[] args) {
		String str = "I am second to none"; 
		
		StringTokenizer st = new StringTokenizer(str);
	
		System.out.println("단어 수 : " + st.countTokens());
		
		int sum = 0;
		while(st.hasMoreTokens()) {
			sum += st.nextToken().length(); 
		}
		
		System.out.println("문자 수 : " + sum);
				
	}

}
