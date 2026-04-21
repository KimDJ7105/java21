package exam3.delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptDAO {
	public int delete (Connection con, int deptno ) throws RecordNotFoundException {
		PreparedStatement pstmt = null;
		int n = 0;
		
		try {
			String sql = "Delete from dept where deptno=?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1,deptno);
			
			n = pstmt.executeUpdate();
			if(n == 0) throw new RecordNotFoundException(deptno + "가 존재하지 않습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstmt != null) pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		} //try catch
		
		return n;
		
	}// delete
}// class
