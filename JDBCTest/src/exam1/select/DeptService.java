package exam1.select;

import java.util.List;

public interface DeptService {
	public abstract void setDao(DeptDAO dao);
	public abstract List<DeptDTO> list();
}
