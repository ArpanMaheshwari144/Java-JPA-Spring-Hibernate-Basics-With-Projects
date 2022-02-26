package whileloops;

import java.util.Scanner;

public class SumandProducts {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=in.nextInt();
		int s=0,d,p=1;
		while(n>0) {
			d=n%10;
			s=s+d;
			p=p*d;
			n=n/10;
		}
		System.out.println("Sum of the number is " +s);
		System.out.println("Product of the number is " +p);
		in.close();
		

	}

}
