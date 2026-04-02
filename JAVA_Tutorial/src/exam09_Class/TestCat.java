package exam09_Class;

public class TestCat {

	public static void main(String[] args) {
		//cat 은 main 메서드가 없으므로 핸들링 클래스가 필요
		//Cat 객체 생성
		Cat jerico = new Cat();
		
		//멤버 변수 접근
		jerico.age = 6;
		jerico.name = "제리코";
		jerico.sex = '남';
		
		//멤버 메서드 호출
		jerico.cry();
		jerico.eat();
		
		Cat jelly = new Cat();
		
		//멤버 변수 접근
		jelly.age = 3;
		jelly.name = "젤리";
		jelly.sex = '여';
		
		//멤버 메서드 호출
		jelly.cry();
		jelly.eat();
		
		// 같은 class 끼리 같은지 확인 가능
		System.out.println(jelly == jerico);
		// 비교 연산의 경우, 어떻게 비교할지 정해줘야 가능
		//System.out.println(jelly > jerico);
	}

}
