package whileloops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=in.nextInt();
		int d,r=0;
		while(n>0) {
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		System.out.println("Reverse of the number is " +r);
		in.close();

	}

}
