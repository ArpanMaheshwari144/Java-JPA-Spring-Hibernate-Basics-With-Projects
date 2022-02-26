package dowhileloop;

import java.util.Scanner;

public class NToOne {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n=in.nextInt();
		do {
			System.out.print(n);
			n--;
			System.out.println();
		}while(n>=1);
		in.close();
		

	}

}
