package exam15_interface2_coupling;

public class MySQLDAO implements DataBaseInterface {
	@Override
	public void connect() {
		System.out.println("MySQLDAO.connectMySQL");
	}
}
