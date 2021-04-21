package io.workshop.client;

import io.workshop.model.Employee;
import io.workshop.model.Engineer;
import io.workshop.model.Manager;

public class Program {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.name = "Javed";
		manager.salary=1000.00;
		//manager.birthDate="12-OCT-11986";
		
		
		System.out.println("Manager Name is :"+manager.name);
		System.out.println("Manager salary is :"+manager.salary);
		
		Employee[] staff = new Employee[5];
		staff[0] = new Manager();
		staff[1] = new Employee();
		staff[2] = new Engineer();
		
		
	}

}
