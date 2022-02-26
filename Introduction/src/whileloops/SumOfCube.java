package whileloops;

import java.util.Scanner;

public class SumOfCube {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=in.nextInt();
		int s=0,d;
		while(n>0) {
			d=n%10;
			s=s+(d*d*d);
			n=n/10;
		}
		System.out.println("Sum of cube of its digits are " + s);
		in.close();
		
		

	}

}
