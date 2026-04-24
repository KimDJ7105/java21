import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.DeptJoinDTO;
import com.dto.Emp;
import com.dto.EmpJoinDTO;

public class EmpResultMapMain {

	public static void main(String[] args) {
		SqlSession session = MySqlSessionFactory.getSession();
		
		List<Emp> list = session.selectList("com.config.EmpMapper.findAll");
		
		for(Emp e : list)
		{
			System.out.println(e);
			//emp 의 변수명이  테이블의 컬럼명과 달라 값이 제대로 들어가지 않음
			//해결법 1 : sql문에서 as [emp의 변수명] 으로 컬럼명을 맞춰주면 된다.
			
		}
		list = session.selectList("com.config.EmpMapper.findAllToMap");
		System.out.println("////////////////////////////////");
		for(Emp e : list)
		{
			System.out.println(e);
			// 해결법 2: ResultMap을 통해서 결과값을 제대로 전달하도록
			//설정하여 해결할 수 있다.
		}
		
		
	    List<EmpJoinDTO> list2 = session.selectList("com.config.EmpMapper.empdeptJoin");
	    System.out.println("////////////////////////////////");
	    for(EmpJoinDTO e : list2)
		{
			System.out.println(e);
			//조인된 결과를 저장. 
			//Dept 정보는 EmpJoinDTO의 변수 DeptDTO dto에 저장
		}
		
	    List<DeptJoinDTO> list3 = session.selectList("com.config.DeptMapper.deptempJoin");
	    System.out.println("////////////////////////////////");
	    for(DeptJoinDTO e : list3)
		{
			System.out.println(e);
			//조인된 결과를 저장. 
			//Emp 정보는 DeptJoinDTO의 empList에 저장됨. 
		}
	    
	    
		session.close();
	}

}
