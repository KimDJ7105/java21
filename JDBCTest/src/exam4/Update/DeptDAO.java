package exam4.Update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptDAO {
	public int update (Connection con, DeptDTO dto ) throws RecordNotFoundException {
		PreparedStatement pstmt = null;
		int n = 0;
		
		try {
			String sql = "update dept set dname=?, loc=? where deptno=?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,dto.getDname());
			pstmt.setString(2, dto.getLoc());
			pstmt.setInt(3, 60);
			
			n = pstmt.executeUpdate();
			if(n == 0) throw new RecordNotFoundException(dto.getDeptno() + "가 존재하지 않습니다.");
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
		
	}// update
}// class
