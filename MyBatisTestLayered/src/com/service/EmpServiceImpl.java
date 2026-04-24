package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpServiceImpl implements EmpService {
	EmpDAO dao;
	
	@Override
	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<EmpDTO> findAll() {
		SqlSession session = MySqlSessionFactory.getSession();
		
		try {
			return dao.findAll(session);
		} finally {
			//System.out.println("close 호출");
			session.close();
		}
		
		
		/*
		 try (SqlSession session = MySqlSessionFactory.getSession()) {
            return dao.findAll(session);
		 } // 최종 형태 
		 // SqlSession은 AutoCloseable 인터페이스를 상속받고 있으므로 다음과 같이 
		 // 작성하면 별도의 finally 블록 없이도 자동으로 session.close() 호출. 
		 */
	}
	
	@Override
	public int insertComplete(EmpDTO dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		
		try {
			return dao.insertComplete(session, dto);
		} finally {
			//session.commit();
			session.close();
		}
	}
	
	@Override
	public int delete(int empno) {
		SqlSession session = MySqlSessionFactory.getSession();
		
		try {
			return dao.delete(session, empno);
		} finally {
			//session.commit();
			session.close();
		}
	}
	
	@Override
	public int update(EmpDTO dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		
		try {
			return dao.update(session, dto);
		} finally {
			//session.commit();
			session.close();
		}
	}
}
