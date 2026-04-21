package exam3.delete;

public interface DeptService {

	public abstract void setDao(DeptDAO dao);
	int delete(int deptno) throws RecordNotFoundException;

}
