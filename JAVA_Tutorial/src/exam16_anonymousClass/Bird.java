package exam16_anonymousClass;

public class Bird implements Flyer {
	//이름 있는 class
	
	@Override
	public void fly() {
		System.out.println("Bird Fly");

	}

	@Override
	public void land() {
		System.out.println("Bird Land");
		
	}

}
