package exam4.Update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeptServiceImpl implements DeptService{
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/testdb";
	String userid = "root";
	String passwd = "dhkdTlqfl0509^";
	
	DeptDAO dao;
	//dao 초기화 main 에서 호출 
	@Override
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	
	//기본 생성자에서 드라이브 로딩
	public DeptServiceImpl() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public int update(DeptDTO dto) throws RecordNotFoundException {
		
		Connection con= null;
		int n = 0;
		try {
			con = DriverManager.getConnection(url, userid,passwd);
			n = dao.update(con, dto);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return n;
	}
}
