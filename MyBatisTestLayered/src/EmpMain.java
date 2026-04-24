import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;
import com.service.EmpService;
import com.service.EmpServiceImpl;


public class EmpMain {
	public static void main(String[] args) {
		EmpService service = new EmpServiceImpl();
		
		service.setDao(new EmpDAO());
		
Scanner sc = new Scanner(System.in);
		/*
		 * Service에서 Commit을 안한다. 그리고
		 * Session을 close 해서 기본적으로 적용이 안된다. 
		 * 적용된 결과를 확인하는건 출력문으로.. 
		 */


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
				List<EmpDTO> list = service.findAll();
				for(final EmpDTO e : list) {
					System.out.println(e);
				}
				
				break;
			}
			case 2 : {
				EmpDTO empdto = new EmpDTO();
				
				System.out.println("====Insert====");
				System.out.print("empno 입력 : " );
				empdto.setEmpno(sc.nextInt());
				System.out.print("ename 입력 : " );
				empdto.setEname(sc.next());
				System.out.print("job 입력 : " );
				empdto.setJob(sc.next());
				System.out.print("mgr 입력 : " );
				empdto.setMgr(sc.nextInt());
				System.out.print("hiredate 입력 : " );
				empdto.setHiredate(sc.next());
				System.out.print("sal 입력 : " );
				empdto.setSal(sc.nextInt());
				System.out.print("comm 입력 : " );
				empdto.setComm(sc.nextInt());
				System.out.print("deptno 입력 : " );
				empdto.setDeptno(sc.nextInt());
				
				int n = service.insertComplete(empdto);
				if(n > 0) System.out.println("레코드 삽입 완료");
				
				break;
			}
			case 3 : {
				System.out.println("====Delete====");
				int empno = 0;
				System.out.print("empno 입력 : " );
				empno = sc.nextInt();
				
				int n = service.delete(empno);
				if(n > 0) System.out.println(empno + "레코드 삭제 완료");
				
				break;
			}
			case 4 : {
				EmpDTO dto = new EmpDTO();
				
				System.out.print("empno 입력 : " );
				dto.setEmpno(sc.nextInt());
				System.out.print("ename 입력 : " );
				dto.setEname(sc.next());
				System.out.print("sal 입력 : " );
				dto.setSal(sc.nextInt());
				
				int n = service.update(dto);
				if(n > 0) System.out.println("업데이트 완료");
				break;
			}
			default : System.out.println("!종료!");
			}
		}
	}
}
