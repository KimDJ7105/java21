package Workshop06_pack03;

public class CarTest {

	public static void main(String[] args) {
		Car [] c = new Car[] {new L3("L3","1500",50,25,0), 
				new L5("L5", "2000",70,35,0)};
		
		for(Car car : c) {
			System.out.println(car);
			car.setOil(25);
		}
		
		for(Car car : c) {
			System.out.println(car);
			car.go(80);
		}
		
		for(Car car : c) {
			System.out.println(car);
		}
	}

}
