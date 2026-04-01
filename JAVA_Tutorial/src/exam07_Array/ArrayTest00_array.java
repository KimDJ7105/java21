package exam07_Array;

public class ArrayTest00_array {

	public static void main(String[] args) {
		int [] arr; // 배열 변수 선언
		arr = new int [10]; //배열 생성
		
		for(int i = 0 ; i < 10 ; ++i) {
			System.out.println(arr[i]); // 초기화가 되어있음
			arr[i] = i; // index를 통해 접근 가능 
		}
		
		// 배열 생성 방법 2
		String [] str_arr = {"홍길동", "이순신", "유관순"};
		
		// length 를 사용해서 배열 크기 확인 가능
		for(int i = 0 ; i < str_arr.length ; ++i) {
			System.out.println(str_arr[i]);
		}
		
		// 배열 생성 방법 3
		int [] num;
		num = new int [] {10,20,30};
		
		for(final int n : num) {
			System.out.println(n);
		}
	}

}
