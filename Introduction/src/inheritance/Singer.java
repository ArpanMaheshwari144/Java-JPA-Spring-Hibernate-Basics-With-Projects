package inheritance;

public class Singer extends Person {
	
	public Singer(String name) {
		super(name);
	}
	
	public void sing() {
		System.out.println("Singer is singing");
	}
	public void eat() {
		System.out.println("singer " + name + " is eating");
	}
	public static void laughing() {
		System.out.println("singer is laughing");
	}

}
