package exam18_Utility;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		String s = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		// new를 통해 String 인스턴스를 생성하면 
		// 항상 새로운 인스턴스를 생성한다.
		// 리터럴을 통해 인스턴스를 생성하면
		// 같은 문자열은 같은 인스턴스를 참조한다.
		
		//주소값 비교
		System.out.println(s == s2); // true
		System.out.println(s == s3); // false
		
		String s4 = "helLO";
		
		System.out.println("문자열 길이 : " + s4.length());
		// length()로 문자열 길이 리턴
		
		System.out.println("특정 위치 문자 :" + s4.charAt(1));
		//charAt으로 특정 위치 문자 리턴
		
		System.out.println("문자열의 부분열 : " + s4.substring(2)); // 2부터 끝까지
		System.out.println("문자열의 부분열 : " + s4.substring(2,4)); // 2부터 3까지
		//substring으로 부분열 리턴
		
		System.out.println("소문자로 변경 : " + s4.toLowerCase());  
		System.out.println("대문자로 변경 : " + s4.toUpperCase());
		//toLowerCase / toUpperCase로 소문자 / 대문자 전환
		
		String s5 = "     World     ";
		
		System.out.println("양쪽 공백 제거 : " + s5.strip());
		System.out.println("양쪽 공백 제거 후 길이 : " + s5.strip().length());
		System.out.println("앞쪽 공백 제거 : " + s5.stripLeading());
		System.out.println("뒷쪽 공백 제거 : " + s5.stripTrailing());
		//strip으로 공백 제거
		
		System.out.println("문자열 연결(연산자) : " + (s4 + "World"));
		System.out.println("문자열 연결(메서드) : " + s4.concat("World"));
		//concat으로 문자열 연결
		
		System.out.println("문자열 포함 여부 : " + s4.contains("World"));
		System.out.println("문자열 포함 여부 : " + s4.contains("hel"));
		// contains 문자열 내부에 인자가 포함되어있는지 리턴
		
		System.out.println("문자 치환 : " + s4.replace('h', 'O'));
		System.out.println("문자 치환 : " + s4.replace("hel", "wor"));
		// replace 로 문자를 다른 문자로 치환
		
		System.out.println("문자의 위치 : " + s4.indexOf('e'));
		System.out.println("문자의 위치(불일치) : " + s4.indexOf('x'));
		// 인자의 위치 리턴
		
		System.out.println("문자열 비교 : " + s.equals(s3));
		System.out.println("문자열 비교(대소문자 무시) : " + s.equalsIgnoreCase(s3));
		// 문자열 비교해 같은지 리턴
		
		String s6 = "김김김/이이이/박박박/최최최";
		String [] names = s6.split("/");
		
		System.out.println("문자열 파싱 : " + Arrays.toString(names));
		// 문자열을 특정 구분자 기준으로 파싱
		
		System.out.println("비문자열을 문자열로 : " + (String.valueOf(10) + 10));
		System.out.println("비문자열을 문자열로 : " + (String.valueOf(3.14f) + 0.25));
		System.out.println("비문자열을 문자열로 : " + (String.valueOf(new char [] {'A', 'B'})));
		// 비문자열을 문자열로
	}

}
