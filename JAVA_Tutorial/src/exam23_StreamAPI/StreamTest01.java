package exam23_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest01 {

	public static void main(String[] args) {
		//컬렉션 stream 생성
		
		List<String> list = new ArrayList<String>();
		
		list.add("김김김");
		list.add("이이이");
		list.add("박박박");
		list.add("최최최");
		
		//Stream 생성
		Stream<String> stream = list.stream();
		
		//배열의 Stream을 얻는 방법
		String [] names = {"이순신", "유관순", "홍길동"};
		Stream<String> stream2 = Arrays.stream(names);
		
	}

}
