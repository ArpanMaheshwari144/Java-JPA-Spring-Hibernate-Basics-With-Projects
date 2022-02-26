package programs;

import java.util.Scanner;

public class Factorial {
	
		static int factorial(int n) {
	        if (n == 0) 
	          return 1; 
	          
	        return n*factorial(n-1); 
	    }
	    public static void main(String[] args){
	        Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter a Number!!");
	        int n = scanner.nextInt();
	        System.out.println(factorial(n));
	        scanner.close();
	    }
}
