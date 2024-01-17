package com.inheritance;

public class test_client_1 
{

	public static void main(String[] args)
	{
		// object of employee class
		employee em = new employee();
		
		// object of manager class
		manager mg = new manager();
		
		// accessing employee class data members
		System.out.println(em.name);
		System.out.println(em.id);
		System.out.println(em.dept);
		em.work();
		
		// accessing person class data members using em object
		System.out.println(em.gender);
		System.out.println(em.age);
		em.nationality();
		
		// accessing manager class data members
		System.out.println(mg.name);
		System.out.println(mg.id);
		mg.salary();
		
		// accessing person class data members using mg object
		System.out.println(mg.gender);
		System.out.println(mg.age);
		mg.nationality();
		
		// by using parent class object, can't access the data members of child class.
		person p = new person();
		System.out.println(p.age);

	}

}

// Code reusability
// inheritence provides memory efficiency
// faster execution speed
// 
