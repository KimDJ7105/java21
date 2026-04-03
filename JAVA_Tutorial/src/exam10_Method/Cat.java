package exam10_Method;

public class Cat {
	private String name;
	private int age;
	private String gender;
	
	final int MAX_AGE = 40;
	
	//name을 관리하는 getter 와 setter
	public void setName(String new_name) {
		name = new_name;
	}
	
	public String getName() {
		return name;
	}
	//age를 관리
	public void setAge(int age) {
		if(ageValidCheck(age)) this.age = age;
	}
	public int getAge() {
		int n = age;
		return n;
	}
	//gender를 관리
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	
	
	public Cat() {}
	
	public Cat(String name, int age, String gender) {
		if(ageValidCheck(age)) this.age = age;
			
		this.name = name;
		this.gender = gender;
	}
	
	//중복되는 검증 코드를 메서드로 만들어서 관리
	//class 내부에서만 사용됨으로 private으로 관리
	private boolean ageValidCheck(int age) {
		if (age > MAX_AGE || age < 0) {
			System.out.println("잘못된 수치입니다.");
			
			return false;
		}
		
		return true;
	}
}
