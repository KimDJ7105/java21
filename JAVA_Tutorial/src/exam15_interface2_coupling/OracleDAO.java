package exam15_interface2_coupling;

public class OracleDAO implements DataBaseInterface {
	@Override
	public void connect() {
		System.out.println("OracleDAO.connectOracleDAO");
	}
}
