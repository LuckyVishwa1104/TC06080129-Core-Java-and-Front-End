package com.abstraction;

public class test_client1 
{

	public static void main(String[] args) 
	{
		//bank b = new hdfc();
		hdfc b = new hdfc();
		b.gerroi();
		b.withdraw();
		b.deposite();
		b.manager_salary();
		
		icici f = new icici();
		f.gerroi();
		f.withdraw();
		f.deposite();
		f.emp_bonus();
		
	}

}
