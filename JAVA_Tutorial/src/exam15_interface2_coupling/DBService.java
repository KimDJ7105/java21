package exam15_interface2_coupling;

public class DBService {
	DataBaseInterface dao;
	
	public void setDAO(DataBaseInterface dao) {
		this.dao = dao;
	}
	
	public void connect() {
		dao.connect();
	}
}
