package com.inheritance;

public class test_client 
{

	public static void main(String[] args) 
	{
		java_tutor jt = new java_tutor();
		System.out.println(jt.college_name);
		System.out.println(jt.subject);
		System.out.println(jt.designation);
		jt.work();
		System.out.println(jt instanceof java_tutor);
		System.out.println(jt instanceof inherit);

	}

}
//  pers - super emp - sub  mang - sub
// one methos an d one variable
// obj of emp and manag
