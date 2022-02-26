package conditionalStatements;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter first number:");
		int a=in.nextInt();
		System.out.println("enter second number:");
		int b=in.nextInt();
		System.out.println("enter the operation:");
		in.nextLine();//for string
		char operation=in.nextLine().charAt(0);
		int result=0;
		switch(operation) {
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;
			default:
				System.out.println("Invalid Operation");
				
		}
		
		System.out.println("the result is " + result);
		in.close();
		
			}

}
