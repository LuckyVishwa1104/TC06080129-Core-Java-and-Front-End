package com.others_practice;

public class employee 
{
	/* Employee
	   static- noemp=0;
	    Id, name, address, salary.
	    Parameterised constructor.
	     static display ();
	   toString(); */
	
	static int no_of_emp;
	int id;
	String name;
	String address;
	double salary;
	
	public employee(int id, String name, String address, double salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	static void display()
	{
		System.out.println("Total no of employee ="+no_of_emp);
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
	
	
}
