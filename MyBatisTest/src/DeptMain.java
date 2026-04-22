import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.DeptDTO;


public class DeptMain {
	public static void main(String[] args) {
		SqlSession session = MySqlSessionFactory.getSession();
		
		DeptDTO dto = session.selectOne("findByDeptno", 10);
		DeptDTO dto2 = session.selectOne("findByDeptnoAndDname", new DeptDTO(20,"research", null));
		HashMap<String, Object> hashmap = new HashMap<String, Object>();
		hashmap.put("x",10);
		hashmap.put("y","ACCOUNTING");
		
		DeptDTO dto3 = session.selectOne("findByDeptnoAndDnameMap", hashmap);
		
		System.out.println(dto);
		System.out.println(dto2);
		System.out.println(dto3);
		
		//다중행
		List<DeptDTO> dtolist = session.selectList("findAll");
		List<DeptDTO> dtolist2 = session.selectList("findByDnameOrDeptno", new DeptDTO(40, "ACCOUNTING", null));
		
		for(DeptDTO d: dtolist) {
			System.out.println(d);
		}
		
		System.out.println(dtolist2);
		//자원 반납
		session.close();
	}
}
