package whileloops;

import java.util.Scanner;

public class MystricalNumber {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=in.nextInt();
		int s=0,p=1,d;
		while(n>0) {
			d=n%10;
			s=s+d;
			p=p*d;
			n=n/10;
		}
		if(s==p) {
			System.out.println("Mystrical Number");
		}
		else {
			System.out.println("Not a Mystrical number");
		}
		in.close();

	}

}
