package io.workshop.domain;

public class Dog {
	//Syntax for declaring attributes there 
	//<modifier>* type name of attribute [=<initial value>];
	
	private int weight;
	//How do you declare method ?
	
	public int getWeight() {
		return weight;
	}
	
	public void  setWeight(int newWeight) {
		if(newWeight >0 ) {
			weight = newWeight;
		}
	}

}
