package whileloops;

import java.util.Scanner;

public class NToOne {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=in.nextInt();
		int i=n;
		while(i>=1) {
			System.out.print(i);
			System.out.println();
			i--;
		}
		in.close();

	}

}
