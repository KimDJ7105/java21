package exam23_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest02_forEach {

	public static void main(String[] args) {
		//컬렉션 stream 생성
		
		List<String> list = new ArrayList<String>();
		
		list.add("김김김");
		list.add("이이이");
		list.add("박박박");
		list.add("최최최");
		
		//Stream 생성
		Stream<String> stream = list.stream();
		
		Consumer<String> c = System.out::println;
		
		//forEach로 반복
		stream.forEach(c);		
		//인자로 넘겨받은 Consumer 메서드를
		//stream을 통과하는 모든 원소에 적용한다.
		
		Set<String> set = new HashSet<String>();
		
		set.add("김김김");
		set.add("이이이");
		set.add("박박박");
		set.add("최최최");
		
		Stream<String> stream2 = set.stream();
		
		stream2.forEach(System.out::println);
		//이렇게도 가능.
	}

}
