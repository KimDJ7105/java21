package exam5.finalProject;

import java.util.List;

public interface DeptService {
	public abstract void setDao(DeptDAO dao);
	public abstract List<DeptDTO> list();
	public abstract int insert(DeptDTO dto) throws DuplicatedDeptnoException;
	int delete(int deptno) throws RecordNotFoundException;
	int update(DeptDTO dto) throws RecordNotFoundException;
}
