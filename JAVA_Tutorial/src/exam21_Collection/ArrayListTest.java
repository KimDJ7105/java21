package exam21_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// List 계열 : 순서가 있고 중복 가능
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		
		//원하는 위치 데이터 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		//첫번째 값과 마지막 값
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		//리스트 전체 출력 (toString)
		System.out.println(list);
		
		for(int n : list) {
			System.out.print(n + " ");
		} System.out.println();
		//순서가 있기에 순서에 맞춰서 출력된다.
		
		Iterator<Integer> ite = list.iterator();
		
		while(ite.hasNext()) {
			System.out.print(ite.next() + " ");
		} System.out.println();
		
		//다양한 메서드들
		
		// 중간 삽입
		list.add(2,250);
		System.out.println(list);
		
		// 특정 위치 원소 수정
		list.set(3, 350);
		System.out.println(list);
		
		// 삭제
		list.remove(0);
		// 값으로 삭제 (리터럴을 넣으면 index로 인식)
		list.remove(new Integer(250));
		System.out.println(list);
		
		//리스트 크기
		System.out.println(list.size());
	
		//포함 여부
		System.out.println(list.contains(200));
		System.out.println(list.contains(2000));
		// 비어있는지 확인
		System.out.println(list.isEmpty());
		
		List<String> list2 = new ArrayList<String>();
		// 다형성 가능.
		list2.add("A");
		list2.add("B");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("D");
		list2.add("E");
		//중복 허용
		System.out.println(list2);
		
		//부분리스트
		List<String> list3 = list2.subList(1, 4);
		System.out.println(list3);
		
		//리스트를 생성하는 다른 방법 (배열 이용)
		List<Integer> list4 = Arrays.asList(1,2,3,4,5);
		System.out.println(list4);
		
		//list4.add(6);
		//오류 발생! array를 list로 변환한거라 크기 제한이 존재
	}

}
