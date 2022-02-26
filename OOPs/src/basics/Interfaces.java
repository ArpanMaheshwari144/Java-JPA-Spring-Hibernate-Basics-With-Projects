package basics;

public class Interfaces implements Car1, Person1 {

	public static void main(String[] args) {
		
		Interfaces obj = new Interfaces();
		obj.start();
		obj.walk();

	}

	@Override
	public void start() {
		System.out.println("Car is starting");
	}

	@Override
	public void walk() {
		System.out.println("Person is walking");
	}
}

interface Car1{
	
	void start(); // all the methods inside interfaces are public abstract
}

interface Person1{
	
	void walk();
}
