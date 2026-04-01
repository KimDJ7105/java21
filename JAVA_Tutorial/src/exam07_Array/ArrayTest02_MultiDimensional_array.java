package exam07_Array;

public class ArrayTest02_MultiDimensional_array {

	public static void main(String[] args) {
		// 2차원 배열 생성
		int [][] arr;
		
		//행 생성
		arr = new int [3][];
		
		//열 생성
		arr[0] = new int [3];
		arr[1] = new int [3];
		arr[2] = new int [3];
		
		for (int i = 0 ; i < arr.length ; ++i) {
			for (int j = 0 ; j < arr[i].length ; ++j) {
				System.out.println(arr[i][j]);
			}
		}
		
		// 2차원 배열 생성 방법 2
		int [][] num = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		for (int i = 0 ; i < num.length ; ++i) {
			for (int j = 0 ; j < num[i].length ; ++j) {
				System.out.println(num[i][j]);
			}
		}
		
		// 2차원 배열 생성 방법 3
		char [][] c_arr;
		c_arr = new char[][] {{'a','b','c'}, {'d', 'e'}, {'f','g','h','i'}};
		//행의 길이가 달라도 됨
		
		for (char[] ca : c_arr) {
			for(char c : ca) {
				System.out.println(c);
			}
		}
		
		//정방형 2차원 배열의 새성법
		int [][] nn;
		nn = new int [2][4];
		
		for (int i = 0 ; i < nn.length ; ++i) {
			for (int j = 0 ; j < nn[i].length ; ++j) {
				System.out.println(nn[i][j]);
			}
		}
	}

}
