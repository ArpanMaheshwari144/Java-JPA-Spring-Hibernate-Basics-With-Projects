package programs;

import java.util.Scanner;

public class ProductOfNumbers {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=in.nextInt();
		System.out.println("Enter the second number:");
		int b=in.nextInt();
		int product=a*b;
		System.out.println("The result of two numbers is "+ product);
		in.close();
	}

}
