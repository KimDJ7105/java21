package JDBCWorkshop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class StudentDAO {
	//데이터 조회
	public List<StudentDTO> list(Connection con) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		
		String sql = "select student_no, student_name, concat(left(student_ssn,8),'******'), "
				+ "if(char_length(student_address) > 10, concat(left(student_address,10),'...'),student_address), "
				+ "date_format(entrance_date,'%Y/%m/%d'), absence_yn "
				+ "from tb_student";
		
		try {
			pstmt = con.prepareStatement(sql);
		
			rs = pstmt.executeQuery();
		
			while(rs.next()) { //행 성택
				String no = rs.getString(1);
				String name = rs.getString(2);
				String ssn = rs.getString(3);
				String address = rs.getString(4);
				String date = rs.getString(5);
				String yn = rs.getString(6);
				
				//레코드 저장 : DTO
				StudentDTO dto = new StudentDTO(no, name, ssn, 
						address,date, yn);
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
	
	public List<StudentDTO> list(Connection con, String target) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		
		String sql = "select student_no, student_name, concat(left(student_ssn,8),'******'), "
				+ "if(student_address is not null, if(char_length(student_address) > 10, concat(left(student_address,10),'...'),student_address), ' ***주소 미상*** '), "
				+ "date_format(entrance_date,'%Y/%m/%d'), absence_yn "
				+ "from tb_student "
				+ "where student_name like ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,"%" + target + "%");
			
			rs = pstmt.executeQuery();
		
			while(rs.next()) { //행 성택
				String no = rs.getString(1);
				String name = rs.getString(2);
				String ssn = rs.getString(3);
				String address = rs.getString(4);
				String date = rs.getString(5);
				String yn = rs.getString(6);
				
				//레코드 저장 : DTO
				StudentDTO dto = new StudentDTO(no, name, ssn, 
						address,date, yn);
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
	}// end list(String)
	
	public List<StudentDTO> list(Connection con, String begin, String end) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		
		String sql = "select student_no, student_name, concat(left(student_ssn,8),'******'), "
				+ "if(student_address is not null, if(char_length(student_address) > 10, concat(left(student_address,10),'...'),student_address), ' ***주소 미상*** '), "
				+ "date_format(entrance_date,'%Y/%m/%d'), absence_yn "
				+ "from tb_student "
				+ "where entrance_date between ? and ? order by entrance_date desc";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, begin + "-01-01");
			pstmt.setString(2, end + "-12-31");
			
			rs = pstmt.executeQuery();
		
			while(rs.next()) { //행 성택
				String no = rs.getString(1);
				String name = rs.getString(2);
				String ssn = rs.getString(3);
				String address = rs.getString(4);
				String date = rs.getString(5);
				String yn = rs.getString(6);
				
				//레코드 저장 : DTO
				StudentDTO dto = new StudentDTO(no, name, ssn, 
						address,date, yn);
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
	}// end list(String, String)
}//end class
