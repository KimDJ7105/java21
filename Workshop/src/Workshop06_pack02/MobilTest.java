package Workshop06_pack02;

public class MobilTest {

	public static void main(String[] args) {
		Ltab l = new Ltab("Ltab", 500, "AP-01");
		Otab o = new Otab("Otab", 1000, "AND-20");
		
		System.out.println(l.getMobileName() + "\t" + l.getBatterySize());
		System.out.println(o.getMobileName() + "\t" + o.getBatterySize());
		
		l.charge(10);
		o.charge(10);
		System.out.println("10분 충전 후");
		System.out.println(l.getMobileName() + "\t" + l.getBatterySize());
		System.out.println(o.getMobileName() + "\t" + o.getBatterySize());
		
		
		l.operate(5);
		o.operate(5);
		System.out.println("5분 사용 후");
		System.out.println(l.getMobileName() + "\t" + l.getBatterySize());
		System.out.println(o.getMobileName() + "\t" + o.getBatterySize());
	}

}
