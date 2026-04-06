package exam12_Inheritance;

public class Employee {
	String name;
	int salary;
	private static int count = 0;
	//private name;
	//private은 자식 class에서 접근 불가.
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee() {
		count++;
		System.out.println("Employee 생성자");
	}
	
	public Employee(String name, int salary) {
		count++;
		System.out.println("Employee 생성자2");
		this.name = name;
		this.salary = salary;
	}
	
	protected String getInfo() {
		return name + "\t" + salary;
	}
	
	static int getCount() {
		return count;
	}
}
