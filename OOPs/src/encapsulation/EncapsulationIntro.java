package encapsulation;

public class EncapsulationIntro {

	public static void main(String[] args) {
		
		Laptop l = new Laptop();
		l.setPrice(23);
		
		System.out.println(l.getPrice());
	}
	
	public void work() {
		System.out.println("Working");
	}
}

class Laptop{
	int ram;
	private int price;
	
	public void setPrice(int price) {
		boolean isAdmin = true;
		if(!isAdmin) {
			System.out.println("You cannot set the price bcoz you are not admin");
		} else {
			this.price = price;
		}
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}
	
	
}
