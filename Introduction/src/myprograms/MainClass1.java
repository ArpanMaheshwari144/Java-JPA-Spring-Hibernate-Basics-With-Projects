package myprograms;

import java.util.*;
public class MainClass1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number: ");
		float x = in.nextFloat();
		System.out.print("Enter second number: ");
		float y = in.nextFloat();
		float mySum = my_sum(x, y);
		float myDifference=my_difference(x, y);
		float myProduct = my_product(x, y);
		System.out.println("The addition of " + x + " and " + y + " is: " + mySum);
		System.out.println("The substraction of " + x + " and " + y + " is: " + myDifference);
		System.out.println("The product of " + x + " and " + y + " is: " + myProduct);
	}
	
	static float my_sum(float x, float y) {
		return x + y;
	}
	
	static float my_difference(float x, float y) {
		return x - y;
	}
	
	static float my_product(float x, float y) {
		return x * y;
	}

}
