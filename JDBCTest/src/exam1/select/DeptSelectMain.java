package exam1.select;

import java.util.List;

public class DeptSelectMain {

	public static void main(String[] args) {
		DeptService service = new DeptServiceImpl();

		service.setDao(new DeptDAO());
		
		List<DeptDTO> list = service.list();
		
		for(DeptDTO dto : list) {
			System.out.println(dto);
		}
	}

}
