package com.arrays;

public class Employee 
{
	int id;
	String name;
	String address;
	Double salary;
	public Employee(int id, String name, String address, double salary)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary;
	}

}
