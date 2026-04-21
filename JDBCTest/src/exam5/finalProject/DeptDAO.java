package exam5.finalProject;

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
	
}//end class
