package exam09_Class;


// 고양이 프로그램을 만들기 위해 고양이 객체를 만들자
public class Cat { // 고양이 객체
	//구성 요소
	//1. 인스턴스 변수(속성)(멤버 변수)
	int age; 
	String name;
	char sex;
	
	//2. 메서드(동작)
	public void eat() {
		System.out.println(name + " 밥을 먹어요");
	}
	
	public void cry() {
		System.out.println(name + " : 야옹");
	}
	
}
