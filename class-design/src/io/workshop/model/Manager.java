package io.workshop.model;

public class Manager extends Employee{
	//public String name = "";
	//public double salary;
	//public Date birthDate;
	
	public String department;
	
	public String getDetails() {
		return "Name : "+"\n"+"Salary :"+salary;
		
	}
	
	
}
