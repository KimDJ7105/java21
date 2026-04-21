package exam3.delete;

import java.sql.SQLException;
import java.util.Scanner;

public class DeptDeleteMain {

	public static void main(String[] args) {
		int deptno = 0;
		
		Scanner sc = new Scanner(System.in);
		deptno = sc.nextInt();
		
		DeptService service = new DeptServiceImpl();
		
		service.setDao(new DeptDAO());
		
		
		int n = 0;
		try {
			n = service.delete(deptno);
		} catch (RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		if(n > 0) System.out.println("삭제 완료");
		
	}

}
