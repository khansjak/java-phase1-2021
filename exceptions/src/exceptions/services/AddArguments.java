package exceptions.services;

import java.util.Iterator;

public class AddArguments {
	public static void main(String args[]) {
		int sum = 0;
		for(String element : args) {
			try {
				sum+=Integer.parseInt(element);
			} catch (NumberFormatException e) {
				System.out.println("["+element+"] is not an integer and wont be included in sum");
			}
		}
	
		System.out.println("Sum ="+sum);
	}

}
