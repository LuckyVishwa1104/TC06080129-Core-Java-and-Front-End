package com.others;

public class student
{
	int id;
	String name;
	String subject;
	int total =0;
	
	public student(int id, String name,String subject)
	{
		this.id=id;
		this.name=name;
		this.subject=subject;
		total=total+1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}