package exam4.Update;

public interface DeptService {

	public abstract void setDao(DeptDAO dao);
	int update(DeptDTO dto) throws RecordNotFoundException;

}
