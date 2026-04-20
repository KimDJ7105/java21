package exam1.select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

//직접 MySQL 연동
//dept 테이블의 레코드를 잘 포장해서 deptselectmain까지 전달
public class DeptDAO {
	//데이터 조회
	public List<DeptDTO> list(Connection con) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<DeptDTO> list = new ArrayList<DeptDTO>();
		
		String sql = "select deptno, dname, loc from dept";
		
		try {
			pstmt = con.prepareStatement(sql);
		
			rs = pstmt.executeQuery();
		
			while(rs.next()) { //행 성택
				int deptno = rs.getInt("deptno");
				String dname = rs.getString(2);
				String loc = rs.getString("loc");
				//레코드 저장 : DTO
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				list.add(dto);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}// end list()
}//end class
