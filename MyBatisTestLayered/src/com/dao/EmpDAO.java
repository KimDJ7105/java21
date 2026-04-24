package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;

public class EmpDAO {
	public List<EmpDTO> findAll(SqlSession session) {
		return session.selectList("com.config.EmpMapper.findAll");
	}
	
	public int insertComplete(SqlSession session, EmpDTO dto) {
		return session.insert("com.config.EmpMapper.insertComplete", dto);
	}
	
	public int delete(SqlSession session, int empno) {
		return session.delete("com.config.EmpMapper.delete", empno);
	}
	
	public int update(SqlSession session, EmpDTO dto) {
		return session.update("com.config.EmpMapper.update", dto);
	}
}
