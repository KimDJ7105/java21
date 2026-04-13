package exam23_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest03 {

	public static void main(String[] args) {
		//컬렉션 stream 생성
		
		List<String> list = new ArrayList<String>();
		
		list.add("홍길동");
		list.add("정조");
		list.add("홍장군");
		list.add("선덕여왕");
		list.add("이순신");
		list.add("정조");
		list.add("이순신");
		
		
		//Stream 생성
		Stream<String> stream = list.stream();
		
		//모두 출력
		stream.forEach(System.out::println);
		
		//중간 처리 - 중복 제거 distinct
		list.stream()
			.distinct()
			.forEach(System.out::println);
		
		//중간 처리 - 필터링
		Predicate<String> p = s->s.length() == 3;
		
		list.stream()
		.filter(p) // 길이가 3인 문자열만 필터링
		.forEach(System.out::println);;
		
		list.stream()
		.filter(s->s.length() == 2) // 길이가 2인 문자열만 필터링
		.forEach(System.out::println);;
		
		//중복을 제거하고 길이가 3인 문자열만 출력하는 코드
		list.stream()
			.distinct()
			.filter(s->s.length() == 3)
			.forEach(System.out::println);
		
		//중간 처리 - 가공 map(Function)
		List<Student> list2 = Arrays.asList(new Student("홍길동", 100),
				new Student("이순신", 90),
				new Student("유관순", 50),
				new Student("강감찬", 70),
				new Student("정조", 95),
				new Student("선덕여왕", 45)); 
		//이름만 출력
		list2.stream()
		.map(Student::getName)
		.forEach(System.out::println);
		
		List<String> list3 = Arrays.asList("10,20,30","40,50,60");
		
		Function<String, IntStream> f = s->{
			String[] arr = s.split(",");
			int [] arrNum = new int[3];
			for(int i = 0 ; i < arr.length ; ++i) {
				arrNum[i] = Integer.parseInt(arr[i]);
			}
			
			return Arrays.stream(arrNum);
		};
		
		list3.stream().flatMapToInt(f).forEach(System.out::println);
	}

}

class Student {
	String name;
	int grade;
	
	public Student() {}

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
	
	
	
}