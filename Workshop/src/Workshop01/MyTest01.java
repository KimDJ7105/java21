package Workshop01;

public class MyTest01 {

	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;
		String address = "서울";
		
		System.out.println("1.println 사용");
		System.out.println("이름은 " + name);
		System.out.println("나이는 " + age + " 이고 주소는 " + address);
		
		System.out.println("2.print 사용");
		System.out.print("이름은 " + name + "\n" + "나이는 " + age + " 이고 주소는 " + address + "\n");
		
		
		System.out.println("3.printf 사용");
		System.out.printf("이름은 %s \n나이는 %d 이고 주소는 %s\n", name,age,address);
		
	}

}
