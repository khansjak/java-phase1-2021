package io.workshop.domain;

public class Dog {
	//Syntax for declaring attributes there 
	//<modifier>* type name of attribute [=<initial value>];
	
	private int weight;
	//How do you declare method ?
	
	public Dog(int i) {
		// TODO Auto-generated constructor stub
	}

	public int getWeight() {
		return weight;
	}
	
	public void  setWeight(int newWeight) {
		if(newWeight >0 ) {
			weight = newWeight;
		}
	}

	@Override
	public String toString() {
		return "Dog [weight=" + weight + "]";
	}

}
