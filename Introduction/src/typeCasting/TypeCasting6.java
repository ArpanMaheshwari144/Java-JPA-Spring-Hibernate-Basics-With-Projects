package typeCasting;

public class TypeCasting6 {

	public static void main(String[] args) {
		
//		 int myInt = 9;
//		    double myDouble = myInt; // Automatic casting: int to double
//
//		    System.out.println(myInt);      // Outputs 9
//		    System.out.println(myDouble);   // Outputs 9.0
		
            int x=10;
            char y='a';  //ASCII value of a=97
            x=x+y;//automatic typecasting where char convert it into int 
            System.out.println(x);    // output 107
		
		    double myDouble = 9.78;
		    int myInt = (int) myDouble; // Manual casting: double to int

		    System.out.println(myDouble);   // Outputs 9.78
		    System.out.println(myInt);      // Outputs 9
	}

}
