package JDBCWorkshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

//로직처리 + 트랜잭션처리
// Connection이 필요하다. 
public class StudentServiceImpl implements StudnetService {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/workshop";
	String userid = "root";
	String passwd = "dhkdTlqfl0509^";
	
	StudentDAO dao;
	//dao 초기화 main 에서 호출 
	@Override
	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}
	
	//기본 생성자에서 드라이브 로딩
	public StudentServiceImpl() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public List<StudentDTO> list() {
		List<StudentDTO> list = null;
		
		Connection con = null;
		// DB와 연결
		try {
			con = DriverManager.getConnection(url, userid,passwd);
			list = dao.list(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
		
	} // list()

	@Override
	public List<StudentDTO> list(String target) {
		List<StudentDTO> list = null;
		
		Connection con = null;
		// DB와 연결
		try {
			con = DriverManager.getConnection(url, userid,passwd);
			list = dao.list(con, target);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
		
	} // list(String)
	
	@Override
	public List<StudentDTO> list(String begin, String end) {
		List<StudentDTO> list = null;
		
		Connection con = null;
		// DB와 연결
		try {
			con = DriverManager.getConnection(url, userid,passwd);
			list = dao.list(con, begin, end);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
		
	} // list(String, String)
}
