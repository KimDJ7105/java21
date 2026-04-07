package Workshop06_pack01;

public class VehicleTest {

	public static void main(String[] args) {
		Truck t = new Truck(1000,100,5);
		
		System.out.println(t);
		t.addOil(50);
		System.out.println(t);
		t.moving(50);
		System.out.println(t);
		t.addWeight(100);
		System.out.println(t);
		t.moving(30);
		System.out.println(t);
		System.out.println(t.getCost(30) + "원");
	}

}
