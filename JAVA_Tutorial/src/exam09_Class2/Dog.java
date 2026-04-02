package exam09_Class2;


// 고양이 프로그램을 만들기 위해 고양이 객체를 만들자
public class Dog { // 강아지 객체
	//구성 요소
	//1. 인스턴스 변수(속성)(멤버 변수)
	//private으로 직접 접근을 막았음
	private int age; 
	private String name;
	private char sex;
	
	//2. 메서드(동작)
	public void eat() {
		System.out.println(name + " 밥을 먹어요");
	}
	
	public void cry() {
		System.out.println(name + " : 멍멍");
	}
	
	//3. 멤버 변수 초기화를 위해 생성자 정의
	// 생성자를 정의하지 않으면 java가 기본 생성자를 제공한다.
	public Dog(int age, String name , char sex) {
		if(age >= 30 || (sex != '남' && sex != '여')) {
			System.out.println("잘못된 데이터 입니다");
			return;
		} // 생성자를 통해 잘못된 데이터가 삽입되는것을 막을 수 있다.
		
		// name = name; 두 name 모두 로컬 변수이다.
		this.name = name;
		// this를 통해 객체의 맴버 변수에 접근 가능하다.
		this.age = age;
		this.sex = sex;
	}
	
	// 생성자는 여러개를 만들 수 있다.
	// 인자를 통해서 구별된다.
	public Dog(String name, char sex) {
		// 생성자에서 다른 생성자를 호출 가능하다.
		// 이를 통해 코드 중복을 막고
		// 중요 로직을 한 메서드에서만 관리 가능하다.
		// 다른 생성자를 호출하는 코드는 무조건 첫 줄에 써야한다.
		this(-1, name, sex);
	}
	
	public Dog() {
		// age = 0;
		// name = null;
		// sex = '\u0000';
		this(-1, null, '\u0000');
	}
	
	
	
	public void get_info() {
		System.out.println("이름 : " + name + " 나이 : " + age + " 성별 : " + sex);
	}
}
