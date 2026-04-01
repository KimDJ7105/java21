package Workshop04;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest09 {

	public static void main(String[] args) {
		int[] arr3 = new int[5];
		Random r = new Random();
		
		int sum = 0;
		for(int i = 0 ; i < arr3.length ; ++i) {
			arr3[i] = r.nextInt(10) + 1;
			sum += arr3[i];
		}
		
		System.out.println(Arrays.toString(arr3));
		System.out.println("sum = " + sum);
		System.out.println("avg = " + sum/(float)arr3.length);
		
	}

}
