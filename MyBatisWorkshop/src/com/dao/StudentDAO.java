package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.StudentDTO;
import com.dto.StudentJoinDTO;

public class StudentDAO {
	public List<StudentDTO> list(SqlSession session) {
		return session.selectList("com.config.StudentMapper.list");
	}
	public List<StudentDTO> listByName(SqlSession session, StudentDTO dto) {
		return session.selectList("com.config.StudentMapper.listByName",dto);
	}
	
	public List<StudentDTO> selectList(SqlSession session, HashMap<String, String> map) {
		return session.selectList("com.config.StudentMapper.listByEntranceDate", map);
	}
	
	public List<StudentDTO> listByNoDynamic(SqlSession session, List<String> list) {
		return session.selectList("com.config.StudentMapper.listByNoDynamic", list);
	}

	public int updateAbsenceByNo(SqlSession session, List<String> list) {
	 	return session.update("com.config.StudentMapper.updateAbsenceByNo", list);
	}
	
	public int updateDeptCapacity(SqlSession session) {
		return session.update("com.config.StudentMapper.updateDeptCapacity");
	}
	
	public List<StudentJoinDTO> listWithGrade(SqlSession session, StudentDTO dto) {
		return session.selectList("com.config.StudentMapper.listWithGrade", dto);
	}
	
	public List<StudentDTO> listPaging(SqlSession session, int offset, int limit) {
		return session.selectList("com.config.StudentMapper.list", null, new RowBounds(offset, limit));
	}
	
	public int totalCount(SqlSession session) {
		return session.selectOne("totalCount");
	}
}
