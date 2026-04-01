package exam07_Array;

public class ArrayTest01_arrayProbs {

	public static void main(String[] args) {
		// 배열의 총합 구하기
		int [] arr = {1,2,3,4,5};
		
		int sum = 0;
		for(final int n : arr) {
			sum += n;
		}
		
		// 배열에서 두 글자인 객체 출력하기
		
		String [] srr = {"as", "asd", "ert", "gf", "tr", "qwer"};
		
		for (final String s : srr) {
			if(s.length() == 2) {
				System.out.println(s);
			}
		}
	}

}
