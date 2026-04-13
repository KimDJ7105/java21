package exam23_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamTest05 {

	public static void main(String[] args) {
		
		//최종처리
		List<Integer> l = Arrays.asList(100,45,56,87,65,95,15,3,248,54,2,61);

		//1. 갯수
		long count = l.stream() // 리턴 타입은 Stream<Integer>
					.count();
		
		//짝수의 갯수
		long count2 = l.stream().filter(n->n%2==0).count();
	
		System.out.println(count);
		System.out.println(count2);
		
		//최대값
		//리턴은 IntStream
		int max = Arrays.stream(new int [] {100,45,56,87,65,95,15,3,248,54,2,61})
				.max() //IntStream의 멤버 메서드
				.getAsInt();
		//최소값
		int min = Arrays.stream(new int [] {100,45,56,87,65,95,15,3,248,54,2,61})
				.min() //IntStream의 멤버 메서드
				.getAsInt();	
		// 총합
		int sum = Arrays.stream(new int [] {100,45,56,87,65,95,15,3,248,54,2,61})
				.sum(); //IntStream의 멤버 메서드
		// 평균
		double avg = Arrays.stream(new int [] {100,45,56,87,65,95,15,3,248,54,2,61})
				.average()
				.getAsDouble(); //IntStream의 멤버 메서드
	
		
	}

}
