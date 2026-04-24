package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.StudentDAO;
import com.dto.StudentDTO;
import com.dto.StudentJoinDTO;

public class StudentServiceImpl implements StudentService {
	
	StudentDAO dao;
	
	@Override
	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<StudentDTO> list() {
		try (SqlSession session = MySqlSessionFactory.getSession()){
			return dao.list(session);
		}
	}
	
	@Override
	public List<StudentDTO> listByName(StudentDTO dto) {
		try (SqlSession session = MySqlSessionFactory.getSession()){
			return dao.listByName(session, dto);
		}
	}
	
	@Override
	public List<StudentDTO> selectList(HashMap<String, String> map) {
		try (SqlSession session = MySqlSessionFactory.getSession()){
			return dao.selectList(session, map);
		}
	}
	
	@Override
	public List<StudentDTO> listByNoDynamic(List<String> list) {
		try (SqlSession session = MySqlSessionFactory.getSession()){
			return dao.listByNoDynamic(session, list);
		}
	}
	
	@Override
	public int updateAbsenceByNo(List<String> list) {
		try (SqlSession session = MySqlSessionFactory.getSession()){
			return dao.updateAbsenceByNo(session, list);
		}
	}
	
	@Override
	public int updateDeptCapacity() {
		try (SqlSession session = MySqlSessionFactory.getSession()){
			return dao.updateDeptCapacity(session);
		}
	}

	
	@Override
	public List<StudentJoinDTO> listWithGrade(StudentDTO dto) {
		try (SqlSession session = MySqlSessionFactory.getSession()){
			return dao.listWithGrade(session, dto);
		}
	}
}
