package basics;

import encapsulation.EncapsulationIntro;

public class MainClass {

	public static void main(String[] args) {
		
//		Person p1 = new Person();
//		p1.age = 20;
//		p1.name = "Arpan";
		
//		Person p2 = new Person();
//		p2.age = 20;
//		p2.name = "Adarsh"; 
		
//		Person p3 = new Person(20, "Verma"); 
		
//		Person p4 = new Person(20, "Patra");
		
//		System.out.println(p1.age + " " + p1.name);
//		System.out.println(p2.age + " " + p2.name);
//		System.out.println(p3.age + " " + p3.name);
//		System.out.println(p4.age + " " + p4.name);
		
//		System.out.println(Person.count);
		
//		p1.walk();
//		p1.eat();
//		p1.walk(23);
		
//		p2.walk();
//		p2.eat();
//		p2.walk(25);
		
		// Polymorphism
//		Developer d = new Developer(20, "Arpan");
//		Person p = d;
//		p.eat();
//		p.walk();
//		p.walk(20);
//		p.work();
				
//		Developer d = new Developer(20, "Arpan");
//		d.eat();
//		d.walk();
//		d.walk(20);
//		d.work();
		
		EncapsulationIntro obj = new EncapsulationIntro();
		obj.work();
	}
}

class Person{
	String name;
	int age;
	
	static int count;
	
	// Default Constructor
	public Person() {
		count++;
		System.out.println("Creating an object");
	}
	
//	public Person(int newAge, String newName) {
//		this();
//		name = newName;
//		age = newAge;
//	}
	
	public Person(int age, String name) {
		this();
		this.name = name;
		this.age = age;
	}
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void walk(int steps) {
		System.out.println(name + " walked " + steps + " steps");
	}
	
	void work() {
		System.out.println("Person is working");
	}
}

class Developer extends Person{

	public Developer(int age, String name) {
		super(age, name);
	}
}


