package whileloops;

import java.util.Scanner;

public class TableOfNaturalNumberStandardForm {

	public static void main(String[] args) {
		 
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=in.nextInt();
		int i=1;
		while(i<=10) {
			System.out.print(n+" * "+i+" = "+n*i);
			System.out.println();
			i++;
		}
		in.close();

	}

}
