package exam2.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptDAO {
	public int insert (Connection con, DeptDTO dto ) 
			throws DuplicatedDeptnoException {
		PreparedStatement pstmt = null;
		int n = 0;
		
		try {
			String sql = "insert into dept (deptno, dname, loc) values (?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1,dto.getDeptno());
			pstmt.setString(2,dto.getDname());
			pstmt.setString(3,dto.getLoc());
			
			n = pstmt.executeUpdate();
		} catch (SQLException e) {
			//e.printStackTrace();
			throw new DuplicatedDeptnoException(dto.getDeptno() + "값이 중복되었습니다.");
		} finally {
				try {
					if(pstmt != null) pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		} //try catch
		
		return n;
		
	}// insert
}// class
