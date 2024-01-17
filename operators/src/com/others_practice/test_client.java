package com.others_practice;

public class test_client
{

	public static void main(String[] args) 
	{
		/*  Create 5 emp objects.
Create one array of Employee type.
Add 5 created employee objects in the array.
Print how many total emps created.
Print all emps details by using for Each loo*/
		employee[] emp = new employee[5];
		emp[0] = new employee(23,"fd","ef",43.5);
		emp[1] = new employee(23,"fd","ef",43.5);
		emp[2] = new employee(23,"fd","ef",43.5);
		emp[3] = new employee(23,"fd","ef",43.5);
		emp[4] = new employee(23,"fd","ef",43.5);
		
		for (employee s:emp)
		{
			//System.out.println(emp[s]);
		}
		
		

	}

}
