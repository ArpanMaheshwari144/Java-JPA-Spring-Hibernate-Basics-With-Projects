package conditionalStatements;

import java.util.Scanner;

public class IfElseIf3 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter three sides of triangles:");
		int a =in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if(a==b && b==c && c==a)
		{
			System.out.println("Triangle is Equilateral");
		}
		else if(a==b || b==c || c==a)
		{
			System.out.println("Triangle is Isoscles");
		}
		else
		{
			System.out.println("Triangle is Scalar");
		}
		in.close();

	}

}
