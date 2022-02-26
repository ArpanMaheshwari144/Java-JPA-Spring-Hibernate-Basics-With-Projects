package oops;

class Vehicle3{
	int wheels;
	
	Vehicle3(int wheels){
		this.wheels=wheels;
		
	}
}


public class ThisKeyword {

	public static void main(String[] args) {
		
		Vehicle3 obj=new Vehicle3(4);
		Vehicle3 obj1=new Vehicle3(2);
		System.out.println("My car has "+obj.wheels+" wheels");
		System.out.println("My bike has "+obj1.wheels+" wheels");

	}

}
