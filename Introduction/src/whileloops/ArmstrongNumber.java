package whileloops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int i=in.nextInt();
		int s=0,n,d;
		n=i;
		while(n>0) {
			d=n%10;
			s=s+(d*d*d);
			n=n/10;
		}
		if(i==s) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not a armstrong number");
		}
		in.close();
		

	}

}
