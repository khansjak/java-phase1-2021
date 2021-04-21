package io.workshop.model;

import java.util.Date;

public class Employee {
	
	public  String name = "";
	public double salary;
	public Date birthDate;
	
	//define a method to retrive a details from protected class 
	 public String getDetails() {
		 return "Name : "+name+"\n"+
				 "Salary :"+salary;
	 }
	

}
