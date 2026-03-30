package exam02_Variable;

public class VariableTest04_VariableFeature {
	
	int num; //heap
	
	public static void main(String[] args) {
		// 같은 블럭 내에서 변수명 중복 불가
		int num = 10; //stack
		//int num = 20;
		//lomg num = 20;
		
		// 로컬 변수는 사용 전 초기화 필수
		int size;
		//System.out.println(size);
		
		// 블럭 scope
		// 블럭 내에서 선언된 변수는 블럭 외부에서 접근 불가
		{
			int temp = 10;
			System.out.println(temp);
		}
		//System.out.println(temp); scope 밖
	}

}
