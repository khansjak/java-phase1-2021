package io.workshop.test;

import io.workshop.domain.Dog;

public class PassTestReference {
	public static void main(String args[]) {
		//Assign the dog
		Dog d = new Dog(120);
		
		//try to change it 
		changeObjectRef(d);
		
		System.out.println("Dog weight "+ d );
	}

	private static void changeObjectRef(Dog d) {
		//d = new Dog(220); 
		d.setWeight(400);
		//Changing the ref value
		return;
		
	}
	

}
