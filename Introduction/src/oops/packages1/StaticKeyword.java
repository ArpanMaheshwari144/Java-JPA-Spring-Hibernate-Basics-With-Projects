package oops.packages1;

import oops.packages1.A.B;
import oops.packages1.A.C;

public class StaticKeyword {
	
	static {
		System.out.println("In First Block");
	}
	static {
		System.out.println("In Second Block");
	}
	public static void main(String[] args) {		
//		System.out.println(Math.PI);
//		System.out.println(Math.max(14, 13));
//		System.out.println(Math.abs(-1333));
		System.out.println(Person.breed);
		System.out.println("Inside main block");
		A objA=new A();
		B objB=objA.new B();
		System.out.println(objB.Main());
		C objC=new A.C();
		System.out.println(objC.Main());
	}	
	static {
		System.out.println("In Third Block");
	}
}
