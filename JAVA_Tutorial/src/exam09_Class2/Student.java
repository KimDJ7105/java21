package exam09_Class2;

public class Student {
	private String name;
	private int age;
	private String address;
	
	public void get_info() { // 
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
	}
	
	public Student (String name, int age, String address) {
		if(age != -1 && age < 18) {
			System.out.println("잘못된 정보입니다.");
			return;
		}
		
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public Student(String name, String address) {
		this(name, -1, address);
	}
	
	public Student(String name, int age) {
		this(name, age, null);
	}
	
	public Student(String name) {
		this(name, -1, null);
	}
}
