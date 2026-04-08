package exam15_interface2_coupling;

public class TestMain {

	public static void main(String[] args) {
		DBService service = new DBService();
		
		service.setDAO(new MySQLDAO());
		service.connect();
		
		// 인터페이스를 통해 다형성 구현
		// 데이터 베이스 객체가 바뀌어도 사용법은 바뀔 필요 없다.
		service.setDAO(new OracleDAO());
		service.connect();
	}

}
