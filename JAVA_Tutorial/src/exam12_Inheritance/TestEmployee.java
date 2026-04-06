package exam12_Inheritance;


public class TestEmployee {
	//다형성을 사용해서 Employee를 상속받은 모든 객체를
	//이 함수로 다룰 수 있다.
	private static void promote_salary(Employee emp, int bonus) {
		emp.salary += bonus;
	}
	
	private static String pickClass(Employee e) {
		//instanceof 를 상용해서 참조 변수가 참조하는
		//인스턴스가 실제로 어떤 class 인지 확인 가능하다.
		
		if(e instanceof Engineer) {
			return "Enginner";
		}
		if(e instanceof Manager) {
			return "Manager";
		}
		
		return "Employee";
	}
	
	public static void main(String[] args) {
		Manager m = new Manager("김사원", 2000, "인사");
		Engineer eng = new Engineer("박엔진", 1800, "자바");
		
		//System.out.println(m.getInfo());
		//System.out.println(eng.getInfo());
		System.out.println(eng);
		System.out.println(m);
		// Engineer에서 Object toString 오버라이드
		
		//다형성을 통해 부모 class 인 Employee 참조변수에
		//Engineer와 Manager 인스턴스를 참조한다.
		Employee [] e = new Employee[] {new Engineer("김엔진", 3800, "c++"), 
				new Manager("이사원", 2600, "회계")};
		
		for (Employee emp : e) {
			System.out.println(emp);
			System.out.println(pickClass(emp));
			//다형성을 통해 메서드에 다양한 인스턴스를 넘겨준다.
		}
		
		System.out.println(e[0]);
		promote_salary(e[0], 100);
		//다형성을 통해 함수 인자로 Engineer 인스턴스를 전달한다.
		System.out.println(e[0]);
		
	}
}
