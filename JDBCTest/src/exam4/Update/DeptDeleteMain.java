package exam4.Update;

import java.sql.SQLException;
import java.util.Scanner;


public class DeptDeleteMain {

	public static void main(String[] args) {
		int deptno = 0;
		String dname = null;
		String loc = null;
		
		Scanner sc = new Scanner(System.in);
		deptno = sc.nextInt();
		dname = sc.next();
		loc = sc.next();
		
		DeptDTO dto = new DeptDTO(deptno, dname, loc);
		
		DeptService service = new DeptServiceImpl();
		
		service.setDao(new DeptDAO());
		
		
		int n = 0;
		try {
			n = service.update(dto);
		} catch (RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		if(n > 0) System.out.println("수정 완료");
		
	}

}
