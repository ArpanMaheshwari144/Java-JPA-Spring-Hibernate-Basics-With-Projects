package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a value:");
		int n=in.nextInt();
		int factorial=1;
		for(int i=n;i>=1;i--) {
			factorial=factorial*i;
		}
		System.out.println("Factorial of a given number is:"+factorial);
		in.close();

	}

}
