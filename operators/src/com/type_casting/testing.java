package com.type_casting;
import java.util.ArrayList;
import java.util.List;
public class testing {

	public static void main(String[] args) {
		student s1 = new student("jhon",1104,"CSE");
		student s2 = new student("SHON",1105,"ENTC");
		student s3 = new student("jdhon",1106,"IT");
		student s4 = new student("khon",1107,"ENTC");
		student s5 = new student("ehon",1108,"IT");
		student s6 = new student("whon",1109,"CSE");
		
		List <student> CSE_stud = new ArrayList<student>();
		CSE_stud.add(s1);
		CSE_stud.add(s6);
		List <student> ENTC_stud = new ArrayList<student>();
		ENTC_stud.add(s2);
		ENTC_stud.add(s4);
		List <student> IT_stud = new ArrayList<student>();
		IT_stud.add(s3);
		IT_stud.add(s5);
		
		department CSE = new department("CSE",CSE_stud);
		department ENTC = new department("CSE",ENTC_stud);
		department IT = new department("CSE",IT_stud);
		
		List <department> departments = new ArrayList<department>();
		departments.add(CSE);
		departments.add(ENTC);
		departments.add(IT);
		
		institute inst = new institute("Stanford",departments);
		System.out.println("Total student in college = "+inst.student_count());

	}

} // student dept ints
