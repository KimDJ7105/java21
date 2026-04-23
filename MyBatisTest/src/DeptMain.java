import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.DeptDTO;


public class DeptMain {
	public static void main(String[] args) {
		SqlSession session = MySqlSessionFactory.getSession();
		
		DeptDTO dto = session.selectOne("com.config.DeptMapper.findByDeptno", 10);
		DeptDTO dto2 = session.selectOne("com.config.DeptMapper.findByDeptnoAndDname", new DeptDTO(20,"research", null));
		HashMap<String, Object> hashmap = new HashMap<String, Object>();
		hashmap.put("x",10);
		hashmap.put("y","ACCOUNTING");
		
		DeptDTO dto3 = session.selectOne("com.config.DeptMapper.findByDeptnoAndDnameMap", hashmap);
		
		System.out.println(dto);
		System.out.println(dto2);
		System.out.println(dto3);
		
		//다중행
		List<DeptDTO> dtolist = session.selectList("com.config.DeptMapper.findAll");
		List<DeptDTO> dtolist2 = session.selectList("com.config.DeptMapper.findByDnameOrDeptno", new DeptDTO(40, "ACCOUNTING", null));
		
		for(DeptDTO d: dtolist) {
			System.out.println(d);
		}
		
		System.out.println(dtolist2);
		
		dtolist = session.selectList("com.config.DeptMapper.findByDeptnoLess", 40);
		System.out.println(dtolist);
		dtolist = session.selectList("com.config.DeptMapper.findByDeptnoGreate", 40);
		System.out.println(dtolist);
		
		dtolist = session.selectList("com.config.DeptMapper.findByDeptnoLessCDATA", 40);
		System.out.println(dtolist);
		
		//Insert 
		int n = session.insert("com.config.DeptMapper.insert", new DeptDTO(80,"name","loc"));
		if(n > 0) System.out.println("삽입 성공");
		
		//update
		HashMap<String, Object> hashmap2 = new HashMap<String, Object>();
		hashmap2.put("dname", "지원");
		hashmap2.put("loc","세종");
		hashmap2.put("deptno",80);
		n = 0;
		n = session.update("com.config.DeptMapper.update", hashmap2);
		if(n > 0) System.out.println("수정 성공");
		
		//delete
		n = 0;
		n = session.delete("com.config.DeptMapper.delete", 80);
		if(n > 0) System.out.println("삭제 성공");
		
		//rollback
		//MyBatis는 auto commit이 아니다.
		//따라서 명시적으로 commit / rollback이 필요하다. 
		session.rollback();
		//자원 반납
		session.close();
	}
}
