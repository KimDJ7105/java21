package JDBCWorkshop;

import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		StudnetService service = new StudentServiceImpl();

		service.setDao(new StudentDAO());
		
		int select_num = -1;
		Scanner sc = new Scanner(System.in);
		
		while(select_num != 0) {
			System.out.println("     [학생 정보 관리 메뉴]     ");
			System.out.println("******************************");
			System.out.println("1. 전체 학생 목록");
			System.out.println("2. 학생 이름 검색.");
			System.out.println("3. 학생 입학년도 범위 검색.");	
			System.out.println("4. 학생 학번으로 다중 검색 (쉼표 구분)");	
			System.out.println("5. 학생 휴학 일괄 수정");				
			System.out.println("6. 학과 정원 일괄 수정");				
			System.out.println("7. 학생 학점 검색");				
			System.out.println("0. 종료");
			System.out.println("******************************");
			System.out.print("메뉴 입력 =>");
			select_num = sc.nextInt();
			
			
			if(select_num == 1) {
				List<StudentDTO> list = service.list();
			
				int sum = 0;
				for(StudentDTO dto : list) {
					System.out.println(dto);
					sum++;
				}	
				
				System.out.println("총 학생 수 : " + sum);
			}
			
			else if(select_num == 2) {
				System.out.print("검색할 학생 명=> ");
				String target = sc.next();
				
				List<StudentDTO> list = service.list(target);
				
				int sum = 0;
				for(StudentDTO dto : list) {
					System.out.println(dto);
					sum++;
				}	
				
				System.out.println("검색된 총 학생 수 : " + sum);
			}
			else if (select_num == 3) {
				System.out.print("시작 년도 입력 =>");
				String begin = sc.next();
				System.out.print("끝 년도 입력 =>");
				String end = sc.next();
				
				List<StudentDTO> list = service.list(begin, end);
				
				int sum = 0;
				for(StudentDTO dto : list) {
					System.out.println(dto);
					sum++;
				}	
				
				System.out.println("검색된 총 학생 수 : " + sum);
				
			}
			else if (select_num == 4) {
				System.out.print("검색할 학생의 학번을 입력하시오=>");
				String input = sc.next();
				
				String [] num_array = input.split(",");
				
				List<StudentDTO> list = service.list(num_array);
				
				int sum = 0;
				for(StudentDTO dto : list) {
					System.out.println(dto);
					sum++;
				}	
				
				System.out.println("검색된 총 학생 수 : " + sum);
			}
			else if (select_num == 5) {
				System.out.print("수정할 학생의 학번을 입력하시오=>");
				String input = sc.next();
				
				String [] num_array = input.split(",");
				
				try {
					int n = service.update(num_array);
					if(n> 0) System.out.println("총 변경된 학생 수 : " + n + " 명");
				} catch (RecordNotFoundException e) {
					e.getMessage();
				}
			}
			else if(select_num == 6) {
				
				int n = service.updateDept();
				if(n> 0) System.out.println("변경된 학과 수 : " + n );
				
			}
			else if(select_num == 7) {
				System.out.print("검색할 학생의 학번을 입력하시오=>");
				String input = sc.next();
				
				
				List<GradeDTO> list = service.listGrade(input);
					
				for(GradeDTO dto : list) {
					System.out.println(dto);
				}	
				
			}
			
		} // while
		
		sc.close();
	}

}
