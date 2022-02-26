package basics;

public class Abstraction {

	public static void main(String[] args) {
		
		Audi a = new Audi();
		a.start();
		a.breaks();
		
		BMW b = new BMW();
		b.start();
		b.breaks();
	}
}

abstract class Car{
	
	int price;
	abstract void start();
	
	// Concrete methods
	void breaks() {
		System.out.println("Car is applying breaks");
	}
}

class Audi extends Car{

	@Override
	void start() {
		System.out.println("Audi is starting");
	}
}

class BMW extends Car{
	
	@Override
	void start() {
		System.out.println("BMW is starting");
	}
}
