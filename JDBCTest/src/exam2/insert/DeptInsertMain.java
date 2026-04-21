package exam2.insert;

import java.util.Scanner;

public class DeptInsertMain {

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
		
		try {
			int n = service.insert(dto);
			if(n > 0) System.out.println("추가 완료");
		} catch (DuplicatedDeptnoException e) {
			System.out.println(e.getMessage());
		}
	}

}
