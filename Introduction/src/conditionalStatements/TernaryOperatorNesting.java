package conditionalStatements;

import java.util.Scanner;

public class TernaryOperatorNesting {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
		int result=0;
		result= a > b ? a > c ? a : c : b > c ? b : c ;
		System.out.println("Largest of the three number is " + result);
		in.close();

	}

}
