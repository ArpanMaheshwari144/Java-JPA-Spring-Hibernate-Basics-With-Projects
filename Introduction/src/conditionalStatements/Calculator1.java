package conditionalStatements;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		String yn;	
		Scanner in=new Scanner(System.in);
		do
		{
		System.out.println("Enter first number:");
		int a=in.nextInt();
		System.out.println("Enter second number:");
		int b=in.nextInt();
		System.out.println("Select Symbol:");
		String sym=in.next();
		int result;
		switch(sym)
		{
		case "+":
		result=a+b;
		System.out.println("Addition is:"+result);
		break;
		case "-":
		result=a-b;
		System.out.println("Substraction is:"+result);
		break;
		case "*":
		result=a*b;
		System.out.println("Multiplication is:"+result);
		break;
		case "/":
		result=a/b;
		System.out.println("Division is:"+result);
		break;
		default:
		System.out.println("Wrong Symbol");
		break;
		}
		System.out.println("Do you want to continue(Press y for Yes and n for No)");
		yn=in.next();
		}
		while(yn.equals("y")||yn.equals("Y"));
		in.close();
	
		
	}
} 