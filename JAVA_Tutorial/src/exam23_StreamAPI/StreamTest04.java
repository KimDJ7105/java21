package exam23_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class StreamTest04 {

	public static void main(String[] args) {
		// 중간처리 - 정렬
		List<Integer> l = Arrays.asList(100,45,56,87,65,95,15,3,248,54,2,61);
		
		//오름차순
		l.stream().sorted()
		.forEach(System.out::println);
		
		//내림차순
		l.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
		
		List<Student> list2 = Arrays.asList(new Student("홍길동", 100),
				new Student("이순신", 90),
				new Student("유관순", 50),
				new Student("강감찬", 70),
				new Student("정조", 95),
				new Student("선덕여왕", 45)); 
		//class 정렬하기
		Function<Student, Integer> f = (o)-> o.getGrade();
		
		//오름차순
		list2.stream()
		.sorted(Comparator.comparing(f))
		.forEach(System.out::println);
		
		//내림차순
		list2.stream()
		.sorted(Comparator.comparing(f, Comparator.reverseOrder()))
		.forEach(System.out::println);
		
		//중간처리 - skip
		list2.stream()
			.skip(2)
			.forEach(System.out::println);
		
		//중간처리 - limit
		list2.stream()
			.limit(4)
			.forEach(System.out::println);
	}

}
