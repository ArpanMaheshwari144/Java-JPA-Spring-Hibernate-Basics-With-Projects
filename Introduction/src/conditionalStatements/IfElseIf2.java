package conditionalStatements;

import java.util.Scanner;

public class IfElseIf2 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=in.nextInt();
		System.out.println("Enter second number:");
		int b=in.nextInt();
		System.out.println("Enter third number");
		int c=in.nextInt();
		if(a>b && a>c)
		{
			System.out.println("Number is greatest " + a);
		}
		else if(b>c && b>a)
		{
			System.out.println("Number is greatest " + b);
		}
		else if(c>a && c>b)
		{
			System.out.println("Number is greatest " + c);
		}
		else
		{
			System.out.println("numbers are not greater");
		}
		in.close();
			

	}

}
