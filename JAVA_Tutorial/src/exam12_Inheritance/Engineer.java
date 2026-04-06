package exam12_Inheritance;

public class Engineer extends Employee {
	String skill;
	public Engineer() {}
	
	public Engineer(String name, int salary, String skill) {
		super(name, salary); // 명시적으로 부모 생성자 호출
		// 명시하지 않아도 자동 호출, 항상 자식 생성자의 첫 라인에 호출
		// 명시적 호출을 통해 기본 생성자가 아닌 생성자도 호출 가능
		System.out.println("Engineer 생성자");
		
		this.skill = skill;
		// 부모 생성자에서 name과 salary를 초기화.
	}
	
	@Override //어노테이션
	public String getInfo() { //오버라이딩 함수.
		//부모 메서드와 메서드명, 반환 타입, 인자가 동일하다.
		return name + "\t" + salary + "\t" + skill;
	}
	
	//@Override // static은 재정의 불가능
	//public static int getCount() {
	//	return 1;
	//}
	
	@Override
	public String toString() { //Object Class의 toString 오버라이드
		return name + "\t" + salary + "\t" + skill;
	}
}
