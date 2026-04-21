package JDBCWorkshop;

import java.util.Date;

public class GradeDTO {
	String term_no;
	String student_no;
	String student_name;
	String class_name;
	float point;
	String grade;
	
	public GradeDTO() {
		
	}
	
	
	public GradeDTO(String term_no, String student_no, String student_name, String class_name, float point,
			String grade) {
		this.term_no = term_no;
		this.student_no = student_no;
		this.student_name = student_name;
		this.class_name = class_name;
		this.point = point;
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


	public String getStudent_name() {
		return student_name;
	}


	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}


	public String getClass_name() {
		return class_name;
	}


	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}


	public float getPoint() {
		return point;
	}


	public void setPoint(float point) {
		this.point = point;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return term_no + "   " + student_no + "   " +
				student_name + "   " + class_name + "   " +
				point + "   " + grade;
	}
	
}
