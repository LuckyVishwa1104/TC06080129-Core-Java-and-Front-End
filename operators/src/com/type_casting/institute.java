package com.type_casting;
import java.util.List;
public class institute {
	String ins_name;
	List <department> dept;
	public institute(String ins_name, List<department> dept) {
		super();  // it
		this.ins_name = ins_name; // this = it refer to current instance or object
		this.dept = dept;	
	}
	public int student_count()  // getTotalStudentsInInstitute
	{
		int no_of_student=0;
		List <student> students;
		for (department dept_1:dept) {
			students = dept_1.getStudents();
			for (student stud:students)
			{
				no_of_student++;
			}
			
		}
		return no_of_student;
	}
}
