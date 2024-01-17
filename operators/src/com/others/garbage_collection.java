package com.others;

public class garbage_collection {
	protected void finalize() throws Throwable
	{
		System.out.println("Garbage collection performed");
	}
	public static void main(String[] args) {
		garbage_collection s3 = new garbage_collection();
		s3=null;
		garbage_collection s1 = new garbage_collection();
		garbage_collection s2 = new garbage_collection();
		s2=s1;
		System.gc();
	

	}

}
