package exam0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateTest {

	public static void main(String[] args) {
		// dept 테이블 삽입
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/testdb";
		String userid = "root";
		String passwd = "dhkdTlqfl0509^";
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con= null;
		PreparedStatement pstmt = null;
		
		try {
			
			con = DriverManager.getConnection(url, userid,passwd);
			
			// sql문 작성
			String sql = "Delete from dept where deptno=?";
			
			// ? 로 이후에 데이터를 삽입 가능
			pstmt = con.prepareStatement(sql);
			// pstmt.setXXX(?위치, 값);
			pstmt.setInt(1, 60);
			
			int n = pstmt.executeUpdate();
		
			if(n>0) System.out.println("수정성공"); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}

}
