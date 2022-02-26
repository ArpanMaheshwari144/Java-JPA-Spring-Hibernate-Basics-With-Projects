package euclidgcd;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = in.nextInt();
		System.out.print("Enter second number: ");
		int b = in.nextInt();
		
		int c = gcd(a, b);
		System.out.println("The greatest common divisor of " + a + " and " + b + " is " + c);
	}
	
	static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}
}
