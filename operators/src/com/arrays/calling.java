package com.arrays;

public class calling 
{

	public static void main(String[] args) 
	{
		Employee[] emp = new Employee[5];
		emp[0]=new Employee(10014,"olive","UK",12000.00);
		emp[1]=new Employee(10324,"o0live","UK",13000.00);
		emp[2]=new Employee(10874,"ollive","UK",14000.00);
		emp[3]=new Employee(10304,"olnive","UK",15000.00);
		emp[4]=new Employee(11023,"harry","new york",199000.00);
		for (int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
	}
}
