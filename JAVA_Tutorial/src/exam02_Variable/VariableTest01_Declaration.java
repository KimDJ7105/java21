package exam02_Variable;

public class VariableTest01_Declaration {

	public static void main(String[] args) {
		// 저장할 데이터 : 홍길동, 20, 서울, 180.3, 67.4, 결혼 여부
		
		//변수 선언
		String name; 		// 4byte
		int age; 				// 4byte
		String address; 		// 4byte
		float height; 		// 4byte
		float weight;	 	// 4byte
		boolean isMarried; 	// 1byte
		
		//변수 값 대입 
		name = "홍길동";
		age = 20;
		address = "서울";
		height = 180.3f;
		weight = 67.4f;
		isMarried = false;
		
		//변수 사용 : 포맷 사용
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("결혼 여부 : " + isMarried);
		
		System.out.printf("이름 : %s 나이 : %d 주소 : %s "
				+ "키 : %.2f 몸무게 : %.2f 결혼 여부 : %b \n", 
				name, age, address, height, weight, isMarried);

		// 변수 값 변경
		age = age + 1;
		weight += 7f;
		isMarried = true;
		
		System.out.println("나이 : " + age);
		System.out.println("몸무게 : " + weight);
		System.out.println("결혼 여부 : " + isMarried);
	}

}
