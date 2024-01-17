package com.conditional;

public class if_else {

	public static void main(String[] args) {
		int num = 100;
		if (num<150)
		{
			System.out.println("The number is less than 120");
		}
		if (num>50)
			System.out.println("The number is greater than 50");
		int b =50;
		if (70<b)
		{
			System.out.println("The number is lesserer than b");
		}
		else
		{
			System.out.println("The number is greater than 120");
		}
		
		int m = 90;
		switch(m)
		{
		case 99: 
			{
				System.out.println("Excellent!");
			}
		case 95: 
			{
				System.out.println("very Good!");
			}
		case 92:
		{
			System.out.println("Good.");
		}
		case 90:
		{
			System.out.println("Ok.");
		}
		case 85:
		{
			System.out.println("Try to improve!");
		}
		default:
		{
			System.out.println("Enter Marks?");
		}
		}
	}

}
