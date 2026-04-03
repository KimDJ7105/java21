package exam10_Method;

public class TestCat {

	public static void main(String[] args) {
		Cat c = new Cat("야옹이" , 2 ,"암컷");
		
		c.setName("망치");
		c.setAge(100);
		c.setGender("수컷");
		
		String name = c.getName();
		System.out.println(name);
		System.out.println(c.getAge());
		System.out.println(c.getGender());
	}

}
