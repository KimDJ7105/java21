package exam21_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		//다형성 적용 가능
		
		//set에 데이터 저장
		set1.add("이순신");
		set1.add("홍길동");
		set1.add("유관순");
		set1.add("안중근");
		
		//set에 저장된 데이터 출력 (toString)
		System.out.println(set1);
		//[홍길동, 이순신, 유관순, 안중근]
		// 삽입한 순서대로 출력되지 않는다.
		
		//for문을 사용해 출력
		for(String s : set1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//iterator를 사용해서 출력
		Iterator<String> ite = set1.iterator();
		
		while(ite.hasNext()) {
			System.out.print(ite.next() + " ");
		}
		System.out.println();
		
		//추가 메서드들
		System.out.println("크기 : " + set1.size());
		System.out.println("포함 여부 : " + set1.contains("이순신"));
		System.out.println("포함 여부 : " + set1.contains("나나나"));
		System.out.println("원소 삭제 : " + set1.remove("홍길동"));
		System.out.println(set1);
		
		//Object 배열로 변환
		Object[] obj = set1.toArray();
		System.out.println(Arrays.toString(obj));
		
		set1.add("이순신");
		System.out.println(set1);
		//데이터 중복 저장 불가
		
		set1.clear();
		System.out.println(set1);
	}

}
