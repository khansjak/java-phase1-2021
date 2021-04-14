package io.workshop.test;

import io.workshop.domain.Dog;

public class testDoc {

	public static void main(String[] args) {
		Dog dog = new Dog(0);
		dog.setWeight(7);
		System.out.println("The dog weight is "+ dog.getWeight());

	}

}
