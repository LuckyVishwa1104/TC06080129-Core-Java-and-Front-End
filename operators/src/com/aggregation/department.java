package com.aggregation;

import java.util.List;

import com.type_casting.student;

public class department {
	String name;
	List<student> students;
	
	public department(String name, List<student> students)
	{
		super();
		this.name=name;
		this.students=students;
	}
	public List<student> getStudents() {
		return students;
	}
	public void setStudents(List<student> students) {
		this.students = students;
	}
	
}
