package exam02_Variable;

public class VariableTest03_InstanceValue {
	
	int size; // 인스턴스 변수
	
	public static void main(String[] args) {
		int num = 10; // 로컬 변수
		
		System.out.println(num);
		// System.out.println(size); // 바로 사용 불가능
		VariableTest03_InstanceValue VI = 
				new VariableTest03_InstanceValue();
		
		System.out.println(VI.size); // 인스턴스 생성 후 사용 가능
									 // 자동 초기화
	}

}
