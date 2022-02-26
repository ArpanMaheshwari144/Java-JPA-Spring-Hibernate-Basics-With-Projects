package programs;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=in.nextInt();
		System.out.println("Enter your name:");
		String name=in.next();
		System.out.println("Enter your percentage in semester one:");
		float sem1=in.nextFloat();
		System.out.println("Enter your percentage in semester two:");
		float sem2=in.nextFloat();
		System.out.println("Enter your percentage in semester three");
		float sem3=in.nextFloat();
		System.out.println("Enter your percentage in semester fourth ");
		float sem4=in.nextFloat();
		System.out.println("Name is " +name);
		System.out.println("Age is " +age);
		System.out.println("Percentage in semester one is " + sem1);
		System.out.println("Percentage in semester two is " + sem2);
		System.out.println("Percentage in semester three is " + sem3);
		System.out.println("Percentage in semester four is " + sem4);
		float avg=sem1+sem2+sem3+sem4/4;
		System.out.println("The Average is " + avg);
		in.close();
		
		
		

	}

}
