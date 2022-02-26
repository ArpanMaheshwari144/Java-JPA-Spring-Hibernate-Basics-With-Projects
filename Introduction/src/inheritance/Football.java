package inheritance;

public class Football extends Person {
	
	public Football(String name) {
		super(name);
	}
	
	public void playfootball() {
		System.out.println(name + " is playing football");
	}
	public void eat() {
		System.out.println("footballer " + name + " is eating");
	}
	public static void laughing() {
		System.out.println("footballer is laughing");
	}

}
