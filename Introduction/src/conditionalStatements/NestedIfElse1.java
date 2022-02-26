package conditionalStatements;

import java.util.Scanner;

public class NestedIfElse1 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if(a!=b && b!=c && c!=a)
		{
			System.out.println("Numbers are unequal");	
		if(a>b && b>c)
		{
			System.out.println("Number is greatest is " + a);
		}	
		else if(b>a && b>c)
		{
			System.out.println("Number is greatest is " + b);
		}
		else
		{
			System.out.println("Number is greatest is " + c);
		 }
		}
		else
		{
			System.out.println("Numbers are equal");
		}
		in.close();
		

	}

}
