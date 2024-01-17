package com.type_casting;
import java.util.List;
public class department {
	String name;
	List <student> students;
	public department(String name,List <student> students)
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
