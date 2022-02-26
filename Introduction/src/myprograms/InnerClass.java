package myprograms;

class Outer{
	public int a = 10;
	public Outer() {
		System.out.println("Parent Constructor");
	}
}

public class InnerClass extends Outer {
	public InnerClass() {
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		
		Outer obj = new InnerClass(); // Polymorphism
		System.out.println(obj.a);

	}

}
