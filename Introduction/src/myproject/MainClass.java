package myproject;

public class MainClass {

	public static void main(String[] args) {
		Employee obj1 = new Employee();
		obj1.setId(1);
		obj1.setName("Arpan");
		System.out.println(obj1.getId());
		System.out.println(obj1.getName());
		
		Programmer obj2 = new Programmer();
		obj2.programmerLanguage("Java");
		
		MyClass1 obj3 = new MyClass2();  
		int mySum = obj3.sum(2, 3);
		System.out.println(mySum);
		
		MyMultiply obj4 = new MyMultiply();
		int myMul1 = obj4.Multiply(4, 5);
		System.out.println(myMul1);
		double myMul2 = obj4.Multiply(4.3,  4.66);
		System.out.println(myMul2);
		
		Parent obj5 = new SubClass1();
		obj5.Print();
		
		Parent obj6 = new SubClass2();
		obj6.Print();
	}

}

class Employee{
	private int id;
	private String name;
	
	public Employee() {
		System.out.println("Employee Constructor");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}

class Programmer extends Employee{
	public Programmer() {
		System.out.println("Programmer Constructor");
	}
	
	void programmerLanguage(String lang) {
		System.out.println("The Language of the Programmer is: " + lang);
	}
}

abstract class MyClass1{
	abstract int sum(int a, int b); 
}

class MyClass2 extends MyClass1{

	@Override
	int sum(int a, int b) {
		return a + b;
	}
	
}

class MyMultiply{
	
	 int Multiply(int a, int b) { 
	        return a * b; 
	 } 
	   
	 double Multiply(double a, double b) { 
	        return a * b; 
	 } 
}

class Parent { 
	  
    void Print() 
    { 
        System.out.println("Parent Class"); 
    } 
} 
  
class SubClass1 extends Parent { 
  
    void Print() 
    { 
        System.out.println("SubClass1"); 
    } 
} 
  
class SubClass2 extends Parent { 
  
    void Print() 
    { 
        System.out.println("SubClass2"); 
    } 
} 
