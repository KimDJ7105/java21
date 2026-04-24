package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("ClassDTO")
public class ClassDTO {
	String class_no;
	String department_no;
	String perattending_class_no;
	String class_name;
	String class_type;
	public ClassDTO() {
		// TODO Auto-generated constructor stub
	}
	public ClassDTO(String class_no, String department_no, String perattending_class_no, String class_name,
			String class_type) {
		this.class_no = class_no;
		this.department_no = department_no;
		this.perattending_class_no = perattending_class_no;
		this.class_name = class_name;
		this.class_type = class_type;
	}
	public String getClass_no() {
		return class_no;
	}
	public void setClass_no(String class_no) {
		this.class_no = class_no;
	}
	public String getDepartment_no() {
		return department_no;
	}
	public void setDepartment_no(String department_no) {
		this.department_no = department_no;
	}
	public String getPerattending_class_no() {
		return perattending_class_no;
	}
	public void setPerattending_class_no(String perattending_class_no) {
		this.perattending_class_no = perattending_class_no;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getClass_type() {
		return class_type;
	}
	public void setClass_type(String class_type) {
		this.class_type = class_type;
	}
	@Override
	public String toString() {
		return "ClassDTO [class_no=" + class_no + ", department_no=" + department_no + ", perattending_class_no="
				+ perattending_class_no + ", class_name=" + class_name + ", class_type=" + class_type + "]";
	}
	
	
}
