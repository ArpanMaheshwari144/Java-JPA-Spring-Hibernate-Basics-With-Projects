package oops;

class Vehicle2{
	int wheels;
	
	Vehicle2(int noOfWheels){
		wheels=noOfWheels;
	}
}

public class ParameterisedConstructor {
	
	ParameterisedConstructor(int a){
		System.out.println("this is my parameterised constructor!!");
	}

	public static void main(String[] args) {
		
		ParameterisedConstructor obj=new ParameterisedConstructor(2);
		Vehicle2 obj1=new Vehicle2(4);
		Vehicle2 obj2=new Vehicle2(2);
		Vehicle2 obj3=new Vehicle2(2);
		System.out.println("My car has "+obj1.wheels+" wheels");
		System.out.println("My bike has "+obj2.wheels+" wheels");
		System.out.println("My scooty has "+obj3.wheels+" wheels");
//		try {
//			obj.clone();
//			}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		System.out.println("ji");
		
	}

}
