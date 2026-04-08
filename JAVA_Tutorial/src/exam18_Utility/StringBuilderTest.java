package exam18_Utility;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("helLO");
		//StringBuilder 인스턴스 생성
		
		System.out.println("값 출력 : " + sb);
		
		System.out.println("문자열 추가 : " + sb.append("World"));
		System.out.println("문자열 추가 : " + sb.append(1234));
		System.out.println("문자열 추가 : " + sb.append(true));
		//append로 문자열에 값을 추가할 수 있다.
		
		System.out.println("값 삽입 : " + sb.insert(0, "Good"));
		// 원하는 위치에 값 삽입
		
		System.out.println("범위 삭제 : " + sb.deleteCharAt(0));
		System.out.println("범위 삭제 : " + sb.delete(0, 3));
		// 원하는 부분 삭제
		
		System.out.println("거꾸로 : " + sb.reverse());
		// 거꾸로
		
		System.out.println("거꾸로 : " + sb.length());
		//길이
		
		System.out.println("특정 문자 얻기 : " + sb.charAt(0));
		//특정 위치 문자 리턴
		
		System.out.println("부분열 : " + sb.substring(2));
		//부분열 얻기
		
		String s = sb.toString();
		System.out.println("최종 사용 : " + s);
		//StringBuilder를 String 형태로 리턴
	}

}
