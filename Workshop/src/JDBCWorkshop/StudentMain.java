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
			
		} // while
		
		sc.close();
	}

}
