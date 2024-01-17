package com.aggregation;

import java.util.List;

import com.type_casting.department;
import com.type_casting.student;

public class institute {
	String name;
	List<department> departments;
	
	public institute(String name, List<department> departments)
	{
		this.name=name;
		this.departments=departments;
	}
	
	public int total_student()
	{
		int no_of_student=0;
		List <student> students;
		for (department dept_1:departments) 
		{
			students = dept_1.getStudents();
			for (student stud:students)
			{
				no_of_student++;
			}
			
		}
		return no_of_student;
	}

}
