package JDBCWorkshop;

import java.util.List;

public interface StudnetService {
	public abstract void setDao(StudentDAO dao);
	public abstract List<StudentDTO> list();
	public abstract List<StudentDTO> list(String target);
	public abstract List<StudentDTO> list(String begin, String end);
	public abstract List<StudentDTO> list(String[] nums);
	int update(String[] nums) throws RecordNotFoundException;
	int updateDept();
	List<GradeDTO> listGrade(String target);
}
