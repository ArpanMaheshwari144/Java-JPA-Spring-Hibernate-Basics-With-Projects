package oops;

class Cat{
	boolean hasFur;
	String name,color,breed;
	int legs,eyes;
	
	public void walk() {
		System.out.println("Cat is " + name + " Walking");
	}
	public void eat() {
		System.out.println("Cat is " + name + " Eating");
	}
	public void description(){
		System.out.println("My Cat "+ name +" has "+ legs +" legs and " + eyes + " eyes");
	}
	
}

class Dog{
	String breed,name;
	
	public void jump() {
		System.out.println("My Dog "+ name +" jumped");
	}
	public void eat() {
		System.out.println("My Dog "+ name + " is eating");
	}
	public void description() {
		System.out.println("my Dog's name is "+ name + " and it's breed is "+ breed);
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
		Cat ob1=new Cat();
		Cat ob2=new Cat();
		ob1.eyes=2;
		ob1.legs=4;
		ob1.name="Puffy";
		ob2.eyes=2;
		ob2.legs=4;
		ob2.name="Pussy";
		
		ob1.description();
		ob2.description();
		
		Dog ob3=new Dog();
		Dog ob4=new Dog();
		
		ob3.breed="Chutiya";
		ob3.name="Buso";
		ob4.breed="Bull Dog";
		ob4.name="Tuffy";
		
		ob3.jump();
		ob3.eat();
		ob4.jump();
		ob4.eat();
		
		ob3.description();
		ob4.description();
		

	}

}
