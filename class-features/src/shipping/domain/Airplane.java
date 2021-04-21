package shipping.domain;

public class Airplane implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("Accelerate until lift-off raise landing gear");
		
	}

	@Override
	public void land() {
		System.out.println("Lower landing gear decelerate and lower flaps until touch-down apply brakes");
	}

	@Override
	public void fly() {
		System.out.println("Keep those engine running");
	}

}
