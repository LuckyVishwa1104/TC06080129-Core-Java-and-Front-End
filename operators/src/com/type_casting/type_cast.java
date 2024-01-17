package com.type_casting;

public class type_cast 
{

	public static void main(String[] args) 
	{
		/* type casting - 
		 1). Narrowing/explicit  - when assgning larger size to smaller size datatype
		   double  float  long  int  short  byte
		 2). widening/implicit -  when assgning smaller size to larger size datatype
		 byte  short  int  long  float  double*/
		float f =20.33f;
		double d=456.4d;
		int a =(int)d;
		System.out.println(a);
		
		int e=344;
		float g=9.9f;
		long l=e;
		double p=g;
		System.out.println(l+" "+p);

	}
	/*Assosiation 
	  a).Aggregation - has a unidirectional relationship/ one way relation
	     can survive individually
	  b).Composition*/

}
