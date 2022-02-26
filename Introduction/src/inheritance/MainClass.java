package inheritance;

public class MainClass {

	public static void main(String[] args) {
		
//		Teacher t=new Teacher();
//		t.name="Harry Potter";
//		System.out.println("Teacher name is " + t.name);
//		t.eat();
//		t.walk();
//		t.teach();
//	    System.out.println("-------------------------------------------------");	
//		Singer s=new Singer();
//		s.name="Arijit Singh";
//		System.out.println("Singer name is " + s.name);
//		s.eat();
//		s.walk();
//		s.sing();
//		System.out.println("-------------------------------------------------");
//		Football f=new Football();
//		f.name="Lionel Messi";
//		System.out.println("Footballer name is " + f.name);
//		f.eat();
//		f.walk();
//		f.playfootball();
		
//		System.out.println("This is upcasting and downcasting!!");
		
//		Person p=t;//implicit cating or upcasting
		
//		Person p=new Person();
//		Teacher t=(Teacher)p;//downcasting it is wrong bcoz a person is always not teacher he can be singer,footballer etc.
		
//		Teacher t1=new Teacher("harry");
//		Singer s1=new Singer("harry"); 
//		Person p=t1;
//		Teacher t=(Teacher)p;
//		boolean yo=t1 instanceof Teacher;
//		System.out.println(t1 instanceof Teacher);
//		System.out.println(s1 instanceof Singer);
//		System.out.println(t1 instanceof Person);
//		System.out.println(t instanceof Person);
//		System.out.println(p instanceof Singer);
//		System.out.println(p instanceof Teacher);
//		
//		System.out.println("this is super keyword");
		
		Teacher t=new Teacher("Mr Harry");
		t.name="Mr Harry Potter";
		t.eat();
		Person.laughing();
		
		

	}

}
