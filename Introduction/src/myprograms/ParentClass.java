package myprograms;

public class ParentClass {

	public static void main(String[] args) {
		
//		Parent p = new Parent();
//		p.printHello();
		
//		Child c = new Child();
//		c.printHello();
		
		Parent p = new Child();
		p.printHello();
	}

}

class Parent{
	public void printHello() {
		System.out.println("Parent method");
	}
}

class Child extends Parent{
	public void printHello() {
		System.out.println("Child method");
	}
}