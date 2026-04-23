import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.EmpDTO;

public class EmpMain {

	public static void main(String[] args) {
		SqlSession session = MySqlSessionFactory.getSession();
		
		List<EmpDTO> list = Arrays.asList(new EmpDTO(9001, "이름", "SALESMAN", 0, "", 300, 0, 30),
				new EmpDTO(9002, "이름2", "SALESMAN", 0, "", 300, 0, 30),
				new EmpDTO(9003, "이름3", "SALESMAN", 0, "", 300, 0, 30),
				new EmpDTO(9004, "이름4", "SALESMAN", 0, "", 300, 0, 30),
				new EmpDTO(9005, "이름5", "SALESMAN", 0, "", 300, 0, 30)
				);
		
		int n = session.insert("com.config.EmpMapper.insertDynamic", list);
		if(n > 0) System.out.println(n+"개 레코드 삽입 완료");
		
		
		List<Integer> list2 = Arrays.asList(9001,9002,9003,9004,9005);
		
		n = 0;
		n = session.delete("com.config.EmpMapper.deleteEmpnoDynamic", list2);
		if(n > 0) System.out.println(n+"개 레코드 삭제 완료");
		
		List<String> list3 = Arrays.asList("TURNER", "SMITH", "JONES");
		
		List<EmpDTO> empdto = session.selectList("com.config.EmpMapper.selectNameDynaic", list3);	
		for(EmpDTO e : empdto) {
			System.out.println(e);
		}
		
		EmpDTO dto = new EmpDTO();
		dto.setJob("SALESMAN");
		
		empdto = session.selectList("com.config.EmpMapper.selectIf", dto);
		
		for(EmpDTO e : empdto) {
			System.out.println(e);
		}
		
		System.out.println("SelectIf2");
		dto.setSal(800);
		
		empdto = session.selectList("com.config.EmpMapper.selectIf2", dto);
		
		for(EmpDTO e : empdto) {
			System.out.println(e);
		}
		
		EmpDTO dto2 = new EmpDTO();
		dto2.setEname("이순신");
		dto2.setSal(800);
		dto2.setEmpno(9000);
		dto2.setMgr(7902);
		
		n=0;
		n = session.update("com.config.EmpMapper.updateIf", dto2);
		if(n > 0) System.out.println(n+"개 레코드 수정 완료");
		
		
		System.out.println("SelectChoose");
		EmpDTO dto3 = new EmpDTO();
		dto3.setJob("salesman");
		dto3.setJob("clerk");
		empdto = session.selectList("selectChoose",dto3);
		
		for(EmpDTO e : empdto) {
			System.out.println(e);
		}
		
		//단일 컬럼 호출
		n = session.selectOne("com.config.EmpMapper.singleColumn");
		System.out.println(n);
		
		session.rollback();
		session.close();
	}

}
