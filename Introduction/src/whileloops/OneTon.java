package whileloops;

import java.util.Scanner;

public class OneTon {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int i=1;
		System.out.print("Enter the value of n:");
		int n=in.nextInt();
		while(i<=n) {
			System.out.print(i);
			System.out.println();
			 i++;
			
		}
		in.close();

	}

}
