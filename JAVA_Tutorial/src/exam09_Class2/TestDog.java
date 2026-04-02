package exam09_Class2;

public class TestDog {

	public static void main(String[] args) {
		//생성자를 통해 초기화
		Dog dogo = new Dog(8, "바둑이", '남');
		
		//private 이므로 직접 접근 불가
		//dogo.age = 8;
		//dogo.name = "바둑이";
		//dogo.sex = '남';
		
		//멤버 메서드 호출
		dogo.cry();
		dogo.eat();
		dogo.get_info();
		
		// 다른 생성자를 호출해서 객체 생성
		Dog dogy = new Dog("초코", '여');
		
		dogy.cry();
		dogy.eat();
		dogy.get_info();
	}

}
