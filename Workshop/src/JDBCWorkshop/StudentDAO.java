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
	
	public List<StudentDTO> list(Connection con, String[] nums) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		
		StringBuilder markers = new StringBuilder();
		for (int i = 0; i < nums.length; i++) {
		    markers.append("?");
		    if (i < nums.length - 1) {
		        markers.append(",");
		    }
		}
		
		String sql = "select student_no, student_name, concat(left(student_ssn,8),'******'), "
				+ "if(student_address is not null, if(char_length(student_address) > 10, concat(left(student_address,10),'...'),student_address), ' ***주소 미상*** '), "
				+ "date_format(entrance_date,'%Y/%m/%d'), absence_yn "
				+ "from tb_student "
				+ "where student_no in (" + markers.toString() + ")";
		
		try {
			pstmt = con.prepareStatement(sql);
			String nos = "";
			
			for (int i = 0; i < nums.length; i++) {
			    pstmt.setString(i + 1, nums[i]);
			}
			
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
	
	public int update (Connection con, String [] nums ) throws RecordNotFoundException {
		PreparedStatement pstmt = null;
		int n = 0;
		
		StringBuilder markers = new StringBuilder();
		for (int i = 0; i < nums.length; i++) {
		    markers.append("?");
		    if (i < nums.length - 1) {
		        markers.append(",");
		    }
		}
		
		try {
			String sql = "update tb_student set absence_yn='y' "
					+ "where student_no in(" + markers.toString() + ")";
			pstmt = con.prepareStatement(sql);
			
			for (int i = 0; i < nums.length; i++) {
			    pstmt.setString(i + 1, nums[i]);
			}
			
			n = pstmt.executeUpdate();
			if(n == 0) throw new RecordNotFoundException("가 존재하지 않습니다.");
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
	
	public int updateDept (Connection con ) {
		PreparedStatement pstmt = null;
		int n = 0;
		StringBuilder markers = new StringBuilder();
		
		try {
			String sql = "UPDATE tb_department "
					+ "SET capacity = capacity + ( CASE "
					+ "WHEN capacity BETWEEN 0 AND 20 THEN 5 "
					+ "WHEN capacity BETWEEN 21 AND 25 THEN 4 "
					+ "WHEN capacity BETWEEN 26 AND 30 THEN 3 "
					+ "ELSE 0 END ) "
					+ "WHERE capacity BETWEEN 0 AND 30";
			pstmt = con.prepareStatement(sql);
			n = pstmt.executeUpdate();
			
			
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
	
	public List<GradeDTO> listGrade(Connection con, String target) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<GradeDTO> list = new ArrayList<GradeDTO>();
		
		String sql = "select term_no, student_no, student_name, class_name, point, "
				+ "case "
				+ "when point between 0 and 1.9 then 'F학점' "
				+ "when point between 2.0 and 2.9 then 'D학점' "
				+ "when point between 3.0 and 3.4 then 'C학점' "
				+ "when point between 3.5 and 3.9 then 'B학점' "
				+ "when point >= 4.0 then 'A학점' end "
				+ "from tb_student join tb_grade using(student_no) "
				+ "join tb_class using(class_no)"
				+ "where student_no = ?";
				
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, target);
			
			rs = pstmt.executeQuery();
		
			while(rs.next()) { //행 성택
				String term = rs.getString(1);
				String student_no = rs.getString(2);
				String student_name = rs.getString(3);
				String class_name = rs.getString(4);
				float point = rs.getFloat(5);
				String grade = rs.getString(6);
				
				//레코드 저장 : DTO
				GradeDTO dto = new GradeDTO(term, student_no, student_name,
						class_name,point,grade);
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
	}// listGrade(String)
	
}//end class
