package myprograms;

public class Test1 {

	public static void main(String[] args) {
		
		Test1 obj = new Test1();
		obj.display();
	}
	
	// final int speed;  // final variable will always be initialized as well as declare at the same time
	int speed;
	void display() {
		speed = 100;
		System.out.println(speed);
	}
}
