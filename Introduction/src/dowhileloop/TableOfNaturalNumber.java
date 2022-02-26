package dowhileloop;

import java.util.Scanner;

public class TableOfNaturalNumber {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a value of n to print the table:");
		int n=in.nextInt();
		int i=1;
		do {
			System.out.print(n*i);
			System.out.println();
			i++;
		}while(i<=10);
		in.close();
		

	}

}
