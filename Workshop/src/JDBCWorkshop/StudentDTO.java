package JDBCWorkshop;

import java.util.Date;

public class StudentDTO {
	String student_no;
	String name;
	String student_ssn;
	String student_address;
	String entrance_date;
	String absence_yn;
	
	public StudentDTO() {
		// TODO Auto-generated constructor stub
	}
	public StudentDTO(String student_no, String name, String student_ssn, String student_address, String entrance_date,
			String absence_yn) {
		this.student_no = student_no;
		this.name = name;
		this.student_ssn = student_ssn;
		this.student_address = student_address;
		this.entrance_date = entrance_date;
		this.absence_yn = absence_yn;
	}
	public String getStudent_no() {
		return student_no;
	}
	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudent_ssn() {
		return student_ssn;
	}
	public void setStudent_ssn(String student_ssn) {
		this.student_ssn = student_ssn;
	}
	public String getStudent_address() {
		return student_address;
	}
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}
	public String getEntrance_date() {
		return entrance_date;
	}
	public void setEntrance_date(String entrance_date) {
		this.entrance_date = entrance_date;
	}
	public String getAbsence_yn() {
		return absence_yn;
	}
	public void setAbsence_yn(String absence_yn) {
		this.absence_yn = absence_yn;
	}
	@Override
	public String toString() {
		return student_no + "   " + name + "   " +
				student_ssn + "   " + student_address + "   " +
				entrance_date + "   " + absence_yn;
	}
	
}
