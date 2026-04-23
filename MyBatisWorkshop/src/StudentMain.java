

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.StudentDTO;

public class StudentMain {

	public static void main(String[] args) {
		
		SqlSession session = MySqlSessionFactory.getSession();
		
		
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
			System.out.println("0. 종료");
			System.out.println("******************************");
			System.out.print("메뉴 입력 =>");
			select_num = sc.nextInt();
			
			
			if(select_num == 1) {
				List<StudentDTO> list = session.selectList("com.config.StudentMapper.list");
				
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
				StudentDTO dto = new StudentDTO();
				dto.setStudent_name(target);
				
				
				List<StudentDTO> list = session.selectList("com.config.StudentMapper.listByName",dto);
				
				int sum = 0;
				for(StudentDTO d : list) {
					System.out.println(d);
					sum++;
				}	
				
				System.out.println("검색된 총 학생 수 : " + sum);
			}
			else if (select_num == 3) {
				System.out.print("시작 년도 입력 =>");
				String begin = sc.next();
				System.out.print("끝 년도 입력 =>");
				String end = sc.next();
				
				HashMap<String, String> map = new HashMap<String, String>();
				map.put("x", begin);
				map.put("y", end);
				
				List<StudentDTO> list = session.selectList("com.config.StudentMapper.listByEntranceDate", map);
				
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
				
				List<String> num_array = Arrays.asList(input.split(","));
				
				
				List<StudentDTO> list = session.selectList("com.config.StudentMapper.listByNoDynamic",num_array);
				
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
				
				List<String> no_list = Arrays.asList(input.split(","));
				
			    int n = session.update("com.config.StudentMapper.updateAbsenceByNo", no_list);
			    if(n> 0) System.out.println("총 변경된 학생 수 : " + n + " 명");
				
			}
		} // while
		
		sc.close();
		session.close();
	}

}
