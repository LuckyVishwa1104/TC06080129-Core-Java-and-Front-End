package com.operators;

class Instance {}

public class ternary_operators extends Instance
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Instance ins = new ternary_operators()     ;
		int a,b;
		a=50*2;
		b=(a==100)?100:60;
		System.out.println(b);
		
		String name = "Lucky";
		boolean result=name instanceof String;
		System.out.println(result);
		
		boolean result_2=ins instanceof ternary_operators;
		System.out.println(result_2);
	}

}
