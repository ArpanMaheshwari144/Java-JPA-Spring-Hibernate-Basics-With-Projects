package abstraction;

public abstract class Car {
	
	public abstract void accelerate();   // abstract class ki body nhi hoti
	
	public abstract void breaking();
	
	public void honk() {
		System.out.println("Car is honking");
	}

}
