package com.others;

public class garbage_collection_2 {
	protected void finalize () throws Throwable
	{
		System.out.println("Garbage collection.");

	}
	int data = 23; // instance
	static int num = 10;  // class variable or class variables  
	static public void method1()
	{
		int val = 20;  // local variable
	}

	public static void main(String[] args) {
		garbage_collection_2 g1 = new garbage_collection_2();
		
		garbage_collection_2 g2 = new garbage_collection_2();
		garbage_collection_2 g3 = new garbage_collection_2();
		g3=g2;
		g1=g2;
		System.gc();

		/*local - used within that method only, no static kw
		  instance - defined inside class and outside the method cannot be accessed outside
		  static - */		
		
	}

}
