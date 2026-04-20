package exam0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionTest {

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
			//auto commit 비활성화
			con.setAutoCommit(false);
			
			// insert
			// sql문 작성
			String sql = "insert into dept (deptno, dname, loc) values (?, ?, ?)";
			// ? 로 이후에 데이터를 삽입 가능
			pstmt = con.prepareStatement(sql);
			// pstmt.setXXX(?위치, 값);
			pstmt.setInt(1,60);
			pstmt.setString(2,"Design");
			pstmt.setString(3,"Jeju");
			
			int n = pstmt.executeUpdate();
		
			if(n>0) System.out.println("저장성공"); 
			
			// update
			String sql2 = "update dept set dname=?, loc=? where deptno=?";
			pstmt = con.prepareStatement(sql2);
			
			pstmt.setString(1, "Humint");
			pstmt.setString(2,"Jejudo");
			pstmt.setInt(3, 60);
			
			n = pstmt.executeUpdate();
			if(n>0) System.out.println("수정 성공");
			
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
