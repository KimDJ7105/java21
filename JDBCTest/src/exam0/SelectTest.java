package exam0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

	public static void main(String[] args) {
		// dept 테이블 조회
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/testdb";
		String userid = "root";
		String passwd = "dhkdTlqfl0509^";
		
		// 드라이버 메모리 등록
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		// DB와 연결
		try {
			con = DriverManager.getConnection(url, userid,passwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// sql문 작성
		String sql = "select deptno, dname, loc from dept";
		
		// sql 전송 객체 얻기
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//sql 실행
		ResultSet rs = null;
		try {
			rs = pstmt.executeQuery();
			
			while(rs.next()) { //행 성택
				int deptno = rs.getInt("deptno");
				String dname = rs.getString(2);
				String loc = rs.getString("loc");
				
				System.out.printf("%d %s %s\n", deptno, dname, loc);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
