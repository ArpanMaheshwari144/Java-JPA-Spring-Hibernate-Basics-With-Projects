package oops;

class Vehicle4{
	
	int wheels;
	int headlights;
	String color;
	
	Vehicle4(){
		
	}
	
	Vehicle4(int wheels){
		this.wheels=wheels;
	}
	
	Vehicle4(int wheels,int headlights){
		this.wheels=wheels;
	    this.headlights=headlights;
		
	}
	Vehicle4(int wheels,int headlights,String color){
		this.wheels=wheels;
		this.color=color;
		this.headlights=headlights;
		
	}
	
}

public class ConstructorsOverloading {

	public static void main(String[] args) {
		
		Vehicle4 ob=new Vehicle4(4);
		Vehicle4 ob1=new Vehicle4(2);
		
		Vehicle4 obj=new Vehicle4(4,2);
		Vehicle4 obj1=new Vehicle4(2,1);
		Vehicle4 obj2=new Vehicle4(2,1);
		
		Vehicle4 obj3=new Vehicle4(3,1,"Yellow");
		Vehicle4 obj4=new Vehicle4(4,2,"Red");
		
		Vehicle4 obj5=new Vehicle4();
		
		System.out.println("My car has "+ob.wheels+" wheels");
		System.out.println("My bike has "+ob1.wheels+" wheels");
		
		System.out.println("My car has "+obj.wheels+" wheels and "+obj.headlights+" headlights");
		System.out.println("My bike has "+obj1.wheels+" wheels and "+obj1.headlights+" headlights");
		System.out.println("My scooty has "+obj2.wheels+" wheels and "+obj2.headlights+" headlights");
		
		System.out.println("My erickshaw has "+obj3.wheels+" wheels , "+obj3.color+" color and "+obj3.headlights+" headlights");
		System.out.println("My car has "+obj4.wheels+" wheels , "+obj4.color+" color and "+obj4.headlights+" headlights");
		
		System.out.println("My legs has "+obj5.wheels+" wheels");

	}

}
