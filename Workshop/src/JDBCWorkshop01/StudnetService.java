package JDBCWorkshop01;

import java.util.List;

public interface StudnetService {
	public abstract void setDao(StudentDAO dao);
	public abstract List<StudentDTO> list();
}
