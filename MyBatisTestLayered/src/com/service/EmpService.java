package com.service;

import java.util.List;

import com.dao.EmpDAO;
import com.dto.EmpDTO;

public interface EmpService {

	public abstract void setDao(EmpDAO dao);
	List<EmpDTO> findAll();
	int insertComplete(EmpDTO dto);
	int delete(int empno);
	int update(EmpDTO dto);
	
}
