package exam21_Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// Key Value 쌍 저장
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "김김김");
		map.put(2, "이이이");
		map.put(3, "박박박");
		
		//수정
		map.put(3, "최최최");
		
		//key를 사용한 value 접근
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		//존재하지 않는 key 를 사용하면 null이 나온다
		
		//toString 사용해서 출력
		System.out.println(map);
		
		//keySet으로 key만 추출 가능
		
		Set<Integer> s = map.keySet();
		System.out.println(s);
		
		for(int k : s) {
			System.out.print(map.get(k) + " ");
		}
		System.out.println ();
		
		Collection<String> c = map.values();
		
		for(String v : c) {
			System.out.print(v);
		}
		System.out.println();
		
		//key 존재 여부
		System.out.println(map.containsKey(2));
		//value 존재 여부
		System.out.println(map.containsValue("김김김"));
		//map 크기
		System.out.println(map.size());
		
		//삭제 (리턴은 value)
		String ddd = map.remove(2);
		System.out.println(ddd);
		
		//전체 삭제
		map.clear();
		System.out.println(map);
		
		Map<String, Integer> map2 = Map.of("A", 65, "B", 66, "C", 67);
		
		System.out.println(map2);
		
		//Map.of로 생성시 수정 불가
		//map2.put("A", 99);
	}

}
