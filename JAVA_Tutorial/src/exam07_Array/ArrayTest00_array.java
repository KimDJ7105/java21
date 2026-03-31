package exam07_Array;

public class ArrayTest00_array {

	public static void main(String[] args) {
		int [] arr; // 배열 변수 선언
		arr = new int [10]; //배열 생성
		
		for(int i = 0 ; i < 10 ; ++i) {
			System.out.println(arr[i]); // 초기화가 되어있음
			arr[i] = i; // index를 통해 접근 가능 
		}
		
		String [] str_arr = new String [3];
		
		str_arr[0] = "홍길동";
		str_arr[1] = "임꺽정";
		str_arr[2] = "넌뭐야";
	}

}
