package Workshop04;

import java.util.Arrays;

public class ArrayTest08 {

	public static void main(String[] args) {
		int [] score= {99,34,67,22,11,9}; 
		
		Arrays.sort(score);
		
		System.out.println("최대값 : " + score[score.length - 1]);
		System.out.println("최소값 : " + score[0]);
	}

}
