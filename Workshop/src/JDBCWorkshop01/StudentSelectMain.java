package JDBCWorkshop01;

import java.util.List;
import java.util.Scanner;

public class StudentSelectMain {

	public static void main(String[] args) {
		StudnetService service = new StudentServiceImpl();

		service.setDao(new StudentDAO());
		
		int select_num = -1;
		Scanner sc = new Scanner(System.in);
		
		while(select_num != 0) {
			System.out.println("     [학생 정보 관리 메뉴]     ");
			System.out.println("******************************");
			System.out.println("1. 전체 학생 목록");
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
		}
		
		sc.close();
	}

}
