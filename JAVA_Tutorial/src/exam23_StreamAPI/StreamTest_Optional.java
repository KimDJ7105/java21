package exam23_StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class StreamTest_Optional {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		//데이터가 존재
		list.add(30);
		
		//int -> double
		OptionalDouble x = list.stream().mapToDouble(n->n).average();
	
		System.out.println(x);
		System.out.println(x.getAsDouble());
	}

}
