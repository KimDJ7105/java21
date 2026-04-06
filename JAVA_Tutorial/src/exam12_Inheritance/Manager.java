package exam12_Inheritance;

public class Manager extends Employee {
	
	String depart;
	public Manager() {}
	public Manager(String name, int salary, String depart) {
		System.out.println("Manager 생성자");
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + "\t" + depart;
	}
	
	@Override
	public String toString() { //Object Class의 toString 오버라이드
		return name + "\t" + salary + "\t" + depart;
	}
	
}
