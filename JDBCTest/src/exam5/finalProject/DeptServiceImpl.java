package exam5.finalProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;


//로직처리 + 트랜잭션처리
// Connection이 필요하다. 
public class DeptServiceImpl implements DeptService {
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
	public List<DeptDTO> list() {
		List<DeptDTO> list = null;
		
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
	public int insert(DeptDTO dto) throws DuplicatedDeptnoException {
		
		Connection con= null;
		int n = 0;
		try {
			con = DriverManager.getConnection(url, userid,passwd);
			n = dao.insert(con, dto);
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
	} // insert
	
	@Override
	public int delete(int deptno) throws RecordNotFoundException {
		
		Connection con= null;
		int n = 0;
		try {
			con = DriverManager.getConnection(url, userid,passwd);
			n = dao.delete(con, deptno);
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
	} // delete
	
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
	} // update
}
