package exam5.finalProject;

import java.util.List;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		DeptService service = new DeptServiceImpl();
		service.setDao(new DeptDAO());
		
		Scanner sc = new Scanner(System.in);
		
		int select_num = -1;
		
		while(select_num != 0) {
			System.out.println("작업을 입력해주세요");
			System.out.println("1. Select *");
			System.out.println("2. Insert");
			System.out.println("3. Delete");
			System.out.println("4. Update");
			System.out.println("0. Exit");
			System.out.print("입력 => ");
			select_num = sc.nextInt();
			
			switch(select_num) {
			case 1 : {
				List<DeptDTO> list = service.list();
				
				for(DeptDTO dto : list) {
					System.out.println(dto);
				}
				break;
			}
			case 2 : {
				int deptno = 0;
				String dname = null;
				String loc = null;
				System.out.println("====Insert====");
				System.out.print("deptno 입력 : " );
				deptno = sc.nextInt();
				System.out.print("dname 입력 : " );
				dname = sc.next();
				System.out.print("loc 입력 : " );
				loc = sc.next();
				
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				
				try {
					int n = service.insert(dto);
					if(n > 0) System.out.println("추가 완료");
				} catch (DuplicatedDeptnoException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			}
			case 3 : {
				System.out.println("====Delete====");
				int deptno = 0;
				System.out.print("deptno 입력 : " );
				deptno = sc.nextInt();
				
				int n = 0;
				try {
					n = service.delete(deptno);
				} catch (RecordNotFoundException e) {
					System.out.println(e.getMessage());
				}
				if(n > 0) System.out.println("삭제 완료");
				
				break;
			}
			case 4 : {
				int deptno = 0;
				String dname = null;
				String loc = null;
				System.out.print("deptno 입력 : " );
				deptno = sc.nextInt();
				System.out.print("dname 입력 : " );
				dname = sc.next();
				System.out.print("loc 입력 : " );
				loc = sc.next();
				
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				
				System.out.println("====Update====");
				int n = 0;
				try {
					n = service.update(dto);
				} catch (RecordNotFoundException e) {
					System.out.println(e.getMessage());
				}
				if(n > 0) System.out.println("수정 완료");
				break;
			}
			default : System.out.println("!종료!");
			}
		}
		
	}

}
