package exam18_Utility;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String s = "고양이 강아지 까마귀 참새 호랑이";
		//공백 기준으로 분리
		StringTokenizer st = new StringTokenizer(s);
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		String s2 = "고양/강아지/까마귀/참새/호랑이";
		StringTokenizer st2 = new StringTokenizer(s2, "/");
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		String s3 = "고양;강아지,까마귀/참새.호랑이";
		StringTokenizer st3 = new StringTokenizer(s2, "/,:.");
		
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
	}

}
