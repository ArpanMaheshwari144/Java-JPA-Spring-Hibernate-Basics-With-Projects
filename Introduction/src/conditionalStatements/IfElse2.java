package conditionalStatements;

import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=in.nextInt();
		if(a%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		in.close();
		

	}

}
