package com.service;

import java.util.HashMap;
import java.util.List;

import com.dao.StudentDAO;
import com.dto.StudentDTO;
import com.dto.StudentJoinDTO;

public interface StudentService {

	void setDao(StudentDAO dao);

	List<StudentDTO> list();

	List<StudentDTO> listByName(StudentDTO dto);

	List<StudentDTO> selectList(HashMap<String, String> map);

	List<StudentDTO> listByNoDynamic(List<String> list);

	int updateAbsenceByNo(List<String> list);

	int updateDeptCapacity();

	List<StudentJoinDTO> listWithGrade(StudentDTO dto);

}
