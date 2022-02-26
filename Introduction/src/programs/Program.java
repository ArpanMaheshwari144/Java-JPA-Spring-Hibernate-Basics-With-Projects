package programs;

public class Program {

	public static void main(String[] args) {
		
		  int a = 5; 
	      int b = 7;
	      System.out.println("----------BITWISE OPERATORS------------------");
	      System.out.println("a&b = " + (a & b)); 
	      System.out.println("a|b = " + (a | b)); 
	      System.out.println("a^b = " + (a ^ b)); 
	      // bitwise and 
	      // ~0101=1010 
	      // will give 2's complement of 1010 = -6 
	      System.out.println("~a = " + ~a); //  Compiler will give 2’s complement of that number, i.e., 2’s compliment of 10 will be -6. 
	      System.out.println("a<<2 = " + (a << 2)); 
	      System.out.println("b>>2 = " + (b >> 2)); 
	      System.out.println("----------BITWISE OPERATORS------------------");
	      System.out.println("------------------------------------------------------");
	      
	      System.out.println("----------LOGICAL AND OPERATOR------------------");
	      int a1 = 10, b1 = 20, c1 = 20, d1 = 0; 
	       System.out.println("Var1 = " + a1); 
	       System.out.println("Var2 = " + b1); 
	       System.out.println("Var3 = " + c1);  
	       if ((a1 < b1) && (b1 == c1)) { 
	            d1 = a1+b1+c1; 
	            System.out.println("The sum is: " + d1); 
	        } 
	       else
	            System.out.println("False conditions"); 
	       System.out.println("----------LOGICAL AND OPERATOR------------------");
	       System.out.println("--------------------------------------------------------");
	       
	       
	       System.out.println("----------LOGICAL OR OPERATOR------------------");
	       int a2 = 10, b2 = 1, c2 = 10, d2 = 30; 
	        System.out.println("Var1 = " + a2); 
	        System.out.println("Var2 = " + b2); 
	        System.out.println("Var3 = " + c2); 
	        System.out.println("Var4 = " + d2); 
	        if (a2 > b2 || c2 == d2) 
	            System.out.println("One or both" + " the conditions are true"); 
	        else
	            System.out.println("Both the" + " conditions are false"); 
	        System.out.println("----------LOGICAL OR OPERATOR------------------");
	        System.out.println("-------------------------------------------------------------");
	        
	        System.out.println("----------LOGICAL NOT OPERATOR------------------");
	        int a3 = 10, b3 = 1; 
	        System.out.println("Var1 = " + a3); 
	        System.out.println("Var2 = " + b3); 
	        System.out.println("!(a3 < b3) = " + !(a3 < b3)); 
	        System.out.println("!(a3 > b3) = " + !(a3 > b3));
	        System.out.println("----------LOGICAL NOT OPERATOR------------------");
	}
}
	        
	        