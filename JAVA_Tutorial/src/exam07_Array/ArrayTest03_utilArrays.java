package exam07_Array;
import java.util.Arrays;


public class ArrayTest03_utilArrays {

	public static void main(String[] args) {
		int [] num = {10,20,30};
		
		// 배열을 출력
		System.out.println(Arrays.toString(num));
	
		// 배열 정렬 (오름차순)
		int [] num2 = {1,4,5,3,2,8,9,7,0};
		Arrays.sort(num2);
		
		System.out.println(Arrays.toString(num2));
		
		// 배열을 값으로 채움
		String [] name = {"A", "B", "C"};
		Arrays.fill(name, "X");
		System.out.println(Arrays.toString(name));
		
		// 배열의 범위 내 객체를 채워넣음
		String [] name2 = {"A", "B", "C", "D", "E", "F" , "G"};
		Arrays.fill(name2, 2, 5, "X");
		System.out.println(Arrays.toString(name2));
		
		// 배열에서 특정 값의 위치 찾기. 정렬 필수
		int n = Arrays.binarySearch(num2, 4);
		System.out.println(n);
		
		// 두 배열이 동일한지 검사 후 리턴
		int [] x = {8, 3 ,10, 20, 30, 1};
		int [] x2 = {8, 3 ,10, 20, 30, 1};
		
		System.out.println(Arrays.equals(x, x2));
		
		// 배열의 크기를 바꿈 (실질적으로는 새로 만들고 복사하는 것)
		int [] arr = {8,3};
		int [] new_arr = Arrays.copyOf(arr, 5);
		
		System.out.println(Arrays.toString(new_arr));
		
		// 기존 배열로 리턴값을 받아서 사용 가능
		arr = Arrays.copyOf(arr, 8);
		System.out.println(Arrays.toString(arr));
	}

}
