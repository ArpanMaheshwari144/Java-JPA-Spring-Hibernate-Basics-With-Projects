package oops;

class Vehicle {
	int wheels;
	
	Vehicle(){
		wheels=4;
	}
	
}

public class NoArgumentConstructor {
	
	NoArgumentConstructor(){
		System.out.println("this is my no arguments constructor!!");
	}

	public static void main(String[] args) {
		
		NoArgumentConstructor obj=new NoArgumentConstructor();
		Vehicle car=new Vehicle();
		Vehicle car1=new Vehicle();
		Vehicle car2=new Vehicle();
//		car.wheels=4;  if constructors does not exists
//		car1.wheels=4;  if constructors does not exists
//		car2.wheels=4;  if constructors does not exists
		System.out.println(car.wheels+" wheels");
		System.out.println(car1.wheels+" wheels");
		System.out.println(car2.wheels+" wheels");
//		try {
//			obj.clone();
//			}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		System.out.println("ji");
//		

	}

}
