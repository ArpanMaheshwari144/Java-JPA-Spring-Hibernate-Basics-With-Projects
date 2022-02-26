package dowhileloop;

import java.util.Scanner;

public class TableOfNaturalNumberInStandardForm {

	public static void main(String[] args) {
	     
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number to print the table:");
		int n=in.nextInt();
		int i=1;
		do {
			System.out.print(n+ "*" +i+ "=" +n*i);
			System.out.println();
			i++;
		}while(i<=10);
		in.close();

	}

}
