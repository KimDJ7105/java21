package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("GradeDTO")
public class GradeDTO {
	String term_no;
	String student_no;
	float point;
	ClassDTO classDto;
	String grade;
	
	public GradeDTO() {}

	public GradeDTO(String term_no, String student_no, float point, ClassDTO classDto, String grade) {
		this.term_no = term_no;
		this.student_no = student_no;
		this.point = point;
		this.classDto = classDto;
		this.grade = grade;
	}

	public String getTerm_no() {
		return term_no;
	}

	public void setTerm_no(String term_no) {
		this.term_no = term_no;
	}

	public String getStudent_no() {
		return student_no;
	}

	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}

	public ClassDTO getClassDto() {
		return classDto;
	}

	public void setClassDto(ClassDTO classDto) {
		this.classDto = classDto;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "GradeDTO [term_no=" + term_no + ", student_no=" + student_no + ", point=" + point + ", classDto="
				+ classDto + ", grade=" + grade + "]";
	}

	
}
