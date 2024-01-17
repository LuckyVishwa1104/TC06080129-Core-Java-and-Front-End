package com.others;
public class faculty {
	static int tot = 0;
	public static String total;
	int rn;
	String name;
	public faculty(int rn, String name)
	{
		this.rn=rn;
		this.name=name;
		tot = tot+1;
	}
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public class student {
		static int tot = 0;
		int rn;
		String name;
		public student(int rn, String name)
		{
			this.rn=rn;
			this.name=name;
			tot = tot+1;
		}
		public int getRn() {
			return rn;
		}
		public void setRn(int rn) {
			this.rn = rn;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
}
