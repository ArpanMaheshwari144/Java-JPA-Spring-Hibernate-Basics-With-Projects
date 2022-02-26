package conditionalStatements;

import java.util.Scanner;

public class IfElse3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a first number:");
		int a=in.nextInt();
		System.out.println("Enter a second number:");
		int b=in.nextInt();
		if(a>b)
		{
			System.out.println("number is greater");
		}
		else
		{
			System.out.println("number is smaller");
		}
		in.close();

	}

}
